package com.paper.ssm.controller;

import com.paper.ssm.dao.ElementDao;
import com.paper.ssm.entity.Element;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (Element)表控制层
 *
 * @author makejava
 * @since 2020-12-29 20:53:27
 */
@RestController
@RequestMapping("element")
public class ElementController {
    /**
     * 服务对象
     */
    @Resource
    private ElementDao elementDao;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Element selectOne(Long id) {
        return this.elementDao.queryById(id);
    }

}