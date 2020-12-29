package com.paper.ssm.entity;

/**
 * (Attribute)实体类
 *
 * @author makejava
 * @since 2020-12-29 20:53:27
 */
public class Attribute {
    private static final long serialVersionUID = -19519695433936761L;
    /**
     * 属性id
     */
    private Long id;
    /**
     * 属性名称
     */
    private String title;
    /**
     * 所属要素
     */
    private Long elementTypeId;
    /**
     * 属性元数据信息
     */
    private String metadataInformation;
    /**
     * 属性可选项
     */
    private String value;
    /**
     * 是否所属组公共属性
     */
    private Object generic;
    /**
     * 属性描述
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

    public Long getElementTypeId() {
        return elementTypeId;
    }

    public void setElementTypeId(Long elementTypeId) {
        this.elementTypeId = elementTypeId;
    }

    public String getMetadataInformation() {
        return metadataInformation;
    }

    public void setMetadataInformation(String metadataInformation) {
        this.metadataInformation = metadataInformation;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Object getGeneric() {
        return generic;
    }

    public void setGeneric(Object generic) {
        this.generic = generic;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}