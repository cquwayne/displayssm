package com.paper.ssm.controller;

import com.paper.ssm.dao.AttributeMetadataDao;
import com.paper.ssm.entity.AttributeMetadata;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (AttributeMetadata)表控制层
 *
 * @author makejava
 * @since 2020-12-29 20:53:29
 */
@CrossOrigin
@RestController
@RequestMapping("attributeMetadata")
public class AttributeMetadataController {
    /**
     * 服务对象
     */
    @Resource
    private AttributeMetadataDao attributeMetadataDao;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public AttributeMetadata selectOne(Long id) {
        return this.attributeMetadataDao.queryById(id);
    }

}