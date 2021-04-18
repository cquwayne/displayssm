package com.paper.ssm.entity;

import java.util.List;

/**
 * (SceneData)实体类
 *
 * @author makejava
 * @since 2021-04-16 19:41:25
 */
public class SceneData {
    /**
     * 场景实例唯一编号
     */
    private String id;
    /**
     * 场景实例名称
     */
    private String title;
    /**
     * 场景所属工艺类型
     */
    private Integer category;
    /**
     * 场景层级代表性
     */
    private String hierarchy;
    /**
     * 场景边界划分
     */
    private String boundary;
    /**
     * 场景作用范围
     */
    private String function;
    /**
     * 场景备注
     */
    private String remark;

    private List<Node> nodeList;

    private List<Line> lineList;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    public String getHierarchy() {
        return hierarchy;
    }

    public void setHierarchy(String hierarchy) {
        this.hierarchy = hierarchy;
    }

    public String getBoundary() {
        return boundary;
    }

    public void setBoundary(String boundary) {
        this.boundary = boundary;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
    public List<Node> getNodeList() {
        return nodeList;
    }

    public void setNodeList(List<Node> nodeList) {
        this.nodeList = nodeList;
    }

    public List<Line> getLineList() {
        return lineList;
    }

    public void setLineList(List<Line> lineList) {
        this.lineList = lineList;
    }
}