package com.paper.ssm.controller;

import com.paper.ssm.dao.FeatureDao;
import com.paper.ssm.entity.Feature;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Feature)表控制层
 *
 * @author makejava
 * @since 2021-03-21 15:28:16
 */
@RestController
@RequestMapping("feature")
public class FeatureController {
    /**
     * 服务对象
     */
    @Resource
    private FeatureDao featureDao;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Feature selectOne(Integer id) {
        return this.featureDao.queryById(id);
    }

    @GetMapping("list")
    public List<Feature> queryAll() {
        return this.featureDao.queryAll();
    }

}