package com.sidorchukandrew.pcoapi.apis.services.models;

import com.sidorchukandrew.pcoapi.apis.services.include.SignupSheetIncludableResource;

import java.util.*;

public class SignupSheetRequestOptions implements RequestOptions {
    private Map<String, String> options;

    private SignupSheetRequestOptions() { }

    private SignupSheetRequestOptions(Builder builder) {
        options = builder.options;
    }

    public static class Builder {
        private Map<String, String> options;
        private Set<String> included;

        public Builder() {
            options = new HashMap<>();
            included = new HashSet<>();
        }

        public Builder offset(Integer offset) {
            options.put("offset", offset.toString());
            return this;
        }

        public Builder perPage(Integer perPage) {
            options.put("per_page", perPage.toString());
            return this;
        }

        public Builder include(SignupSheetIncludableResource includableResource) {
            included.add(includableResource.getLabel());
            return this;
        }

        public SignupSheetRequestOptions build() {
            if(!included.isEmpty()) {
                addIncludedToOptions();
            }

            return new SignupSheetRequestOptions(this);
        }

        private void addIncludedToOptions() {
            StringBuilder joinedInclusions = new StringBuilder();
            Iterator<String> iterator = included.iterator();

            while(iterator.hasNext()) {
                joinedInclusions.append(iterator.next());
                if(iterator.hasNext()) joinedInclusions.append(",");
            }

            options.put("include", joinedInclusions.toString());
        }
    }

    @Override
    public Map<String, String> getOptions() {
        return options;
    }

    @Override
    public String toString() {
        return "SignupSheetRequestOptions{" +
                "options=" + options +
                '}';
    }
}
