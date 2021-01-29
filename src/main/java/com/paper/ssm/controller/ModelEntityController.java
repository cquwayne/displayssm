package com.paper.ssm.controller;

import com.paper.ssm.dao.ModelEntityDao;
import com.paper.ssm.entity.ModelEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (ModelEntity)表控制层
 *
 * @author makejava
 * @since 2021-01-29 11:23:45
 */

@CrossOrigin
@RestController
@RequestMapping("modelEntity")
public class ModelEntityController {
    /**
     * 服务对象
     */
    @Resource
    private ModelEntityDao modelEntityDao;

    /**
     * 通过主键查询单条数据
     *
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public ModelEntity selectOne(@RequestParam String id) {
        return this.modelEntityDao.queryById(id);
    }

}