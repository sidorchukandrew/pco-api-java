package com.sidorchukandrew.pcoapi.models;

import com.sidorchukandrew.pcoapi.include.MediaIncludableResource;
import com.sidorchukandrew.pcoapi.orderby.MediaOrderableAttribute;
import com.sidorchukandrew.pcoapi.queryby.MediaQueryableAttribute;

import java.util.HashMap;
import java.util.Map;

public class MediaRequestOptions implements RequestOptions {
    private Map<String, String> options;

    private MediaRequestOptions() { }

    private MediaRequestOptions(Builder builder) {
        options = builder.options;
    }

    public static class Builder {
        private Map<String, String> options;

        public Builder() {
            options = new HashMap<>();
        }

        public Builder queryBy(MediaQueryableAttribute queryableAttribute, String value) {
            options.put(queryableAttribute.getLabel(), value);
            return this;
        }

        public Builder orderBy(MediaOrderableAttribute orderableAttribute) {
            options.put("order", orderableAttribute.getLabel());
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

        public Builder include(MediaIncludableResource includableResource) {
            options.put("include", includableResource.getLabel());
            return this;
        }

        public MediaRequestOptions build() {
            return new MediaRequestOptions(this);
        }

    }

    @Override
    public Map<String, String> getOptions() {
        return options;
    }

    @Override
    public String toString() {
        return "MediaRequestOptions{" +
                "options=" + options +
                '}';
    }
}
