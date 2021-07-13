package com.sidorchukandrew.pcoapi.apis.services.models;

import com.sidorchukandrew.pcoapi.apis.services.include.AvailableSignupIncludableResource;

import java.util.HashMap;
import java.util.Map;

public class AvailableSignupRequestOptions implements RequestOptions {
    private Map<String, String> options;

    private AvailableSignupRequestOptions() { }

    private AvailableSignupRequestOptions(Builder builder) {
        options = builder.options;
    }

    public static class Builder {
        private Map<String, String> options;

        public Builder() {
            options = new HashMap<>();
        }

        public Builder include(AvailableSignupIncludableResource includableResource) {
            options.put("include", includableResource.getLabel());
            return this;
        }

        public Builder perPage(Integer perPage) {
            options.put("per_page", perPage.toString());
            return this;
        }

        public Builder offset(Integer offset) {
            options.put("offset", offset.toString());
            return this;
        }

        public AvailableSignupRequestOptions build() {
            return new AvailableSignupRequestOptions(this);
        }
    }

    @Override
    public Map<String, String> getOptions() {
        return options;
    }

    @Override
    public String toString() {
        return "AvailableSignupRequestOptions{" +
                "options=" + options +
                '}';
    }
}
