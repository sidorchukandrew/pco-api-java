package com.sidorchukandrew.pcoapi.apis.services.models;

import com.sidorchukandrew.pcoapi.apis.services.orderby.PersonOrderableParam;
import com.sidorchukandrew.pcoapi.apis.services.queryby.PersonQueryableParam;

import java.util.HashMap;
import java.util.Map;

public class PeopleRequestOptions implements RequestOptions {
    private Map<String, String> options;

    private PeopleRequestOptions() { }

    private PeopleRequestOptions(Builder builder) {
        options = builder.options;
    }

    public static class Builder {
        private Map<String, String> options;

        public Builder() {
            options = new HashMap<>();
        }

        public Builder orderBy(PersonOrderableParam orderableParam) {
            options.put("order", orderableParam.getLabel());
            return this;
        }

        public Builder queryBy(PersonQueryableParam queryableParam, String value) {
            options.put(queryableParam.getLabel(), value);
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

        public PeopleRequestOptions build() {
            return new PeopleRequestOptions(this);
        }
    }
    @Override
    public Map<String, String> getOptions() {
        return options;
    }

    @Override
    public String toString() {
        return "PeopleRequestOptions{" +
                "options=" + options +
                '}';
    }
}
