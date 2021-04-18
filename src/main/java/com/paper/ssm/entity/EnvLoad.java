package com.paper.ssm.entity;

/**
 * 基础表_基础环境负荷表(EnvLoad)实体类
 *
 * @author makejava
 * @since 2021-04-18 20:31:56
 */
public class EnvLoad {
    /**
     * 环境负荷编号
     */
    private Integer id;
    /**
     * 环境负荷名称
     */
    private String title;
    /**
     * 环境负荷类型
     */
    private String envLoadCategoryId;
    /**
     * 负荷描述
     */
    private String description;
    /**
     * 安全性
     */
    private String safetyId;
    /**
     * 处理方式
     */
    private String treatment;
    /**
     * 数据源
     */
    private String source;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEnvLoadCategoryId() {
        return envLoadCategoryId;
    }

    public void setEnvLoadCategoryId(String envLoadCategoryId) {
        this.envLoadCategoryId = envLoadCategoryId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSafetyId() {
        return safetyId;
    }

    public void setSafetyId(String safetyId) {
        this.safetyId = safetyId;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

}