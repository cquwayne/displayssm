package com.paper.ssm.entity;

/**
 * 基础表_基础设备表(Device)实体类
 *
 * @author makejava
 * @since 2021-04-18 20:31:54
 */
public class Device {
    /**
     * 设备编号
     */
    private Integer id;
    /**
     * 设备名称
     */
    private String title;
    /**
     * 设备型号
     */
    private String type;
    /**
     * 设备功率
     */
    private String power;
    /**
     * 设备描述
     */
    private String description;
    /**
     * 设备用途
     */
    private String usage;
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

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

}