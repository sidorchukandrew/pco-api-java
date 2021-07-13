package com.sidorchukandrew.pcoapi.apis.services.models;

public class TagAssignmentRelationships {
    private RelationshipList tags;

    private TagAssignmentRelationships() { }

    public TagAssignmentRelationships(RelationshipList tags) {
        this.tags = tags;
    }

    public RelationshipList getTags() {
        return tags;
    }

    @Override
    public String toString() {
        return "TagRelationships{" +
                "tags=" + tags +
                '}';
    }
}
