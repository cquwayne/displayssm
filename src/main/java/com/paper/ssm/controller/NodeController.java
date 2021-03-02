package com.paper.ssm.controller;

import com.paper.ssm.dao.NodeDao;
import com.paper.ssm.entity.Node;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Node)表控制层
 *
 * @author makejava
 * @since 2021-01-29 11:23:47
 */
@CrossOrigin
@RestController
@RequestMapping("node")
public class NodeController {
    /**
     * 服务对象
     */
    @Resource
    private NodeDao nodeDao;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Node selectOne(String id) {
        return this.nodeDao.queryById(id);
    }

    @PostMapping("postOne")
    public int updateOne(Node node) {
        return this.nodeDao.update(node);
    }

}