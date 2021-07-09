package com.sidorchukandrew.pcoapi.models;

import java.util.List;
import java.util.Map;

public class Media implements Resource {
    private MediaData data;
    private Meta meta;
    private List<Map<String, Object>> included;

    private Media() { }

    private Media(Builder builder) {
        data = builder.data;
        meta = builder.meta;
        included = builder.included;
    }

    public static class Builder {
        private MediaData data;
        private Meta meta;
        private List<Map<String, Object>> included;

        public Builder data(MediaData data) {
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

        public Media build() {
            return new Media(this);
        }
    }

    @Override
    public Data getData() {
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
        return "Media{" +
                "data=" + data +
                ", meta=" + meta +
                ", included=" + included +
                '}';
    }
}
