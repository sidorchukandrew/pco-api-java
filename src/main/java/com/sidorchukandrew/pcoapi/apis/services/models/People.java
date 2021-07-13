package com.sidorchukandrew.pcoapi.apis.services.models;

import java.util.List;
import java.util.Map;

public class People implements Collection {
    private Links links;
    private Meta meta;
    private List<PersonData> data;
    private List<Map<String, Object>> included;

    private People() { }

    private People(Builder builder) {
        links = builder.links;
        data = builder.data;
        meta = builder.meta;
        included = builder.included;
    }

    public static class Builder {
        private Links links;
        private Meta meta;
        private List<PersonData> data;
        private List<Map<String, Object>> included;

        public Builder links(Links links) {
            this.links = links;
            return this;
        }

        public Builder meta(Meta meta) {
            this.meta = meta;
            return this;
        }

        public Builder data(List<PersonData> data) {
            this.data = data;
            return this;
        }

        public Builder included(List<Map<String, Object>> included) {
            this.included = included;
            return this;
        }

        public People build() {
            return new People(this);
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
    public List<PersonData> getData() {
        return data;
    }

    @Override
    public List<Map<String, Object>>  getIncluded() {
        return included;
    }

    @Override
    public String toString() {
        return "People{" +
                "links=" + links +
                ", meta=" + meta +
                ", data=" + data +
                ", included=" + included +
                '}';
    }
}
