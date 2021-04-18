package com.paper.ssm.controller;

import com.paper.ssm.dao.KnowledgeDao;
import com.paper.ssm.dao.PetriDao;
import com.paper.ssm.entity.Knowledge;
import com.paper.ssm.entity.Petri;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Petri)表控制层
 *
 * @author makejava
 * @since 2021-03-21 16:12:54
 */
@RestController
@RequestMapping("petri")
public class PetriController {
    /**
     * 服务对象
     */
    @Resource
    private PetriDao petriDao;

    @Resource
    private KnowledgeDao knowledgeDao;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Petri selectOne(Integer id) {
        return this.petriDao.queryById(id);
    }

//    根据知识创建Petri网
    @GetMapping("")
    public int create() {
//        获取所有知识
        List<Knowledge> list = this.knowledgeDao.queryAll();
//        对每条知识的条件集和结果创建Petri网元素
        for (int i=0;i<list.size();i++) {
            Knowledge tt = list.get(i);
            Petri petri = new Petri();
//            所有的条件创建Petri网元素
            String[] c1 = tt.getConditions().split(",");
            for (String m:c1) {
                petri.setCTitle(m);
                this.petriDao.insert(petri);
            }
//            根据结果类型，创建不同的Petri网元素
            if (tt.getSType()==1) {
                petri.setFTitle(tt.getSTitle());
                this.petriDao.insert(petri);
            } else {
                String[] c2 = tt.getSTitle().split(",");
                for (String m:c2) {
                    petri.setCTitle(m);
                    this.petriDao.insert(petri);
                }
            }
        }
        return this.petriDao.queryAll().size();
    }

}