package com.paper.ssm.entity;

import java.io.Serializable;
import java.util.List;

/**
 * (ModelEntity)实体类
 *
 * @author makejava
 * @since 2021-01-29 11:23:44
 */
public class ModelEntity implements Serializable {
    private static final long serialVersionUID = -70709266604564805L;
    /**
     * 模型实例主键
     */
    private String id;
    /**
     * 模型实例名称
     */
    private String title;
    /**
     * 模型实例创建者
     */
    private String operator;
    /**
     * 时间
     */
    private String executionTime;
    /**
     * 地点
     */
    private String region;
    /**
     * 数据来源
     */
    private String dataSource;
    /**
     * 备注
     */
    private String remark;

    /**
     * 实例要素数据
     */
    private List<EntityElementData> entityElementDataList;


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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public List<EntityElementData> getEntityElementDataList() {
        return entityElementDataList;
    }

    public void setEntityElementDataList(List<EntityElementData> entityElementDataList) {
        this.entityElementDataList = entityElementDataList;
    }
}