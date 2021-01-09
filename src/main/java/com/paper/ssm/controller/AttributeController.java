package com.paper.ssm.controller;

import com.paper.ssm.dao.AttributeDao;
import com.paper.ssm.entity.Attribute;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Attribute)表控制层
 *
 * @author makejava
 * @since 2020-12-29 20:53:27
 */
@CrossOrigin
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

    @PostMapping
    public int Insert(@RequestBody Attribute attribute) {
        return this.attributeDao.insert(attribute);
    }

    @GetMapping("list")
    public List<Attribute> selectListByEleId(@RequestParam Long eleId) {
        return this.attributeDao.queryByEleId(eleId);
    }
}