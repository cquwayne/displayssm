package com.paper.ssm.entity;

import java.io.Serializable;

/**
 * (Condition)实体类
 *
 * @author makejava
 * @since 2021-03-18 00:27:57
 */
public class Condition implements Serializable {
    private static final long serialVersionUID = 998429364312112826L;
    /**
     * 工艺条件编号
     */
    private Integer id;
    /**
     * 工艺条件名称
     */
    private String title;


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

}