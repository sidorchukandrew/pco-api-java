package com.sidorchukandrew.pcoapi.models;

public class TagAssignment {
    private TagAssignmentData data;

    private TagAssignment() { }

    public TagAssignment(TagAssignmentData data) {
        this.data = data;
    }

    public TagAssignmentData getData() {
        return data;
    }

    @Override
    public String toString() {
        return "TagAssignment{" +
                "data=" + data +
                '}';
    }
}
