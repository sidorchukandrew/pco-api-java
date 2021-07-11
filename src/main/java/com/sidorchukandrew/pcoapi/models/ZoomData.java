package com.sidorchukandrew.pcoapi.models;

public class ZoomData implements Data {
    private String type;
    private Integer id;
    private ZoomAttributes attributes;
    private Links links;
    private ZoomRelationships relationships;

    private ZoomData() { }

    private ZoomData(Builder builder) {
        type = builder.type;
        id = builder.id;
        attributes = builder.attributes;
        links = builder.links;
        relationships = builder.relationships;
    }

    public static class Builder {
        private String type;
        private Integer id;
        private ZoomAttributes attributes;
        private Links links;
        private ZoomRelationships relationships;

        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public Builder id(Integer id) {
            this.id = id;
            return this;
        }

        public Builder attributes(ZoomAttributes attributes) {
            this.attributes = attributes;
            return this;
        }

        public Builder links(Links links) {
            this.links = links;
            return this;
        }

        public Builder relationships(ZoomRelationships relationships) {
            this.relationships = relationships;
            return this;
        }

        public ZoomData build() {
            return new ZoomData(this);
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
    public ZoomAttributes getAttributes() {
        return attributes;
    }

    @Override
    public Links getLinks() {
        return links;
    }

    public ZoomRelationships getRelationships() {
        return relationships;
    }

    @Override
    public String toString() {
        return "ZoomData{" +
                "type='" + type + '\'' +
                ", id=" + id +
                ", attributes=" + attributes +
                ", links=" + links +
                ", relationships=" + relationships +
                '}';
    }
}
