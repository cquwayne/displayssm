package com.paper.ssm.entity;

import java.io.Serializable;

/**
 * (Petri)实体类
 *
 * @author makejava
 * @since 2021-03-21 16:12:53
 */
public class Petri implements Serializable {
    private static final long serialVersionUID = 797928972999671355L;
    /**
     * petri网元素编号
     */
    private Integer pId;
    /**
     * 工艺条件名称
     */
    private String cTitle;
    /**
     * 负荷特征名称
     */
    private String fTitle;
    /**
     * 条件状态
     */
    private Integer cState;
    /**
     * 负荷特征状态
     */
    private Integer fState;


    public Integer getPId() {
        return pId;
    }

    public void setPId(Integer pId) {
        this.pId = pId;
    }

    public String getCTitle() {
        return cTitle;
    }

    public void setCTitle(String cTitle) {
        this.cTitle = cTitle;
    }

    public String getFTitle() {
        return fTitle;
    }

    public void setFTitle(String fTitle) {
        this.fTitle = fTitle;
    }

    public Integer getCState() {
        return cState;
    }

    public void setCState(Integer cState) {
        this.cState = cState;
    }

    public Integer getFState() {
        return fState;
    }

    public void setFState(Integer fState) {
        this.fState = fState;
    }

}