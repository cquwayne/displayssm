package com.paper.ssm.entity;

import java.io.Serializable;

/**
 * (Line)实体类
 *
 * @author makejava
 * @since 2021-01-29 11:23:42
 */
public class Line implements Serializable {
    private static final long serialVersionUID = 143289693223652099L;
    /**
     * 连接线的唯一标识符
     */
    private String id;
    /**
     * 工艺过程唯一标识符
     */
    private String processEntityId;
    /**
     * 连接线名称
     */
    private String title;
    /**
     * 源活动节点编号
     */
    private String from;
    /**
     * 目标活动节点编号
     */
    private String to;
    /**
     * 备注
     */
    private String remark;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProcessEntityId() {
        return processEntityId;
    }

    public void setProcessEntityId(String processEntityId) {
        this.processEntityId = processEntityId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}