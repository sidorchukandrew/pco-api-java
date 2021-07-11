package com.sidorchukandrew.pcoapi.models;

import java.util.List;
import java.util.Map;

public class Attachments implements Collection {
    private Links links;
    private List<AttachmentData> data;
    private List<Map<String, Object>> included;
    private Meta meta;

    private Attachments() { }

    private Attachments(Builder builder) {
        links = builder.links;
        data = builder.data;
        included = builder.included;
        meta = builder.meta;
    }

    public static class Builder {
        private Links links;
        private List<AttachmentData> data;
        private List<Map<String, Object>> included;
        private Meta meta;

        public Builder links(Links links) {
            this.links = links;
            return this;
        }

        public Builder data(List<AttachmentData> data) {
            this.data = data;
            return this;
        }

        public Builder included(List<Map<String, Object>> included) {
            this.included = included;
            return this;
        }

        public Builder meta(Meta meta) {
            this.meta = meta;
            return this;
        }

        public Attachments build() {
            return new Attachments(this);
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
    public List<AttachmentData> getData() {
        return data;
    }

    public List<Map<String, Object>> getIncluded() {
        return included;
    }

    @Override
    public String toString() {
        return "Attachments{" +
                "links=" + links +
                ", data=" + data +
                ", included=" + included +
                ", meta=" + meta +
                '}';
    }
}
