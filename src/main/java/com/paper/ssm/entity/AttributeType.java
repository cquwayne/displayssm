package com.paper.ssm.entity;

/**
 * (AttributeType)实体类
 *
 * @author makejava
 * @since 2020-12-29 20:53:28
 */
public class AttributeType {
    private static final long serialVersionUID = -88204951605305622L;
    /**
     * 元数据类型id
     */
    private Long id;
    /**
     * 元数据类型名称
     */
    private String title;


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

}