package com.paper.ssm.controller;

import com.paper.ssm.dao.LineDao;
import com.paper.ssm.entity.Line;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (Line)表控制层
 *
 * @author makejava
 * @since 2021-01-29 11:23:43
 */
@CrossOrigin
@RestController
@RequestMapping("line")
public class LineController {
    /**
     * 服务对象
     */
    @Resource
    private LineDao lineDao;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Line selectOne(String id) {
        return this.lineDao.queryById(id);
    }

}