package com.sidorchukandrew.pcoapi.apis.services.models;

import java.util.List;
import java.util.Map;

public class AvailableSignups implements Collection {
    private Links links;
    private Meta meta;
    private List<AvailableSignupData> data;
    private List<Map<String, Object>> included;

    private AvailableSignups() { }

    private AvailableSignups(Builder builder) {
        links = builder.links;
        meta = builder.meta;
        data = builder.data;
        included = builder.included;
    }

    public static class Builder {
        private Links links;
        private Meta meta;
        private List<AvailableSignupData> data;
        private List<Map<String, Object>> included;

        public Builder links(Links links) {
            this.links = links;
            return this;
        }

        public Builder meta(Meta meta) {
            this.meta = meta;
            return this;
        }

        public Builder data(List<AvailableSignupData> data) {
            this.data = data;
            return this;
        }

        public Builder included(List<Map<String, Object>> included) {
            this.included = included;
            return this;
        }

        public AvailableSignups build() {
            return new AvailableSignups(this);
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
    public List<AvailableSignupData> getData() {
        return data;
    }

    @Override
    public List<Map<String, Object>> getIncluded() {
        return included;
    }

    @Override
    public String toString() {
        return "AvailableSignups{" +
                "links=" + links +
                ", meta=" + meta +
                ", data=" + data +
                ", included=" + included +
                '}';
    }
}
