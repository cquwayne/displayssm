package com.paper.ssm.entity;

import java.util.List;

public class KnowledgeResult {

    private int count = 0;

    private List<String> predictList;

    private List<String> knowledgeList;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<String> getPredictList() {
        return predictList;
    }

    public void setPredictList(List<String> predictList) {
        this.predictList = predictList;
    }

    public List<String> getKnowledgeList() {
        return knowledgeList;
    }

    public void setKnowledgeList(List<String> knowledgeList) {
        this.knowledgeList = knowledgeList;
    }
}
