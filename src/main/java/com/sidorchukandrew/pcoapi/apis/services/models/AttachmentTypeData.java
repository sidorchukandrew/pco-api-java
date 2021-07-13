package com.sidorchukandrew.pcoapi.apis.services.models;

public class AttachmentTypeData implements Data {
    private AttachmentTypeAttributes attributes;
    private Integer id;
    private String type;
    private Links links;

    private AttachmentTypeData() { }

    private AttachmentTypeData(Builder builder) {
        id = builder.id;
        type = builder.type;
        attributes = builder.attributes;
        links = builder.links;
    }

    public static class Builder {
        private Integer id;
        private String type;
        private AttachmentTypeAttributes attributes;
        private Links links;

        public Builder id(Integer id) {
            this.id = id;
            return this;
        }

        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public Builder attributes(AttachmentTypeAttributes attributes) {
            this.attributes = attributes;
            return this;
        }

        public Builder links(Links links) {
            this.links = links;
            return this;
        }

        public AttachmentTypeData build() {
            return new AttachmentTypeData(this);
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
    public AttachmentTypeAttributes getAttributes() {
        return attributes;
    }

    @Override
    public Links getLinks() {
        return links;
    }

    @Override
    public String toString() {
        return "AttachmentTypeData{" +
                "attributes=" + attributes +
                ", id=" + id +
                ", type='" + type + '\'' +
                ", links=" + links +
                '}';
    }
}
