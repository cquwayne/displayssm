package com.paper.ssm.entity;

import java.io.Serializable;

/**
 * (Feature)实体类
 *
 * @author makejava
 * @since 2021-03-21 15:28:15
 */
public class Feature implements Serializable {
    private static final long serialVersionUID = 429465926878578409L;
    /**
     * 负荷特征编号
     */
    private Integer fId;
    /**
     * 负荷特征名称
     */
    private String fName;
    /**
     * 负荷特征处理数据及特征函数
     */
    private String fBody;


    public Integer getFId() {
        return fId;
    }

    public void setFId(Integer fId) {
        this.fId = fId;
    }

    public String getFName() {
        return fName;
    }

    public void setFName(String fName) {
        this.fName = fName;
    }

    public String getFBody() {
        return fBody;
    }

    public void setFBody(String fBody) {
        this.fBody = fBody;
    }

}