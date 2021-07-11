package com.sidorchukandrew.pcoapi.models;

import com.sidorchukandrew.pcoapi.include.AttachmentIncludableResource;
import com.sidorchukandrew.pcoapi.orderby.AttachmentOrderableParam;
import com.sidorchukandrew.pcoapi.queryby.AttachmentQueryableParam;

import java.util.HashMap;
import java.util.Map;

public class AttachmentRequestOptions implements RequestOptions {
    private Map<String, String> options;

    private AttachmentRequestOptions() { }

    private AttachmentRequestOptions(Builder builder) {
        options = builder.options;
    }

    public static class Builder {
        private Map<String, String> options;

        public Builder() {
            options = new HashMap<>();
        }

        public Builder orderBy(AttachmentOrderableParam orderableParam) {
            options.put("order", orderableParam.getLabel());
            return this;
        }

        public Builder queryBy(AttachmentQueryableParam queryableParam, String value) {
            options.put(queryableParam.getLabel(), value);
            return this;
        }

        public Builder include(AttachmentIncludableResource includableResource) {
            options.put("include", includableResource.getLabel());
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

        public AttachmentRequestOptions build() {
            return new AttachmentRequestOptions(this);
        }
    }

    @Override
    public Map<String, String> getOptions() {
        return options;
    }

    @Override
    public String toString() {
        return "AttachmentRequestOptions{" +
                "options=" + options +
                '}';
    }
}
