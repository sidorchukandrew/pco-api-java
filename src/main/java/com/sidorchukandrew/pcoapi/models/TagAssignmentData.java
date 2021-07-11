package com.sidorchukandrew.pcoapi.models;

import java.util.HashMap;
import java.util.Map;

public class TagAssignmentData {
    private String type;
    private Map<String, Object> attributes;
    private TagAssignmentRelationships relationships;

    private TagAssignmentData() { }

    private TagAssignmentData(Builder builder) {
        type = builder.type;
        attributes = builder.attributes;
        relationships = builder.relationships;
    }

    public static class Builder {
        private String type;
        private Map<String, Object> attributes;
        private TagAssignmentRelationships relationships;

        public Builder() {
            type = "TagAssignment";
            attributes = new HashMap<>();
        }

        public Builder relationships(TagAssignmentRelationships relationships) {
            this.relationships = relationships;
            return this;
        }

        public TagAssignmentData build() {
            return new TagAssignmentData(this);
        }
    }

    public String getType() {
        return type;
    }

    public Map<String, Object> getAttributes() {
        return attributes;
    }

    public TagAssignmentRelationships getRelationships() {
        return relationships;
    }

    @Override
    public String toString() {
        return "TagAssignmentData{" +
                "type='" + type + '\'' +
                ", attributes=" + attributes +
                ", relationships=" + relationships +
                '}';
    }
}
