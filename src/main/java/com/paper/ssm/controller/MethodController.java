package com.paper.ssm.controller;

import com.paper.ssm.entity.Method;
import com.paper.ssm.dao.MethodDao;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (Method)表控制层
 *
 * @author makejava
 * @since 2021-03-18 00:28:02
 */
@CrossOrigin
@RestController
@RequestMapping("method")
public class MethodController {
    /**
     * 服务对象
     */
    @Resource
    private MethodDao methodService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Method selectOne(Integer id) {
        return this.methodService.queryById(id);
    }

}