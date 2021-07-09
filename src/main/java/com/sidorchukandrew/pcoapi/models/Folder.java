package com.sidorchukandrew.pcoapi.models;

import java.util.List;
import java.util.Map;

public class Folder implements Resource {
    private FolderData data;
    private Meta meta;
    private List<Map<String, Object>> included;

    private Folder() { }

    private Folder(Builder builder) {
        data = builder.data;
        meta = builder.meta;
        included = builder.included;
    }

    public static class Builder {
        private FolderData data;
        private Meta meta;
        private List<Map<String, Object>> included;

        public Builder data(FolderData data) {
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

        public Folder build() {
            return new Folder(this);
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
        return "Folder{" +
                "data=" + data +
                ", meta=" + meta +
                ", included=" + included +
                '}';
    }
}
