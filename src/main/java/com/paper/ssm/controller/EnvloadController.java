package com.paper.ssm.controller;

import com.paper.ssm.dao.EnvloadDao;
import com.paper.ssm.entity.Envload;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (Envload)表控制层
 *
 * @author makejava
 * @since 2021-03-18 00:28:00
 */
@CrossOrigin
@RestController
@RequestMapping("envload")
public class EnvloadController {
    /**
     * 服务对象
     */
    @Resource
    private EnvloadDao envloadService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Envload selectOne(Integer id) {
        return this.envloadService.queryById(id);
    }

}