package com.sidorchukandrew.pcoapi.models;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class MediaArchiveData {
    private String type;
    private Map<String, String> attributes;

    private MediaArchiveData() { }

    private MediaArchiveData(Builder builder) {
        type = builder.type;
        attributes = builder.attributes;
    }

    public static class Builder {
        private String type;
        private Map<String, String> attributes;

        public Builder() {
            attributes = new HashMap<>();
        }

        public Builder type(String type) {
            this.type = type;
            return  this;
        }

        public Builder time(LocalDateTime archiveTime) {
            attributes.put("time", archiveTime.toString() + "Z");
            return this;
        }

        public MediaArchiveData build() {
            return new MediaArchiveData(this);
        }
    }

    public String getType() {
        return type;
    }

    public Map<String, String> getAttributes() {
        return attributes;
    }

    @Override
    public String toString() {
        return "MediaArchiveData{" +
                "type='" + type + '\'' +
                ", attributes=" + attributes +
                '}';
    }
}
