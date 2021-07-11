package com.sidorchukandrew.pcoapi.models;

import java.util.List;
import java.util.Map;

public class Zooms implements Collection {
    private Links links;
    private Meta meta;
    private List<ZoomData> data;
    private List<Map<String, Object>> included;

    private Zooms() { }

    private Zooms(Builder builder) {
        links = builder.links;
        meta = builder.meta;
        data = builder.data;
        included = builder.included;
    }

    public static class Builder {
        private Links links;
        private Meta meta;
        private List<ZoomData> data;
        private List<Map<String, Object>> included;

        public Builder links(Links links) {
            this.links = links;
            return this;
        }

        public Builder meta(Meta meta) {
            this.meta = meta;
            return this;
        }

        public Builder data(List<ZoomData> data) {
            this.data = data;
            return this;
        }

        public Builder included(List<Map<String, Object>> included) {
            this.included = included;
            return this;
        }

        public Zooms build() {
            return new Zooms(this);
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
    public List<ZoomData> getData() {
        return data;
    }

    @Override
    public List<Map<String, Object>> getIncluded() {
        return included;
    }

    @Override
    public String toString() {
        return "Zooms{" +
                "links=" + links +
                ", meta=" + meta +
                ", data=" + data +
                ", included=" + included +
                '}';
    }
}
