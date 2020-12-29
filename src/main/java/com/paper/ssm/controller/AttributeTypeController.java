package com.paper.ssm.controller;

import com.paper.ssm.dao.AttributeTypeDao;
import com.paper.ssm.entity.AttributeType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (AttributeType)表控制层
 *
 * @author makejava
 * @since 2020-12-29 20:53:28
 */
@RestController
@RequestMapping("attributeType")
public class AttributeTypeController {
    /**
     * 服务对象
     */
    @Resource
    private AttributeTypeDao attributeTypeDao;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public AttributeType selectOne(Long id) {
        return this.attributeTypeDao.queryById(id);
    }

}