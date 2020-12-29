package com.paper.ssm.entity;

/**
 * (ProcessType)实体类
 *
 * @author makejava
 * @since 2020-12-29 20:53:29
 */
public class ProcessType {
    private static final long serialVersionUID = -33545313123232312L;
    /**
     * 场景模型类型id
     */
    private Long id;
    /**
     * 场景模型父类id
     */
    private Long parentId;
    /**
     * 场景模型类型名称
     */
    private String title;
    /**
     * 场景模型类型描述
     */
    private String description;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}