package com.sidorchukandrew.pcoapi.apis.services.models;

public class PersonData implements Data {
    private String type;
    private Integer id;
    private PersonAttributes attributes;
    private PersonLinks links;
    private PersonRelationships relationships;

    private PersonData() { }

    private PersonData(Builder builder) {
        type = builder.type;
        id = builder.id;
        attributes = builder.attributes;
        links = builder.links;
        relationships = builder.relationships;
    }

    public static class Builder {
        private String type;
        private Integer id;
        private PersonAttributes attributes;
        private PersonLinks links;
        private PersonRelationships relationships;

        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public Builder id(Integer id) {
            this.id = id;
            return this;
        }

        public Builder attributes(PersonAttributes attributes) {
            this.attributes = attributes;
            return this;
        }

        public Builder links(PersonLinks links) {
            this.links = links;
            return this;
        }

        public Builder relationships(PersonRelationships relationships) {
            this.relationships = relationships;
            return this;
        }

        public PersonData build() {
            return new PersonData(this);
        }
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public PersonAttributes getAttributes() {
        return attributes;
    }

    @Override
    public PersonLinks getLinks() {
        return links;
    }

    public PersonRelationships getRelationships() {
        return relationships;
    }

    @Override
    public String toString() {
        return "PersonData{" +
                "type='" + type + '\'' +
                ", id=" + id +
                ", attributes=" + attributes +
                ", links=" + links +
                ", relationships=" + relationships +
                '}';
    }
}
