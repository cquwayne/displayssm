package com.paper.ssm.controller;

import com.paper.ssm.dao.EnvLoadDao;
import com.paper.ssm.entity.EnvLoad;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 基础表_基础环境负荷表(EnvLoad)表控制层
 *
 * @author makejava
 * @since 2021-04-18 20:31:57
 */
@CrossOrigin
@RestController
@RequestMapping("envLoad")
public class EnvLoadController {
    /**
     * 服务对象
     */
    @Resource
    private EnvLoadDao envLoadDao;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public EnvLoad selectOne(Integer id) {
        return this.envLoadDao.queryById(id);
    }

    @GetMapping("list")
    public List<EnvLoad> selectAll() {
        return this.envLoadDao.queryAll();
    }

}