package com.paper.ssm.entity;

/**
 * 基础表_基础物料表(Material)实体类
 *
 * @author makejava
 * @since 2021-04-18 20:31:58
 */
public class Material {
    /**
     * 物料编号
     */
    private Integer id;
    /**
     * 物料名称
     */
    private String title;
    /**
     * 物料牌号
     */
    private String type;
    /**
     * 物料描述
     */
    private String description;
    /**
     * 物料来源/产地
     */
    private String origin;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

}