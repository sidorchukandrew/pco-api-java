package com.sidorchukandrew.pcoapi.models;

import java.util.List;
import java.util.Map;

public class Person implements Resource {
    private PersonData data;
    private Meta meta;
    private List<Map<String, Object>> included;

    private Person() { }

    private Person(Builder builder) {
        data = builder.data;
        meta = builder.meta;
        included = builder.included;
    }

    public static class Builder {
        private PersonData data;
        private Meta meta;
        private List<Map<String, Object>> included;

        public Builder data(PersonData data) {
            this.data = data;
            return this;
        }

        public Builder meta(Meta meta) {
            this.meta = meta;
            return this;
        }

        public Builder included(List<Map<String, Object>> included) {
            this.included = included;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }

    @Override
    public PersonData getData() {
        return data;
    }

    @Override
    public Meta getMeta() {
        return meta;
    }

    public List<Map<String, Object>> getIncluded() {
        return included;
    }

    @Override
    public String toString() {
        return "Person{" +
                "data=" + data +
                ", meta=" + meta +
                ", included=" + included +
                '}';
    }
}
