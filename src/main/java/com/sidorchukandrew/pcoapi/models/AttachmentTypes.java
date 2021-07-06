package com.sidorchukandrew.pcoapi.models;

import java.util.List;

public class AttachmentTypes implements Collection {
    private Links links;
    private Meta meta;
    private List<AttachmentTypeData> data;

    private AttachmentTypes() { }

    private AttachmentTypes(Builder builder) {
        links = builder.links;
        meta = builder.meta;
        data = builder.data;
    }

    public static class Builder {
        private Links links;
        private Meta meta;
        private List<AttachmentTypeData> data;

        public Builder links(Links links) {
            this.links = links;
            return this;
        }

        public Builder meta(Meta meta) {
            this.meta = meta;
            return this;
        }

        public Builder data(List<AttachmentTypeData> data) {
            this.data = data;
            return this;
        }

        public AttachmentTypes build() {
            return new AttachmentTypes(this);
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
    public List<AttachmentTypeData> getData() {
        return data;
    }

    @Override
    public String toString() {
        return "AttachmentTypes{" +
                "links=" + links +
                ", meta=" + meta +
                ", data=" + data +
                '}';
    }
}
