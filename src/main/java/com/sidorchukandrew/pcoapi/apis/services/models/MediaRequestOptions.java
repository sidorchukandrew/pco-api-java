package com.sidorchukandrew.pcoapi.apis.services.models;

import com.sidorchukandrew.pcoapi.apis.services.filterby.MediaFilterableParam;
import com.sidorchukandrew.pcoapi.apis.services.include.MediaIncludableResource;
import com.sidorchukandrew.pcoapi.apis.services.orderby.MediaOrderableParam;
import com.sidorchukandrew.pcoapi.apis.services.queryby.MediaQueryableParam;

import java.util.*;

public class MediaRequestOptions implements RequestOptions {
    private Map<String, String> options;

    private MediaRequestOptions() { }

    private MediaRequestOptions(Builder builder) {
        options = builder.options;
    }

    public static class Builder {
        private Map<String, String> options;
        private Set<String> filters;

        public Builder() {
            options = new HashMap<>();
            filters = new HashSet<>();
        }

        public Builder queryBy(MediaQueryableParam queryableParam, String value) {
            options.put(queryableParam.getLabel(), value);
            return this;
        }

        public Builder orderBy(MediaOrderableParam orderableParam) {
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

        public Builder include(MediaIncludableResource includableResource) {
            options.put("include", includableResource.getLabel());
            return this;
        }

        public Builder filterBy(MediaFilterableParam filterableParam) {
            filters.add(filterableParam.getLabel());
            return this;
        }

        public MediaRequestOptions build() {
            if(!filters.isEmpty()) {
                addFiltersToOptions();
            }

            return new MediaRequestOptions(this);
        }

        private void addFiltersToOptions() {
            StringBuilder joinedFilters = new StringBuilder();
            Iterator<String> iterator = filters.iterator();

            while(iterator.hasNext()) {
                joinedFilters.append(iterator.next());
                if(iterator.hasNext()) joinedFilters.append(",");
            }

            options.put("filter", joinedFilters.toString());
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
