package com.sidorchukandrew.pcoapi.models;

import java.util.List;
import java.util.Map;

public class SignupSheet implements Resource {
    private SignupSheetData data;
    private List<Map<String, Object>> included;
    private Meta meta;

    private SignupSheet() { }

    private SignupSheet(Builder builder) {
        data = builder.data;
        included = builder.included;
        meta = builder.meta;
    }

    public static class Builder {
        private SignupSheetData data;
        private List<Map<String, Object>> included;
        private Meta meta;

        public Builder data(SignupSheetData data) {
            this.data = data;
            return this;
        }

        public Builder included(List<Map<String, Object>> included) {
            this.included = included;
            return this;
        }

        public Builder meta(Meta meta) {
            this.meta = meta;
            return this;
        }

        public SignupSheet build() {
            return new SignupSheet(this);
        }
    }

    public SignupSheetData getData() {
        return data;
    }

    public List<Map<String, Object>> getIncluded() {
        return included;
    }

    public Meta getMeta() {
        return meta;
    }

    @Override
    public String toString() {
        return "SignupSheet{" +
                "data=" + data +
                ", included=" + included +
                ", meta=" + meta +
                '}';
    }
}
