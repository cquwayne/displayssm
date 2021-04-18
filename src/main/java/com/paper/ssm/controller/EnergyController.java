package com.paper.ssm.controller;

import com.paper.ssm.dao.EnergyDao;
import com.paper.ssm.entity.Energy;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 基础表_基础能源表(Energy)表控制层
 *
 * @author makejava
 * @since 2021-04-18 20:31:56
 */
@CrossOrigin
@RestController
@RequestMapping("energy")
public class EnergyController {
    /**
     * 服务对象
     */
    @Resource
    private EnergyDao energyDao;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Energy selectOne(Integer id) {
        return this.energyDao.queryById(id);
    }

    @GetMapping("list")
    public List<Energy> selectAll() {
        return this.energyDao.queryAll();
    }

}