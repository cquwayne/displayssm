package com.paper.ssm.controller;


import com.paper.ssm.dao.KnowledgeDao;
//import com.paper.ssm.dao.ModelEntityDao;
import com.paper.ssm.dao.PetriDao;
//import com.paper.ssm.entity.EntityElementData;
import com.paper.ssm.entity.Knowledge;
import com.paper.ssm.entity.Petri;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("feature")
public class FeatureProject {

//    @Resource
//    ConditionController conditionController;
//
//    @Resource
//    FeatureController featureController;

    @Resource
    PetriDao petriDao;

    @Resource
    PetriController petriController;

//    @Resource
//    ModelEntityDao modelEntityDao;

    @Resource
    KnowledgeDao knowledgeDao;

    /**
     * 通过主键查询单条数据
     *
     */
//    @GetMapping("")
//    public void featureSelect(@RequestParam String modelEntityId) {
//        petriController.create();
////        将所有的场景描述转化为条件集合
//        List<String> list = new ArrayList<>();
//        List<EntityElementData> sceneList = this.modelEntityDao.queryById(modelEntityId).getEntityElementDataList();
//        for (EntityElementData temp:sceneList) {
//           String[] arr =  temp.getAttributeValue().split(",");
//           list.addAll(Arrays.asList(arr));
//        }
////        创建Petri的初始状态
//        List<Petri> list0 = this.petriDao.queryAll();
//        for(int j=0;j<list.size();j++) {
//            String s = list.get(j);
//            for(int k=0;k<list0.size();k++){
//                if(list0.get(k).getCTitle().equals(s)) {
//                    list0.get(k).setCState(1);
//                }
//            }
//        }
////        开始推理
//        boolean flag = true;
//        List<Knowledge> list_k = this.knowledgeDao.queryAll();
//        while (flag) {
//            flag = false;
////            从第一条知识开始，判断所有条件是否都满足了
//            for (Knowledge tmp : list_k) {
//                String[] ks = tmp.getConditions().split(",");
//                boolean all = true;
////                对于每一个条件
//                for (String s : ks) {
//                    for (Petri p : list0) {
////                        一旦有一个条件不满足
//                        if (p.getCTitle().equals(s) && p.getCState() == 0) {
//                            all = false;
//                            break;
//                        }
//                    }
//                }
//                if (!all) {
//                    break;
//                } else {
////                        全都满足了条件
//                    for (int x = 0; x < list0.size(); x++) {
//                        Petri pp = list0.get(x);
//                        if (pp.getFTitle().equals(tmp.getSTitle()) && pp.getFState() == 0) {
//                            pp.setFState(1);
//                            flag = true;
//                        } else if (pp.getCTitle().equals(tmp.getSTitle()) && pp.getCState() == 0) {
//                            pp.setCState(1);
//                            flag = true;
//                        }
//                    }
//                }
//            }
//        }
//
//    }

}
