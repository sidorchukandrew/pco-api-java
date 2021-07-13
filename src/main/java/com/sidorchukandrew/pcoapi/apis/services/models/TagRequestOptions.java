package com.sidorchukandrew.pcoapi.apis.services.models;

import java.util.HashMap;
import java.util.Map;

public class TagRequestOptions implements RequestOptions {
    private Map<String, String> options;

    private TagRequestOptions() { }

    private TagRequestOptions(Builder builder) {
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

        public TagRequestOptions build() {
            return new TagRequestOptions(this);
        }
    }

    @Override
    public Map<String, String> getOptions() {
        return options;
    }

    @Override
    public String toString() {
        return "TagRequestOptions{" +
                "options=" + options +
                '}';
    }
}
