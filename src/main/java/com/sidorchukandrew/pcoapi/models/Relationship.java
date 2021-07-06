package com.sidorchukandrew.pcoapi.models;

public class Relationship {
    private RelationshipData data;

    private Relationship() { }

    public Relationship(RelationshipData data) {
        this.data = data;
    }

    public RelationshipData getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Relationship{" +
                "data=" + data +
                '}';
    }
}
