package com.paper.ssm.entity;

/**
 * (SceneModel)实体类
 *
 * @author makejava
 * @since 2021-04-19 15:16:29
 */
public class SceneModel {
    /**
     * 场景模型编号
     */
    private String id;
    /**
     * 场景模型名称
     */
    private String title;
    /**
     * 上层模型编号
     */
    private String parentId;
    /**
     * 模型创建者
     */
    private String operator;
    /**
     * 数据来源
     */
    private String dataSource;
    /**
     * 场景描述
     */
    private String description;
    /**
     * 9000中的场景模型id
     */
    private Integer sceneModelId;
    /**
     * 9000中的输入帧模型id
     */
    private Integer inputFrameId;


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

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getDataSource() {
        return dataSource;
    }

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getSceneModelId() {
        return sceneModelId;
    }

    public void setSceneModelId(Integer sceneModelId) {
        this.sceneModelId = sceneModelId;
    }

    public Integer getInputFrameId() {
        return inputFrameId;
    }

    public void setInputFrameId(Integer inputFrameId) {
        this.inputFrameId = inputFrameId;
    }

}