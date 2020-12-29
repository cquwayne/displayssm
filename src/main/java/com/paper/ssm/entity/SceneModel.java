package com.paper.ssm.entity;

/**
 * (SceneModel)实体类
 *
 * @author makejava
 * @since 2020-12-29 20:53:30
 */
public class SceneModel {
    private static final long serialVersionUID = 578764521515462305L;
    /**
     * 场景模型id
     */
    private Long id;
    /**
     * 场景模型名称
     */
    private String title;
    /**
     * 场景模型类型
     */
    private Long processTypeId;
    /**
     * 场景模型描述
     */
    private String description;


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

    public Long getProcessTypeId() {
        return processTypeId;
    }

    public void setProcessTypeId(Long processTypeId) {
        this.processTypeId = processTypeId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}