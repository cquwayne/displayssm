package com.paper.ssm.controller;

import com.paper.ssm.dao.*;
import com.paper.ssm.entity.EntityElementData;
import com.paper.ssm.entity.Line;
import com.paper.ssm.entity.Node;
import com.paper.ssm.entity.ProcessEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

/**
 * (ProcessEntity)表控制层
 *
 * @author makejava
 * @since 2021-01-29 11:23:48
 */
@CrossOrigin
@RestController
@RequestMapping("processEntity")
public class ProcessEntityController {
    /**
     * 服务对象
     */
    @Resource
    private ProcessEntityDao processEntityDao;

    @Resource
    private NodeDao nodeDao;

    @Resource
    private LineDao lineDao;

    @Resource
    private ModelEntityDao modelEntityDao;

    @Resource
    private EntityElementDataDao entityElementDataDao;

    int once = 1;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("")
    public ProcessEntity selectOne(@RequestParam String id) {
        return this.processEntityDao.queryById(id);
    }

    @PostMapping("")
    @Transactional
    public int postOne(@RequestBody ProcessEntity processEntity) {
        if (this.processEntityDao.queryById(processEntity.getId())!=null&&once==1) {
            return this.updateOne(processEntity);
        }
        once = 1;
        int flag0,flag1=0,flag2=0,flag3=0,flag4=0;
        flag0 = this.processEntityDao.insert(processEntity);
        List<Node> nodes = processEntity.getNodeList();
        List<Line> lines = processEntity.getLineList();
        if (nodes!=null) {
            for (int i=0;i<nodes.size();i++) {
                flag1 = this.nodeDao.insert(nodes.get(i));
                flag2 = this.modelEntityDao.insert(nodes.get(i).getModelEntity());
                List<EntityElementData> entityElementDataList = nodes.get(i).getModelEntity().getEntityElementDataList();
                if (entityElementDataList!=null) {
                    for (int j=0;j<entityElementDataList.size();j++) {
                        flag3 = this.entityElementDataDao.insert(entityElementDataList.get(j));
                    }
                }
            }
        }
        if (lines!=null) {
            for (int i=0;i<lines.size();i++) {
                flag4 = this.lineDao.insert(lines.get(i));
            }
        }
        if(flag0==1&&flag1==1&&flag2==1&&flag3==1&&flag4==1) {
            return 1;
        } else {
            return 0;
        }

    }

    @PutMapping("")
    @Transactional
    public int updateOne(@RequestBody ProcessEntity processEntity) {
        ProcessEntity tmpEntity = this.processEntityDao.queryById(processEntity.getId());
        this.processEntityDao.deleteById(tmpEntity.getId());
        List<Node> nodes = tmpEntity.getNodeList();
        for (int i=0;i<nodes.size();i++) {
            Node tmp = nodes.get(i);
            this.nodeDao.deleteById(tmp.getId());
            this.modelEntityDao.deleteById(tmp.getModelEntity().getId());
            this.entityElementDataDao.deleteById(tmp.getModelEntity().getId());
        }
        List<Line> lines = tmpEntity.getLineList();
        for (int i=0;i<lines.size();i++) {
            Line tmp = lines.get(i);
            this.lineDao.deleteById(tmp.getId());
        }
        once = 0;
        return this.postOne(processEntity);
//        if (this.processEntityDao.update(processEntity)==1) {
//            List<Node> nodes = processEntity.getNodeList();
//            for (int i=0;i<nodes.size();i++) {
//                Node tmp = nodes.get(i);
//                if (this.nodeDao.queryById(tmp.getId())!=null){
//                    if (this.nodeDao.update(tmp)==1) {
//                        ModelEntity modelEntity = tmp.getModelEntity();
//                        this.modelEntityDao.update(modelEntity);
//                        List<EntityElementData> entityElementDataList = tmp.getModelEntity().getEntityElementDataList();
//                        for (int k=0;k<entityElementDataList.size();k++) {
//                            EntityElementData entityElementDataTmp = entityElementDataList.get(k);
//
//                        }
//                    }
//                } else {
//                    this.nodeDao.insert(tmp);
//                    this.modelEntityDao.insert(tmp.getModelEntity());
//                }
//            }
//            List<Line> lines = processEntity.getLineList();
//            for (int i=0;i<lines.size();i++) {
//                Line tmp = lines.get(i);
//                if (this.lineDao.queryById(tmp.getId())!=null){
//                    this.lineDao.update(tmp);
//                } else {
//                    this.lineDao.insert(tmp);
//                }
//            }
//            return this.processEntityDao.queryById(processEntity.getId());
//        } else {
//            return null;
//        }
    }

    @GetMapping("/compute")
    public void computeModel(@RequestParam String id) throws Exception {

        String[] args1 = new String[] { "python", "D:\\PycharmProjects\\pythonProject\\predict.py", id};
        Process proc = Runtime.getRuntime().exec(args1);
        // 用输入输出流来截取结果
        BufferedReader in = new BufferedReader(new InputStreamReader(proc.getInputStream()));
        String line = null;
        while ((line = in.readLine()) != null) {
            if (line.equals("finish")) {

            }
        }
        in.close();
        proc.waitFor();
    }



}