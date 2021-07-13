package com.sidorchukandrew.pcoapi.apis.services.models;

public class SignupSheetData implements Data {
    private String type;
    private String id;
    private SignupSheetLinks links;
    private SignupSheetAttributes attributes;
    private SignupSheetRelationships relationships;

    private SignupSheetData() { }

    private SignupSheetData(Builder builder) {
        type = builder.type;
        id = builder.id;
        links = builder.links;
        attributes = builder.attributes;
        relationships = builder.relationships;
    }

    public static class Builder {
        private String type;
        private String id;
        private SignupSheetLinks links;
        private SignupSheetAttributes attributes;
        private SignupSheetRelationships relationships;

        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder links(SignupSheetLinks links) {
            this.links = links;
            return this;
        }

        public Builder attributes(SignupSheetAttributes attributes) {
            this.attributes = attributes;
            return this;
        }

        public Builder relationships(SignupSheetRelationships relationships) {
            this.relationships = relationships;
            return this;
        }

        public SignupSheetData build() {
            return new SignupSheetData(this);
        }
    }

    public String getType() {
        return type;
    }

    public String getId() {
        return id;
    }

    public SignupSheetAttributes getAttributes() {
        return attributes;
    }

    public SignupSheetLinks getLinks() {
        return links;
    }

    public SignupSheetRelationships getRelationships() {
        return relationships;
    }

    @Override
    public String toString() {
        return "SignupSheetData{" +
                "type='" + type + '\'' +
                ", id='" + id + '\'' +
                ", links=" + links +
                ", attributes=" + attributes +
                ", relationships=" + relationships +
                '}';
    }
}
