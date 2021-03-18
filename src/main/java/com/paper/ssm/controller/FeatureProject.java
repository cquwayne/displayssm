package com.paper.ssm.controller;


import com.paper.ssm.entity.Condition;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("feature")
public class FeatureProject {

    /**
     * 通过主键查询单条数据
     *
     */
    @GetMapping("")
    public void featureSelect(List<Condition> list) {

        return ;
    }

}
