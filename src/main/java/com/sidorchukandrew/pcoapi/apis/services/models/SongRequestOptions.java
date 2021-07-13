package com.sidorchukandrew.pcoapi.apis.services.models;

import com.sidorchukandrew.pcoapi.apis.services.orderby.SongOrderableParam;
import com.sidorchukandrew.pcoapi.apis.services.queryby.SongQueryableParam;

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

        public Builder queryBy(SongQueryableParam queryableParam, String value) {
            options.put(queryableParam.getLabel(), value);
            return this;
        }

        public Builder orderBy(SongOrderableParam orderableParam) {
            options.put("order", orderableParam.getLabel());
            return this;
        }

        public Builder offset(Integer offset) {
            options.put("offset", offset.toString());
            return this;
        }

        public Builder perPage(Integer perPage) {
            options.put("per_page", perPage.toString());
            return this;
        }

        public SongRequestOptions build() {
            return new SongRequestOptions(this);
        }
    }

    @Override
    public String toString() {
        return "SongRequestOptions{" +
                "options=" + options +
                '}';
    }
}
