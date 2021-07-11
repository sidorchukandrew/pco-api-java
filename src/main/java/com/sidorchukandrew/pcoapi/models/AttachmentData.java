package com.sidorchukandrew.pcoapi.models;

public class AttachmentData implements Data {
    private String type;
    private Integer id;
    private AttachmentRelationships relationships;
    private AttachmentLinks links;
    private AttachmentAttributes attributes;

    private AttachmentData() { }

    private AttachmentData(Builder builder) {
        type = builder.type;
        id = builder.id;
        relationships = builder.relationships;
        links = builder.links;
        attributes = builder.attributes;
    }

    public static class Builder {
        private String type;
        private Integer id;
        private AttachmentRelationships relationships;
        private AttachmentLinks links;
        private AttachmentAttributes attributes;

        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public Builder id(Integer id) {
            this.id = id;
            return this;
        }

        public Builder relationships(AttachmentRelationships relationships) {
            this.relationships = relationships;
            return this;
        }

        public Builder links(AttachmentLinks links) {
            this.links = links;
            return this;
        }

        public Builder attributes(AttachmentAttributes attributes) {
            this.attributes = attributes;
            return this;
        }

        public AttachmentData build() {
            return new AttachmentData(this);
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
    public AttachmentAttributes getAttributes() {
        return attributes;
    }

    @Override
    public AttachmentLinks getLinks() {
        return links;
    }

    public AttachmentRelationships getRelationships() {
        return relationships;
    }

    @Override
    public String toString() {
        return "AttachmentData{" +
                "type='" + type + '\'' +
                ", id=" + id +
                ", relationships=" + relationships +
                ", links=" + links +
                ", attributes=" + attributes +
                '}';
    }
}
