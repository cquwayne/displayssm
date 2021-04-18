package com.paper.ssm.controller;

import com.paper.ssm.dao.MaterialDao;
import com.paper.ssm.entity.Material;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 基础表_基础物料表(Material)表控制层
 *
 * @author makejava
 * @since 2021-04-18 20:31:59
 */
@CrossOrigin
@RestController
@RequestMapping("material")
public class MaterialController {
    /**
     * 服务对象
     */
    @Resource
    private MaterialDao materialDao;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Material selectOne(Integer id) {
        return this.materialDao.queryById(id);
    }

    @GetMapping("list")
    public List<Material> selectAll() {
        return this.materialDao.queryAll();
    }

}