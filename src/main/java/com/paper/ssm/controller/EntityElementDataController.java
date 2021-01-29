package com.paper.ssm.controller;

import com.paper.ssm.dao.EntityElementDataDao;
import com.paper.ssm.entity.EntityElementData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (EntityElementData)表控制层
 *
 * @author makejava
 * @since 2021-01-29 16:05:08
 */
@RestController
@RequestMapping("entityElementData")
public class EntityElementDataController {
    /**
     * 服务对象
     */
    @Resource
    private EntityElementDataDao entityElementDataDao;

    /**
     * 通过主键查询单条数据
     *
     * @param modelEntityId 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public EntityElementData selectOne(String modelEntityId) {
        return this.entityElementDataDao.queryByModelEntityId(modelEntityId);
    }

}