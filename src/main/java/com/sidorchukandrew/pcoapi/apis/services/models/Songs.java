package com.sidorchukandrew.pcoapi.apis.services.models;

import java.util.List;
import java.util.Map;

public class Songs implements Collection {
    private Links links;
    private List<SongData> data;
    private Meta meta;
    private List<Map<String, Object>> included;

    private Songs() {

    }

    private Songs(Builder builder) {
        links = builder.links;
        data = builder.data;
        meta = builder.meta;
        included = builder.included;
    }

    public static class Builder {
        private Links links;
        private List<SongData> data;
        private Meta meta;
        private List<Map<String, Object>> included;

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

        public Builder included(List<Map<String, Object>> included) {
            this.included = included;
            return this;
        }

        public Songs build() {
            return new Songs(this);
        }
    }

    @Override
    public Links getLinks() {
        return links;
    }

    @Override
    public Meta getMeta() {
        return meta;
    }

    @Override
    public List<SongData> getData() {
        return data;
    }

    @Override
    public List<Map<String, Object>> getIncluded() {
        return included;
    }


    @Override
    public String toString() {
        return "Songs{" +
                "links=" + links +
                ", data=" + data +
                ", meta=" + meta +
                ", included=" + included +
                '}';
    }
}
