package com.paper.ssm.controller;

import com.paper.ssm.dao.LineDao;
import com.paper.ssm.dao.NodeDao;
import com.paper.ssm.dao.SceneDataDao;
import com.paper.ssm.entity.Line;
import com.paper.ssm.entity.Node;
import com.paper.ssm.entity.SceneData;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (SceneData)表控制层
 *
 * @author makejava
 * @since 2021-04-16 19:41:26
 */
@CrossOrigin
@RestController
@RequestMapping("sceneData")
public class SceneDataController {
    /**
     * 服务对象
     */
    @Resource
    private SceneDataDao sceneDataDao;
    @Resource
    private SceneDataController sceneDataController;
    @Resource
    private NodeDao nodeDao;
    @Resource
    private LineDao lineDao;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("")
    public SceneData selectOne(@RequestParam String id) {
        return this.sceneDataDao.queryById(id);
    }
    @GetMapping("list")
    public List<SceneData> selectAll() {
        return this.sceneDataDao.queryAll();
    }

    @PostMapping("/{id}")
    public int insertSceneData(SceneData sceneData) {

        List<Node> nodes = sceneData.getNodeList();
        List<Line> lines = sceneData.getLineList();
        if (nodes!=null) {
            for (int i=0;i<nodes.size();i++) {
                this.nodeDao.insert(nodes.get(i));
                this.sceneDataController.insertSceneData(nodes.get(i).getSceneData());
            }
            for (int j=0;j< lines.size();j++) {
                this.lineDao.insert(lines.get(j));
            }
        }
         return this.sceneDataDao.insert(sceneData);
    }

    @PutMapping("/{id}")
    public int updateSceneData(SceneData sceneData) {
        this.sceneDataController.deleteSceneData(sceneData);
        return this.sceneDataController.insertSceneData(sceneData);
    }

    @DeleteMapping("/{id}")
    public int deleteSceneData(SceneData sceneData) {
        List<Node> nodes = sceneData.getNodeList();
        List<Line> lines = sceneData.getLineList();
        if (nodes!=null) {
            for (int i=0;i<nodes.size();i++) {
                this.nodeDao.deleteBySceneDataId(nodes.get(i).getSceneDataId());
                this.sceneDataController.deleteSceneData(nodes.get(i).getSceneData());
            }
            for (int j=0;j<lines.size();j++) {
                this.lineDao.deleteSceneDataId(lines.get(j).getSceneDataId());
            }
        }
        return this.sceneDataDao.deleteById(sceneData.getId());
    }
}