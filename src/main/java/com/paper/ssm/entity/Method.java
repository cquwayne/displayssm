package com.paper.ssm.entity;

import java.io.Serializable;

/**
 * (Method)实体类
 *
 * @author makejava
 * @since 2021-03-18 00:28:01
 */
public class Method implements Serializable {
    private static final long serialVersionUID = 448437856679211183L;
    /**
     * 特征化方法编号
     */
    private Integer id;
    /**
     * 特征化方法名称
     */
    private String title;
    /**
     * 特征化方法类别
     */
    private String type;
    /**
     * 备注
     */
    private String remark;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}