package com.paper.ssm.controller;

import com.paper.ssm.entity.Condition;
import com.paper.ssm.dao.ConditionDao;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (Condition)表控制层
 *
 * @author makejava
 * @since 2021-03-18 00:27:58
 */
@CrossOrigin
@RestController
@RequestMapping("condition")
public class ConditionController {
    /**
     * 服务对象
     */
    @Resource
    private ConditionDao conditionService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Condition selectOne(Integer id) {
        return this.conditionService.queryById(id);
    }

}