package com.paper.ssm.entity;

/**
 * (Element)实体类
 *
 * @author makejava
 * @since 2020-12-29 20:53:27
 */
public class Element {
    private static final long serialVersionUID = 325814939590594268L;
    /**
     * 要素id
     */
    private Long id;
    /**
     * 要素名称
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