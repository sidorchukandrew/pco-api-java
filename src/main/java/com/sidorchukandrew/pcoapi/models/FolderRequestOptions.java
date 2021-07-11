package com.sidorchukandrew.pcoapi.models;

import com.sidorchukandrew.pcoapi.include.FolderIncludableResource;
import com.sidorchukandrew.pcoapi.orderby.FolderOrderableParam;
import com.sidorchukandrew.pcoapi.queryby.FolderQueryableParam;

import java.util.HashMap;
import java.util.Map;

public class FolderRequestOptions implements RequestOptions {
    private Map<String, String> options;

    private FolderRequestOptions() { }

    private FolderRequestOptions(Builder builder) {
        options = builder.options;
    }

    public static class Builder {
        private Map<String, String> options;

        public Builder() {
            options = new HashMap<>();
        }

        public Builder queryBy(FolderQueryableParam queryableParam, String value) {
            options.put(queryableParam.getLabel(), value);
            return this;
        }

        public Builder orderBy(FolderOrderableParam orderableParam) {
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

        public Builder include(FolderIncludableResource includableResource) {
            options.put("include", includableResource.getLabel());
            return this;
        }

        public FolderRequestOptions build() {
            return new FolderRequestOptions(this);
        }
    }

    @Override
    public Map<String, String> getOptions() {
        return options;
    }
}
