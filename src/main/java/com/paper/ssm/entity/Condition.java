package com.paper.ssm.entity;

import java.io.Serializable;

/**
 * (Condition)实体类
 *
 * @author makejava
 * @since 2021-03-21 15:28:12
 */
public class Condition implements Serializable {
    private static final long serialVersionUID = -26035383325344486L;
    /**
     * 工艺条件编号
     */
    private Integer cId;
    /**
     * 工艺条件
     */
    private String cBody;


    public Integer getCId() {
        return cId;
    }

    public void setCId(Integer cId) {
        this.cId = cId;
    }

    public String getCBody() {
        return cBody;
    }

    public void setCBody(String cBody) {
        this.cBody = cBody;
    }

}