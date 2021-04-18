package com.paper.ssm.entity;


/**
 * (Node)实体类
 *
 * @author makejava
 * @since 2021-04-16 19:41:19
 */
public class Node {
    /**
     * 结点(模型实例)的唯一标识符
     */
    private String id;
    /**
     * 工艺过程的主键
     */
    private String sceneDataId;
    /**
     * 结点的名称
     */
    private String title;
    /**
     * 纵向坐标
     */
    private String top;
    /**
     * 横向坐标
     */
    private String left;

    private SceneData sceneData;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSceneDataId() {
        return sceneDataId;
    }

    public void setSceneDataId(String sceneDataId) {
        this.sceneDataId = sceneDataId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTop() {
        return top;
    }

    public void setTop(String top) {
        this.top = top;
    }

    public String getLeft() {
        return left;
    }

    public void setLeft(String left) {
        this.left = left;
    }

    public SceneData getSceneData() {
        return sceneData;
    }

    public void setSceneData(SceneData sceneData) {
        this.sceneData = sceneData;
    }
}