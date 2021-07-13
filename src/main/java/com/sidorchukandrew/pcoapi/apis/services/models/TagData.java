package com.sidorchukandrew.pcoapi.apis.services.models;

public class TagData implements Data {
    private String type;
    private Integer id;
    private TagAttributes attributes;
    private Links links;
    private TagRelationships relationships;

    private TagData() { }

    private TagData(Builder builder) {
        type = builder.type;
        id = builder.id;
        attributes = builder.attributes;
        links = builder.links;
        relationships = builder.relationships;
    }

    public static class Builder {
        private String type;
        private Integer id;
        private TagAttributes attributes;
        private Links links;
        private TagRelationships relationships;

        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public Builder id(Integer id) {
            this.id = id;
            return this;
        }

        public Builder attributes(TagAttributes attributes) {
            this.attributes = attributes;
            return this;
        }

        public Builder links(Links links) {
            this.links = links;
            return this;
        }

        public Builder relationships(TagRelationships relationships) {
            this.relationships = relationships;
            return this;
        }

        public TagData build() {
            return new TagData(this);
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
    public Attributes getAttributes() {
        return attributes;
    }

    @Override
    public Links getLinks() {
        return links;
    }

    public TagRelationships getRelationships() {
        return relationships;
    }

    @Override
    public String toString() {
        return "TagData{" +
                "type='" + type + '\'' +
                ", id=" + id +
                ", attributes=" + attributes +
                ", links=" + links +
                ", relationships=" + relationships +
                '}';
    }
}
