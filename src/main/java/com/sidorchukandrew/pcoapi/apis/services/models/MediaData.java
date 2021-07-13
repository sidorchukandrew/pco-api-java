package com.sidorchukandrew.pcoapi.apis.services.models;

public class MediaData implements Data {
    private String type;
    private Integer id;
    private Links links;
    private MediaAttributes attributes;

    private MediaData() { }

    private MediaData(Builder builder) {
        type = builder.type;
        id = builder.id;
        links = builder.links;
        attributes = builder.attributes;
    }

    public static class Builder {
        private String type;
        private Integer id;
        private Links links;
        private MediaAttributes attributes;

        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public Builder id(Integer id) {
            this.id = id;
            return this;
        }

        public Builder links(Links links) {
            this.links = links;
            return this;
        }

        public Builder attributes(MediaAttributes attributes) {
            this.attributes = attributes;
            return this;
        }

        public MediaData build() {
            return new MediaData(this);
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
    public MediaAttributes getAttributes() {
        return attributes;
    }

    @Override
    public Links getLinks() {
        return links;
    }

    @Override
    public String toString() {
        return "MediaData{" +
                "type='" + type + '\'' +
                ", id=" + id +
                ", links=" + links +
                ", attributes=" + attributes +
                '}';
    }
}
