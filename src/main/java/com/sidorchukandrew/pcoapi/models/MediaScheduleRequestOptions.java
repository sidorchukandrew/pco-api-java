package com.sidorchukandrew.pcoapi.models;

import java.util.HashMap;
import java.util.Map;

public class MediaScheduleRequestOptions implements RequestOptions {
    private Map<String, String> options;

    private MediaScheduleRequestOptions() { }

    private MediaScheduleRequestOptions(Builder builder) {
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

        public MediaScheduleRequestOptions build() {
            return new MediaScheduleRequestOptions(this);
        }
    }

    @Override
    public Map<String, String> getOptions() {
        return options;
    }

    @Override
    public String toString() {
        return "MediaScheduleRequestOptions{" +
                "options=" + options +
                '}';
    }
}
