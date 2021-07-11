package com.sidorchukandrew.pcoapi.models;

import java.util.List;
import java.util.Map;

public class Attachment implements Resource {
    private AttachmentData data;
    private Meta meta;
    private List<Map<String, Object>> included;

    private Attachment() { }

    private Attachment(Builder builder) {
        data = builder.data;
        meta = builder.meta;
        included = builder.included;
    }

    public static class Builder {
        private AttachmentData data;
        private Meta meta;
        private List<Map<String, Object>> included;

        public Builder data(AttachmentData data) {
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

        public Attachment build() {
            return new Attachment(this);
        }
    }

    @Override
    public AttachmentData getData() {
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
        return "Attachment{" +
                "data=" + data +
                ", meta=" + meta +
                ", included=" + included +
                '}';
    }
}
