package com.paper.ssm.entity;

/**
 * 基础表_基础能源表(Energy)实体类
 *
 * @author makejava
 * @since 2021-04-18 20:31:55
 */
public class Energy {
    /**
     * 能源编号
     */
    private Integer id;
    /**
     * 能源名称
     */
    private String title;
    /**
     * 能源分类
     */
    private String energyCategoryId;
    /**
     * 数据源
     */
    private String source;


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

    public String getEnergyCategoryId() {
        return energyCategoryId;
    }

    public void setEnergyCategoryId(String energyCategoryId) {
        this.energyCategoryId = energyCategoryId;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

}