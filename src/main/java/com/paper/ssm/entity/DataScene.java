package com.paper.ssm.entity;

import java.util.List;

public class DataScene {

    private Integer id;

    private String title;

    private String category;

    private String description;

    private List<MaterialData> materialDataList;
    private List<EnergyData> energyDataList;
    private List<DeviceData> deviceDataList;
    private List<EnvLoadData> envLoadDataList;
    private List<OutputPartData> outputPartDataList;
    private List<KeyParameterData> keyParameterDataList;

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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<MaterialData> getMaterialDataList() {
        return materialDataList;
    }

    public void setMaterialDataList(List<MaterialData> materialDataList) {
        this.materialDataList = materialDataList;
    }

    public List<EnergyData> getEnergyDataList() {
        return energyDataList;
    }

    public void setEnergyDataList(List<EnergyData> energyDataList) {
        this.energyDataList = energyDataList;
    }

    public List<DeviceData> getDeviceDataList() {
        return deviceDataList;
    }

    public void setDeviceDataList(List<DeviceData> deviceDataList) {
        this.deviceDataList = deviceDataList;
    }

    public List<EnvLoadData> getEnvLoadDataList() {
        return envLoadDataList;
    }

    public void setEnvLoadDataList(List<EnvLoadData> envLoadDataList) {
        this.envLoadDataList = envLoadDataList;
    }

    public List<OutputPartData> getOutputPartDataList() {
        return outputPartDataList;
    }

    public void setOutputPartDataList(List<OutputPartData> outputPartDataList) {
        this.outputPartDataList = outputPartDataList;
    }

    public List<KeyParameterData> getKeyParameterDataList() {
        return keyParameterDataList;
    }

    public void setKeyParameterDataList(List<KeyParameterData> keyParameterDataList) {
        this.keyParameterDataList = keyParameterDataList;
    }
}
