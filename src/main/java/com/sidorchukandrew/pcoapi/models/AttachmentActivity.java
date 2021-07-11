package com.sidorchukandrew.pcoapi.models;

import java.util.List;
import java.util.Map;

public class AttachmentActivity implements Resource {
    private AttachmentActivityData data;
    private List<Map<String, Object>> included;
    private Meta meta;

    private AttachmentActivity() { }

    private AttachmentActivity(Builder builder) {
        data = builder.data;
        included = builder.included;
        meta = builder.meta;
    }

    public static class Builder {
        private AttachmentActivityData data;
        private List<Map<String, Object>> included;
        private Meta meta;

        public Builder data(AttachmentActivityData data) {
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

        public AttachmentActivity build() {
            return new AttachmentActivity(this);
        }
    }

    @Override
    public AttachmentActivityData getData() {
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
        return "AttachmentActivity{" +
                "data=" + data +
                ", included=" + included +
                ", meta=" + meta +
                '}';
    }
}
