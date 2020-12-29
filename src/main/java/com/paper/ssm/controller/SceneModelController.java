package com.paper.ssm.controller;

import com.paper.ssm.dao.SceneModelDao;
import com.paper.ssm.entity.SceneModel;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (SceneModel)表控制层
 *
 * @author makejava
 * @since 2020-12-29 20:53:30
 */
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
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/{id}")
    public SceneModel selectOne(@PathVariable Long id) {
        return this.sceneModelDao.queryById(id);
    }

}