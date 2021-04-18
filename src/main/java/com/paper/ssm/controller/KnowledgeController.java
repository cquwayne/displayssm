package com.paper.ssm.controller;

import com.paper.ssm.dao.KnowledgeDao;
import com.paper.ssm.entity.Knowledge;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Knowledge)表控制层
 *
 * @author makejava
 * @since 2021-03-21 16:12:52
 */
@CrossOrigin
@RestController
@RequestMapping("knowledge")
public class KnowledgeController {
    /**
     * 服务对象
     */
    @Resource
    private KnowledgeDao knowledgeDao;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Knowledge selectOne(Integer id) {
        return this.knowledgeDao.queryById(id);
    }

    @GetMapping("list")
    public List<Knowledge> selectAll() {
        return this.knowledgeDao.queryAll();
    }

}