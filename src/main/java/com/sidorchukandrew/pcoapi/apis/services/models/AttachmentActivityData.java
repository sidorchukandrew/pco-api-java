package com.sidorchukandrew.pcoapi.apis.services.models;

public class AttachmentActivityData implements Data {
    private String type;
    private Integer id;
    private AttachmentActivityRelationships relationships;
    private AttachmentActivityAttributes attributes;
    private Links links;

    private AttachmentActivityData() { }

    private AttachmentActivityData(Builder builder) {
        type = builder.type;
        id = builder.id;
        relationships = builder.relationships;
        attributes = builder.attributes;
        links = builder.links;
    }

    public static class Builder {
        private String type;
        private Integer id;
        private AttachmentActivityRelationships relationships;
        private AttachmentActivityAttributes attributes;
        private Links links;

        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public Builder id(Integer id) {
            this.id = id;
            return this;
        }

        public Builder relationships(AttachmentActivityRelationships relationships) {
            this.relationships = relationships;
            return this;
        }

        public Builder attributes(AttachmentActivityAttributes attributes) {
            this.attributes = attributes;
            return this;
        }

        public Builder links(Links links) {
            this.links = links;
            return this;
        }

        public AttachmentActivityData build() {
            return new AttachmentActivityData(this);
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
    public AttachmentActivityAttributes getAttributes() {
        return attributes;
    }

    @Override
    public Links getLinks() {
        return links;
    }

    public AttachmentActivityRelationships getRelationships() {
        return relationships;
    }

    @Override
    public String toString() {
        return "AttachmentActivity{" +
                "type='" + type + '\'' +
                ", id=" + id +
                ", relationships=" + relationships +
                ", attributes=" + attributes +
                '}';
    }
}
