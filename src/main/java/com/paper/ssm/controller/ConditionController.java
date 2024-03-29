package com.paper.ssm.controller;

import com.paper.ssm.dao.ConditionDao;
import com.paper.ssm.entity.Condition;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Condition)表控制层
 *
 * @author makejava
 * @since 2021-03-21 15:28:13
 */
@RestController
@RequestMapping("condition")
public class ConditionController {
    /**
     * 服务对象
     */
    @Resource
    private ConditionDao conditionDao;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Condition selectOne(Integer id) {
        return this.conditionDao.queryById(id);
    }

    @GetMapping("list")
    public List<Condition> queryAll() {
        return this.conditionDao.queryAll();
    }

}