package com.paper.ssm.controller;

import com.alibaba.fastjson.JSON;
import com.paper.ssm.dao.KnowledgeDao;
import com.paper.ssm.entity.Conclusion;
import com.paper.ssm.entity.DataScene;
import com.paper.ssm.entity.Knowledge;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.LinkedHashMap;
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

    @Resource
    private FeatureDeal featureDeal;

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

    @PostMapping("inference")
    public int knowledgeInference(@RequestBody String sceneData) throws Exception {
//        System.out.println(dataScene);
        // 构建KieServices
        try {
            KieServices ks = KieServices.Factory.get();
            KieContainer kieContainer = ks.getKieClasspathContainer();
            // 获取kmodule.xml中配置中名称为kSessionRule的session，默认为有状态的。
            KieSession kSession = kieContainer.newKieSession("kSessionRule");
            DataScene dataScene = JSON.parseObject(sceneData.substring(13,sceneData.length()-1)).toJavaObject(DataScene.class);
            kSession.insert(dataScene);
            Conclusion conclusion = new Conclusion();
            LinkedHashMap<List<String>,String> featureList = new LinkedHashMap<>();
            kSession.insert(conclusion);
            kSession.setGlobal("featureList", featureList);
            int count = kSession.fireAllRules();
            System.out.println("命中了" + count + "条规则！");
            featureDeal.dealWith(featureList, dataScene.getTitle());
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }


}