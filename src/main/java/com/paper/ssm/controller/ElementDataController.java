package com.paper.ssm.controller;

import com.paper.ssm.dao.ElementDataDao;
import com.paper.ssm.entity.ElementData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (ElementData)表控制层
 *
 * @author makejava
 * @since 2020-12-29 20:53:30
 */
@RestController
@RequestMapping("elementData")
public class ElementDataController {
    /**
     * 服务对象
     */
    @Resource
    private ElementDataDao elementDataDao;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public ElementData selectOne(Long id) {
        return this.elementDataDao.queryById(id);
    }

}