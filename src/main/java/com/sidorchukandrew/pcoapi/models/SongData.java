package com.sidorchukandrew.pcoapi.models;

public class SongData {
    private String type;
    private Integer id;
    private SongAttributes attributes;
    private Links links;

    private SongData() { }

    private SongData(Builder builder) {
        type = builder.type;
        id = builder.id;
        attributes = builder.attributes;
        links = builder.links;
    }

    public static class Builder {
        private String type;
        private Integer id;
        private SongAttributes attributes;
        private Links links;

        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public Builder id(Integer id) {
            this.id = id;
            return this;
        }

        public Builder attributes(SongAttributes attributes) {
            this.attributes = attributes;
            return this;
        }

        public Builder link(Links links) {
            this.links = links;
            return this;
        }

        public SongData build() {
            return new SongData(this);
        }
    }

    public String getType() {
        return type;
    }

    public Integer getId() {
        return id;
    }

    public SongAttributes getAttributes() {
        return attributes;
    }

    public Links getLinks() {
        return links;
    }

    public String toString() {
        return "SongData{" +
                "type='" + type + '\'' +
                ", id=" + id +
                ", attributes=" + attributes +
                ", links=" + links +
                '}';
    }
}
