package com.paper.ssm.entity;

import org.apache.ibatis.annotations.Mapper;

import java.io.Serializable;

/**
 * (EntityElementData)实体类
 *
 * @author makejava
 * @since 2021-01-29 16:05:07
 */
@Mapper
public class EntityElementData implements Serializable {
    private static final long serialVersionUID = -24416479098307153L;

    /**
     * 模型实例id
     */
    private String modelEntityId;
    /**
     * 要素类型id
     */
    private Integer elementId;
    /**
     * 要素属性与值
     */
    private String attributeValue;

    public String getModelEntityId() {
        return modelEntityId;
    }

    public void setModelEntityId(String modeEntityId) {
        this.modelEntityId = modeEntityId;
    }

    public Integer getElementId() {
        return elementId;
    }

    public void setElementId(Integer elementId) {
        this.elementId = elementId;
    }

    public String getAttributeValue() {
        return attributeValue;
    }

    public void setAttributeValue(String attributeValue) {
        this.attributeValue = attributeValue;
    }

}