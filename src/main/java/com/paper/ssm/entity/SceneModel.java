package com.paper.ssm.entity;

import java.util.List;

/**
 * (SceneModel)实体类
 *
 * @author makejava
 * @since 2020-12-30 10:37:15
 */
public class SceneModel {
    private static final long serialVersionUID = -16289584806726906L;
    /**
     * 场景模型id
     */
    private Long id;
    /**
     * 场景模型名称
     */
    private String title;
    /**
     * 场景模型父类id
     */
    private Long parentId;
    private SceneModel parent;
    /**
     * 场景模型类型
     */
    private Long processTypeId;
    private ProcessType processType;
    private String operator;
    private String executionTime;
    private String region;
    private String dataSource;
    /**
     * 场景模型描述
     */
    private String description;

    /**
     * 场景要素数据
     */
    private List<ElementData> elementDataList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public SceneModel getParent() {
        return parent;
    }

    public void setParent(SceneModel parent) {
        this.parent = parent;
    }

    public Long getProcessTypeId() {
        return processTypeId;
    }

    public void setProcessTypeId(Long processTypeId) {
        this.processTypeId = processTypeId;
    }

    public ProcessType getProcessType() {
        return processType;
    }

    public void setProcessType(ProcessType processType) {
        this.processType = processType;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getExecutionTime() {
        return executionTime;
    }

    public void setExecutionTime(String executionTime) {
        this.executionTime = executionTime;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
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

    public List<ElementData> getElementDataList() {
        return elementDataList;
    }

    public void setElementDataList(List<ElementData> elementDataList) {
        this.elementDataList = elementDataList;
    }
}