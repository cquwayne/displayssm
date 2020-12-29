package com.paper.ssm.controller;

import com.paper.ssm.dao.AttributeDao;
import com.paper.ssm.entity.Attribute;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (Attribute)表控制层
 *
 * @author makejava
 * @since 2020-12-29 20:53:27
 */
@RestController
@RequestMapping("attribute")
public class AttributeController {
    /**
     * 服务对象
     */
    @Resource
    private AttributeDao attributeDao;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Attribute selectOne(Long id) {
        return this.attributeDao.queryById(id);
    }

}