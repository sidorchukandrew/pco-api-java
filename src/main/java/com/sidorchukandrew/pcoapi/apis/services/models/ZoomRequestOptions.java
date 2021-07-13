package com.sidorchukandrew.pcoapi.apis.services.models;

import java.util.HashMap;
import java.util.Map;

public class ZoomRequestOptions implements RequestOptions {
    private Map<String, String> options;

    private ZoomRequestOptions() { }

    private ZoomRequestOptions(Builder builder) {
        options = builder.options;
    }

    public static class Builder {
        private Map<String, String> options;

        public Builder() {
            options = new HashMap<>();
        }

        public Builder perPage(Integer perPage) {
            options.put("per_page", perPage.toString());
            return this;
        }

        public Builder offset(Integer offset) {
            options.put("offset", offset.toString());
            return this;
        }

        public ZoomRequestOptions build() {
            return new ZoomRequestOptions(this);
        }
    }

    @Override
    public Map<String, String> getOptions() {
        return options;
    }

    @Override
    public String toString() {
        return "ZoomRequestOptions{" +
                "options=" + options +
                '}';
    }
}
