package com.paper.ssm.entity;

/**
 * (AttributeMetadata)实体类
 *
 * @author makejava
 * @since 2020-12-30 10:37:14
 */
public class AttributeMetadata {
    private static final long serialVersionUID = 714604569082859140L;
    /**
     * 元数据id
     */
    private Long id;
    /**
     * 元数据类型
     */
    private Long typeId;
    /**
     * 元数据名称
     */
    private String title;
    /**
     * 元数据值可选项
     */
    private String value;
    /**
     * 元数据含义描述
     */
    private String description;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}