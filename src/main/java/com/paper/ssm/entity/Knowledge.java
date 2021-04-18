package com.paper.ssm.entity;

import java.io.Serializable;

/**
 * (Knowledge)实体类
 *
 * @author makejava
 * @since 2021-03-21 16:12:51
 */
public class Knowledge {
    /**
     * 知识编号
     */
    private Integer id;
    /**
     * 工艺条件集合
     */
    private String conditions;
    /**
     * 经验结论类型
     */
    private Integer sType;
    /**
     * 经验结论
     */
    private String sTitle;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getConditions() {
        return conditions;
    }

    public void setConditions(String conditions) {
        this.conditions = conditions;
    }

    public Integer getSType() {
        return sType;
    }

    public void setSType(Integer sType) {
        this.sType = sType;
    }

    public String getSTitle() {
        return sTitle;
    }

    public void setSTitle(String sTitle) {
        this.sTitle = sTitle;
    }

}