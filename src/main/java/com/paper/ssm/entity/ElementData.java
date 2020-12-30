package com.paper.ssm.entity;

/**
 * (ElementData)实体类
 *
 * @author makejava
 * @since 2020-12-30 10:37:15
 */
public class ElementData {
    private static final long serialVersionUID = -35483933811566603L;
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
    private Element element;
    /**
     * 要素属性及其值
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

    public Element getElement() {
        return element;
    }

    public void setElement(Element element) {
        this.element = element;
    }

    public String getAttributeValue() {
        return attributeValue;
    }

    public void setAttributeValue(String attributeValue) {
        this.attributeValue = attributeValue;
    }

}