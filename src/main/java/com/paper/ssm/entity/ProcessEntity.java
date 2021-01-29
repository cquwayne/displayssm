package com.paper.ssm.entity;

import java.io.Serializable;
import java.util.List;

/**
 * (ProcessEntity)实体类
 *
 * @author makejava
 * @since 2021-01-29 11:23:47
 */
public class ProcessEntity implements Serializable {
    /**
     * 工艺过程编号
     */
    private String id;
    /**
     * 工艺过程名称
     */
    private String title;
    /**
     * 备注
     */
    private String remark;

    /**
     * 节点列表
     */
    private List<Node> nodeList;

    /**
     * 连线列表
     */
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