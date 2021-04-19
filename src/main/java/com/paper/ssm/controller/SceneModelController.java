package com.paper.ssm.controller;

import com.paper.ssm.dao.SceneModelDao;
import com.paper.ssm.entity.SceneModel;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (SceneModel)表控制层
 *
 * @author makejava
 * @since 2021-04-19 15:16:30
 */
@CrossOrigin
@RestController
@RequestMapping("sceneModel")
public class SceneModelController {
    /**
     * 服务对象
     */
    @Resource
    private SceneModelDao sceneModelDao;

    /**
     * 通过主键查询单条数据
     *
     * @return 单条数据
     */
    @GetMapping("/{id}")
    public SceneModel selectOne(@PathVariable Integer id) {
        return this.sceneModelDao.queryById(id);
    }

    @GetMapping("list")
    public List<SceneModel> selectAll() {
        return this.sceneModelDao.queryAll();
    }

}