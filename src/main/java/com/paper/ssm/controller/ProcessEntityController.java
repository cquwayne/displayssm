package com.paper.ssm.controller;

import com.paper.ssm.dao.*;
import com.paper.ssm.entity.EntityElementData;
import com.paper.ssm.entity.Line;
import com.paper.ssm.entity.Node;
import com.paper.ssm.entity.ProcessEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
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
        if (this.processEntityDao.queryById(processEntity.getId())!=null) {
            if (this.updateOne(processEntity)!=null){
                return 1;
            } else {
                return 0;
            }
        }
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
    public ProcessEntity updateOne(@RequestBody ProcessEntity processEntity) {
        if (this.processEntityDao.update(processEntity)==1) {
            return this.processEntityDao.queryById(processEntity.getId());
        } else {
            return null;
        }
    }



}