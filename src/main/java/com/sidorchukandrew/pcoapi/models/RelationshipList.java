package com.sidorchukandrew.pcoapi.models;

import java.util.List;

public class RelationshipList {
    private List<RelationshipData> data;

    private RelationshipList() { }

    public RelationshipList(List<RelationshipData> data) {
        this.data = data;
    }

    public List<RelationshipData> getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Relationship{" +
                "data=" + data +
                '}';
    }
}
