package com.sidorchukandrew.pcoapi.apis.services.models;

import java.util.List;
import java.util.Map;

public class Tag implements Resource {
    private TagData data;
    private Meta meta;
    private List<Map<String, Object>> included;

    private Tag() { }

    private Tag(Builder builder) {
        data = builder.data;
        meta = builder.meta;
        included = builder.included;
    }

    public static class Builder {
        private TagData data;
        private Meta meta;
        private List<Map<String, Object>> included;

        public Builder data(TagData data) {
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

        public Tag build() {
            return new Tag(this);
        }
    }

    @Override
    public TagData getData() {
        return data;
    }

    @Override
    public Meta getMeta() {
        return meta;
    }

    public List<Map<String, Object>> getIncluded() {
        return included;
    }

    @Override
    public String toString() {
        return "Tag{" +
                "data=" + data +
                ", meta=" + meta +
                ", included=" + included +
                '}';
    }
}
