package com.sidorchukandrew.pcoapi.models;

import java.util.HashMap;
import java.util.Map;

public class EmailTemplateRequestOptions implements  RequestOptions {
    private Map<String, String> options;

    private EmailTemplateRequestOptions() { }

    private EmailTemplateRequestOptions(Builder builder) {
        options = builder.options;
    }

    public static class Builder {
        private Map<String, String> options;

        public Builder() {
            options = new HashMap<>();
        }

        public Builder offset(Integer offset) {
            options.put("offset", offset.toString());
            return this;
        }

        public Builder perPage(Integer perPage) {
            options.put("per_page", perPage.toString());
            return this;
        }

        public EmailTemplateRequestOptions build() {
            return new EmailTemplateRequestOptions(this);
        }
    }

    @Override
    public Map<String, String> getOptions() {
        return options;
    }

    @Override
    public String toString() {
        return "EmailTemplateRequestOptions{" +
                "options=" + options +
                '}';
    }
}
