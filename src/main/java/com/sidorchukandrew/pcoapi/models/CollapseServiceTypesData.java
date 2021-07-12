package com.sidorchukandrew.pcoapi.models;

import java.util.HashMap;
import java.util.Map;

public class CollapseServiceTypesData {
    private String type;
    private Map<String, Object> attributes;
    private CollapseServiceTypesRelationships relationships;

    private CollapseServiceTypesData() { }

    private CollapseServiceTypesData(Builder builder) {
        type = builder.type;
        attributes = new HashMap<>();
        relationships = builder.relationships;
    }

    public static class Builder {
        private String type;
        private CollapseServiceTypesRelationships relationships;

        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public Builder relationships(CollapseServiceTypesRelationships relationships) {
            this.relationships = relationships;
            return this;
        }

        public CollapseServiceTypesData build() {
            return new CollapseServiceTypesData(this);
        }
    }

    public String getType() {
        return type;
    }

    public Map<String, Object> getAttributes() {
        return attributes;
    }

    public CollapseServiceTypesRelationships getRelationships() {
        return relationships;
    }

    @Override
    public String toString() {
        return "CollapseServiceTypesData{" +
                "type='" + type + '\'' +
                ", attributes=" + attributes +
                ", relationships=" + relationships +
                '}';
    }
}
