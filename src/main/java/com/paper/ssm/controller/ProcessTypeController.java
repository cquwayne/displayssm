package com.paper.ssm.controller;

import com.paper.ssm.dao.ProcessTypeDao;
import com.paper.ssm.entity.ProcessType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (ProcessType)表控制层
 *
 * @author makejava
 * @since 2020-12-29 20:53:29
 */
@RestController
@RequestMapping("processType")
public class ProcessTypeController {
    /**
     * 服务对象
     */
    @Resource
    private ProcessTypeDao processTypeDao;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public ProcessType selectOne(Long id) {
        return this.processTypeDao.queryById(id);
    }

}