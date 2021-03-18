package com.paper.ssm.entity;

import java.io.Serializable;

/**
 * (Knowledge)实体类
 *
 * @author makejava
 * @since 2021-03-18 00:27:54
 */
public class Knowledge implements Serializable {
    private static final long serialVersionUID = -89815296250489377L;
    /**
     * 知识编号
     */
    private Integer id;
    /**
     * 影响因素
     */
    private String impact;
    /**
     * 工艺条件
     */
    private String conditions;
    /**
     * 环境负荷
     */
    private String envload;
    /**
     * 数据项
     */
    private String datalist;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImpact() {
        return impact;
    }

    public void setImpact(String impact) {
        this.impact = impact;
    }

    public String getConditions() {
        return conditions;
    }

    public void setConditions(String conditions) {
        this.conditions = conditions;
    }

    public String getEnvload() {
        return envload;
    }

    public void setEnvload(String envload) {
        this.envload = envload;
    }

    public String getDatalist() {
        return datalist;
    }

    public void setDatalist(String datalist) {
        this.datalist = datalist;
    }

}