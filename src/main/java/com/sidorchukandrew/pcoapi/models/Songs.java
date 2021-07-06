package com.sidorchukandrew.pcoapi.models;

import java.util.List;

public class Songs implements Collection {
    private Links links;
    private List<SongData> data;
    private Meta meta;

    private Songs() {

    }

    private Songs(Builder builder) {
        links = builder.links;
        data = builder.data;
        meta = builder.meta;
    }

    public static class Builder {
        private Links links;
        private List<SongData> data;
        private Meta meta;

        public Builder links(Links links) {
            this.links = links;
            return this;
        }

        public Builder data(List<SongData> data) {
            this.data = data;
            return this;
        }

        public Builder meta(Meta meta) {
            this.meta = meta;
            return this;
        }

        public Songs build() {
            return new Songs(this);
        }
    }

    public Links getLinks() {
        return links;
    }

    public List<SongData> getData() {
        return data;
    }

    public Meta getMeta() {
        return meta;
    }

    @Override
    public String toString() {
        return "Songs{" +
                "links=" + links +
                ", data=" + data +
                ", meta=" + meta +
                '}';
    }
}
