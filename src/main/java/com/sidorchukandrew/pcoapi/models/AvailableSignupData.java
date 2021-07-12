package com.sidorchukandrew.pcoapi.models;

public class AvailableSignupData implements Data {
    private String type;
    private Integer id;
    private AvailableSignupAttributes attributes;
    private AvailableSignupLinks links;
    private AvailableSignupRelationships relationships;

    private AvailableSignupData() { }

    private AvailableSignupData(Builder builder) {
        type = builder.type;
        id = builder.id;
        attributes = builder.attributes;
        links = builder.links;
        relationships = builder.relationships;
    }

    public static class Builder {
        private String type;
        private Integer id;
        private AvailableSignupAttributes attributes;
        private AvailableSignupLinks links;
        private AvailableSignupRelationships relationships;

        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public Builder id(Integer id) {
            this.id = id;
            return this;
        }

        public Builder attributes(AvailableSignupAttributes attributes) {
            this.attributes = attributes;
            return this;
        }

        public Builder links(AvailableSignupLinks links) {
            this.links = links;
            return this;
        }

        public Builder relationships(AvailableSignupRelationships relationships) {
            this.relationships = relationships;
            return this;
        }

        public AvailableSignupData build() {
            return new AvailableSignupData(this);
        }
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public AvailableSignupAttributes getAttributes() {
        return attributes;
    }

    @Override
    public AvailableSignupLinks getLinks() {
        return links;
    }

    public AvailableSignupRelationships getRelationships() {
        return relationships;
    }

    @Override
    public String toString() {
        return "AvailableSignupData{" +
                "type='" + type + '\'' +
                ", id=" + id +
                ", attributes=" + attributes +
                ", links=" + links +
                ", relationships=" + relationships +
                '}';
    }
}
