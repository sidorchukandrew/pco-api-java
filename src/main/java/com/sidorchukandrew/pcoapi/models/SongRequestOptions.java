package com.sidorchukandrew.pcoapi.models;

import com.sidorchukandrew.pcoapi.queryby.SongOrderableAttribute;
import com.sidorchukandrew.pcoapi.queryby.SongQueryableAttribute;

import java.util.HashMap;
import java.util.Map;

public class SongRequestOptions implements RequestOptions {
    private Map<String, String> options;

    private SongRequestOptions() { }

    private SongRequestOptions(Builder builder) {
        options = builder.options;
    }

    @Override
    public Map<String, String> getOptions() {
        return options;
    }

    public static class Builder {
        private Map<String, String> options;

        public Builder() {
            options = new HashMap<>();
        }

        public Builder queryBy(SongQueryableAttribute queryableAttribute, String value) {
            options.put(queryableAttribute.getLabel(), value);
            return this;
        }

        public Builder orderBy(SongOrderableAttribute orderableAttribute) {
            options.put("order", orderableAttribute.getLabel());
            return this;
        }

        public SongRequestOptions build() {
            return new SongRequestOptions(this);
        }
    }

}
