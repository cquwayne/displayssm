package com.paper.ssm.controller;

import com.paper.ssm.dao.ElementDataDao;
import com.paper.ssm.entity.ElementData;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (ElementData)表控制层
 *
 * @author makejava
 * @since 2020-12-29 20:53:30
 */
@CrossOrigin
@RestController
@RequestMapping("elementData")
public class ElementDataController {
    /**
     * 服务对象
     */
    @Resource
    private ElementDataDao elementDataDao;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public ElementData selectOne(Long id) {
        return this.elementDataDao.queryById(id);
    }

    @GetMapping("")
    public List<ElementData> selectElementDataListBySceneId(@RequestParam Long sceneModelId) {
        return this.elementDataDao.selectElementDataListBySceneId(sceneModelId);
    }

    @PostMapping("insertOne")
    public int insertOne(@RequestBody ElementData elementData) {
        return this.elementDataDao.insert(elementData);
    }

    @PutMapping("updateOne")
    public int updateOne(@RequestBody ElementData elementData) {
        return this.elementDataDao.update(elementData);
    }

    @DeleteMapping("deleteOne")
    public int deleteOne(@RequestParam Long elementDataId) {
        return this.elementDataDao.deleteById(elementDataId);
    }

}