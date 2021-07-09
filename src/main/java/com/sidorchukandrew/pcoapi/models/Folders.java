package com.sidorchukandrew.pcoapi.models;

import java.util.List;
import java.util.Map;

public class Folders implements Collection {
    private Links links;
    private Meta meta;
    private List<FolderData> data;
    private List<Map<String, Object>> included;

    private Folders() { }

    private Folders(Builder builder) {
        links = builder.links;
        meta = builder.meta;
        data = builder.data;
        included = builder.included;
    }

    public static class Builder {
        private Links links;
        private Meta meta;
        private List<FolderData> data;
        private List<Map<String,Object>> included;

        public Builder links(Links links) {
            this.links = links;
            return this;
        }

        public Builder meta(Meta meta) {
            this.meta = meta;
            return this;
        }

        public Builder data(List<FolderData> data) {
            this.data = data;
            return this;
        }

        public Builder included(List<Map<String, Object>> included) {
            this.included = included;
            return this;
        }

        public Folders build() {
            return new Folders(this);
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

    public List<Map<String, Object>> getIncluded() {
        return included;
    }

    @Override
    public List<FolderData> getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Folders{" +
                "links=" + links +
                ", meta=" + meta +
                ", data=" + data +
                ", included=" + included +
                '}';
    }
}
