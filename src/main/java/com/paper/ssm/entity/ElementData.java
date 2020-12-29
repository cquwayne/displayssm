package com.paper.ssm.entity;

/**
 * (ElementData)实体类
 *
 * @author makejava
 * @since 2020-12-29 20:53:30
 */
public class ElementData {
    private static final long serialVersionUID = 704051841649142640L;
    /**
     * 记录id
     */
    private Long id;
    /**
     * 场景id
     */
    private Long sceneId;
    /**
     * 要素id
     */
    private Long elementId;
    /**
     * 属性及其值
     */
    private String attributeValue;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSceneId() {
        return sceneId;
    }

    public void setSceneId(Long sceneId) {
        this.sceneId = sceneId;
    }

    public Long getElementId() {
        return elementId;
    }

    public void setElementId(Long elementId) {
        this.elementId = elementId;
    }

    public String getAttributeValue() {
        return attributeValue;
    }

    public void setAttributeValue(String attributeValue) {
        this.attributeValue = attributeValue;
    }

}