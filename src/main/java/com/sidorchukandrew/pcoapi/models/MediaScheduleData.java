package com.sidorchukandrew.pcoapi.models;

public class MediaScheduleData implements Data {
    private String type;
    private Integer id;
    private Links links;
    private MediaScheduleAttributes attributes;
    private MediaScheduleRelationships relationships;

    private MediaScheduleData() { }

    private MediaScheduleData(Builder builder) {
        type = builder.type;
        id = builder.id;
        links = builder.links;
        attributes = builder.attributes;
        relationships = builder.relationships;
    }

    public static class Builder {
        private String type;
        private Integer id;
        private Links links;
        private MediaScheduleAttributes attributes;
        private MediaScheduleRelationships relationships;

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

        public Builder attributes(MediaScheduleAttributes attributes) {
            this.attributes = attributes;
            return this;
        }

        public Builder relationships(MediaScheduleRelationships relationships) {
            this.relationships = relationships;
            return this;
        }

        public MediaScheduleData build() {
            return new MediaScheduleData(this);
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
    public MediaScheduleAttributes getAttributes() {
        return attributes;
    }

    @Override
    public Links getLinks() {
        return links;
    }

    public MediaScheduleRelationships getRelationships() {
        return relationships;
    }

    @Override
    public String toString() {
        return "MediaScheduleData{" +
                "type='" + type + '\'' +
                ", id=" + id +
                ", links=" + links +
                ", attributes=" + attributes +
                ", relationships=" + relationships +
                '}';
    }
}
