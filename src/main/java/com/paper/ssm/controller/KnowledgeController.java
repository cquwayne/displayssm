package com.paper.ssm.controller;

import com.alibaba.fastjson.JSON;
import com.paper.ssm.dao.KnowledgeDao;
import com.paper.ssm.entity.Conclusion;
import com.paper.ssm.entity.DataScene;
import com.paper.ssm.entity.Knowledge;
import com.paper.ssm.entity.KnowledgeResult;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

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
    public KnowledgeResult knowledgeInference(@RequestBody String sceneData) throws Exception {
//        System.out.println(dataScene);
        KnowledgeResult knowledgeResult = new KnowledgeResult();
        // 构建KieServices
        try {
            KieServices ks = KieServices.Factory.get();
            KieContainer kieContainer = ks.getKieClasspathContainer();
            // 获取kmodule.xml中配置中名称为kSessionRule的session，默认为有状态的。
            KieSession kSession = kieContainer.newKieSession("kSessionRule");
//            将前端发来的数据转换为DataScene对象
            DataScene dataScene = JSON.parseObject(sceneData.substring(13,sceneData.length()-1)).toJavaObject(DataScene.class);
//            以场景为输入放置到规则引擎
            kSession.insert(dataScene);
//            中间结论类
            Conclusion conclusion = new Conclusion();
//            将类对象放入工作空间
            kSession.insert(conclusion);
//            接收负荷特征中的数据项组名称和处理方法名称
            LinkedHashMap<List<String>,String> featureList = new LinkedHashMap<>();
//            将特征数组设置为类和规则引擎相互映射
            kSession.setGlobal("featureList", featureList);
//            接收激活的知识
            List<String> knowledgeList = new ArrayList<>();
//            将激活的知识数组设置为类和规则引擎相互映射
            kSession.setGlobal("knowledgeList", knowledgeList);
//            开始推理并返回命中的规则数
            int count = kSession.fireAllRules();
//            设置返回结果中的命中知识条数
            knowledgeResult.setCount(count);
//            打印
            System.out.println("命中了" + count + "条规则！");
//            处理featureList中的负荷特征
            featureDeal.dealWith(featureList, dataScene.getTitle());
            knowledgeResult.setKnowledgeList(knowledgeList);
            return knowledgeResult;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @GetMapping("dataIndexes")
    public List<String> selectDataIndexes(@RequestParam String sceneDataTitle, @RequestParam String index) throws IOException {

        ArrayList<String> indexes = new ArrayList<>();
        String fileName = null;
        /*
          读取原始数据集合所在的Excel文件
         */
        if (index.equals("originalIndexes")) {
            fileName = "D:\\display\\displayvue\\static\\" + sceneDataTitle + ".xlsx";
        } else {
            fileName = "D:\\display\\displayvue\\static\\" + sceneDataTitle + "train.xlsx";
        }
        File file = new File(fileName);
        XSSFWorkbook workbook = new XSSFWorkbook(new FileInputStream(file));
//        两种方式读取工作表
        Sheet sheet = workbook.getSheetAt(0);
//        获取第一行的数据
        Row row = sheet.getRow(0);
//        获取第一行所有数据项的个数（第一行的列数）
        int colsNum = row.getLastCellNum();
        for (int i=0;i<colsNum;i++) {
            indexes.add(row.getCell(i).getStringCellValue());
        }
        return indexes;
    }


}