package com.paper.ssm.entity;

import java.io.Serializable;

/**
 * (Node)实体类
 *
 * @author makejava
 * @since 2021-01-29 11:23:46
 */
public class Node implements Serializable {
    private static final long serialVersionUID = 376370799654337243L;
    /**
     * 节点(模型实例)的唯一标识符
     */
    private String id;
    /**
     * 工艺过程的主键
     */
    private String processEntityId;

//    /**
//     * 工艺过程的主键
//     */
//    private ProcessEntity processEntity;

    /**
     * 节点的名称
     */
    private String title;
    /**
     * 纵向坐标
     */
    private String top;
    /**
     * 横向坐标
     */
    private String left;

    /**
     * 场景实例数据
     */
    private ModelEntity modelEntity;


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

//    public ProcessEntity getProcessEntity() {
//        return processEntity;
//    }
//
//    public void setProcessEntity(ProcessEntity processEntity) {
//        this.processEntity = processEntity;
//    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTop() {
        return top;
    }

    public void setTop(String top) {
        this.top = top;
    }

    public String getLeft() {
        return left;
    }

    public void setLeft(String left) {
        this.left = left;
    }

    public ModelEntity getModelEntity() {
        return modelEntity;
    }

    public void setModelEntity(ModelEntity modelEntity) {
        this.modelEntity = modelEntity;
    }
}