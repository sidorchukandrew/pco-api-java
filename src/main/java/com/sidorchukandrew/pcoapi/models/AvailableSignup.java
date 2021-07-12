package com.sidorchukandrew.pcoapi.models;

import java.util.List;
import java.util.Map;

public class AvailableSignup implements Resource {
    private AvailableSignupData data;
    private Meta meta;
    private List<Map<String, Object>> included;

    private AvailableSignup() { }

    private AvailableSignup(Builder builder) {
        data = builder.data;
        meta = builder.meta;
        included = builder.included;
    }

    public static class Builder {
        private AvailableSignupData data;
        private Meta meta;
        private List<Map<String, Object>> included;

        public Builder data(AvailableSignupData data) {
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

        public AvailableSignup build() {
            return new AvailableSignup(this);
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
        return "AvailableSignup{" +
                "data=" + data +
                ", meta=" + meta +
                ", included=" + included +
                '}';
    }
}
