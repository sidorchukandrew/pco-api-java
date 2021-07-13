package com.sidorchukandrew.pcoapi.apis.services.models;

public class TagRelationships {
    private Relationship tagGroup;

    private TagRelationships() { }

    public TagRelationships(Relationship tagGroup) {
        this.tagGroup = tagGroup;
    }

    public Relationship getTagGroup() {
        return tagGroup;
    }

    @Override
    public String toString() {
        return "TagRelationships{" +
                "tagGroup=" + tagGroup +
                '}';
    }
}
