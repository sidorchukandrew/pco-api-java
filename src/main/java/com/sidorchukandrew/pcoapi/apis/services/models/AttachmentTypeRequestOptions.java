package com.sidorchukandrew.pcoapi.apis.services.models;

import com.sidorchukandrew.pcoapi.apis.services.orderby.AttachmentTypeOrderableParam;

import java.util.HashMap;
import java.util.Map;

public class AttachmentTypeRequestOptions implements RequestOptions {
    private Map<String, String> options;

    private AttachmentTypeRequestOptions() { }

    private AttachmentTypeRequestOptions(Builder builder) {
        options = builder.options;
    }

    public static class Builder {
        private Map<String, String> options;

        public Builder () {
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

        public Builder orderBy(AttachmentTypeOrderableParam orderableParam) {
            options.put("order", orderableParam.getLabel());
            return this;
        }

        public AttachmentTypeRequestOptions build() {
            return new AttachmentTypeRequestOptions(this);
        }
    }
    @Override
    public Map<String, String> getOptions() {
        return options;
    }

    @Override
    public String toString() {
        return "AttachmentTypeRequestOptions{" +
                "options=" + options +
                '}';
    }
}
