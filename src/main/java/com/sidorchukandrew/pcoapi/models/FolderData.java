package com.sidorchukandrew.pcoapi.models;

public class FolderData implements Data {
    private String type;
    private Integer id;
    private FolderLinks links;
    private FolderAttributes attributes;
    private FolderRelationships relationships;

    private FolderData() { }

    private FolderData(Builder builder) {
        type = builder.type;
        id = builder.id;
        links = builder.links;
        attributes = builder.attributes;
        relationships = builder.relationships;
    }

    public static class Builder {
        private String type;
        private Integer id;
        private FolderLinks links;
        private FolderAttributes attributes;
        private FolderRelationships relationships;

        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public Builder id(Integer id) {
            this.id = id;
            return this;
        }

        public Builder links(FolderLinks links) {
            this.links = links;
            return this;
        }

        public Builder attributes(FolderAttributes attributes) {
            this.attributes = attributes;
            return this;
        }

        public Builder relationships(FolderRelationships relationships) {
            this.relationships = relationships;
            return this;
        }

        public FolderData build() {
            return new FolderData(this);
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
    public FolderAttributes getAttributes() {
        return attributes;
    }

    @Override
    public Links getLinks() {
        return links;
    }

    public FolderRelationships getRelationships() {
        return relationships;
    }

    @Override
    public String toString() {
        return "FolderData{" +
                "type='" + type + '\'' +
                ", id=" + id +
                ", links=" + links +
                ", attributes=" + attributes +
                ", relationships=" + relationships +
                '}';
    }
}
