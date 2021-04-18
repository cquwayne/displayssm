package com.paper.ssm.entity;

/**
 * (Line)实体类
 *
 * @author makejava
 * @since 2021-04-16 19:41:23
 */
public class Line {
    /**
     * 连接线的唯一标识符
     */
    private String id;
    /**
     * 工艺场景唯一标识符
     */
    private String sceneDataId;
    /**
     * 连接线名称
     */
    private String title;
    /**
     * 源活动结点编号
     */
    private String from;
    /**
     * 目标活动结点编号
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

    public String getSceneDataId() {
        return sceneDataId;
    }

    public void setSceneDataId(String sceneDataId) {
        this.sceneDataId = sceneDataId;
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