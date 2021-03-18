package com.paper.ssm.entity;

import java.io.Serializable;

/**
 * (Envload)实体类
 *
 * @author makejava
 * @since 2021-03-18 00:27:59
 */
public class Envload implements Serializable {
    private static final long serialVersionUID = 226378059918213214L;
    /**
     * 环境负荷id
     */
    private Integer id;
    /**
     * 环境负荷名称
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