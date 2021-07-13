package com.sidorchukandrew.pcoapi.apis.services.models;

import java.util.List;
import java.util.Map;

public class MediaSchedule implements Resource {
    private MediaScheduleData data;
    private Meta meta;
    private List<Map<String, Object>> included;

    private MediaSchedule() { }

    private MediaSchedule(Builder builder) {
        data = builder.data;
        meta = builder.meta;
        included = builder.included;
    }

    public static class Builder {
        private MediaScheduleData data;
        private Meta meta;
        private List<Map<String, Object>> included;

        public Builder data(MediaScheduleData data) {
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

        public MediaSchedule build() {
            return new MediaSchedule(this);
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
        return "MediaSchedule{" +
                "data=" + data +
                ", meta=" + meta +
                ", included=" + included +
                '}';
    }
}
