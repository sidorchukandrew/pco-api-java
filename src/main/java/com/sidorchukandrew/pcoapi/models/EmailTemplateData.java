package com.sidorchukandrew.pcoapi.models;

public class EmailTemplateData implements Data {
    private String type;
    private Integer id;
    private EmailTemplateAttributes attributes;
    private Links links;
    private EmailTemplateRelationships relationships;

    private EmailTemplateData() { }

    private EmailTemplateData(Builder builder) {
        type = builder.type;
        id = builder.id;
        attributes = builder.attributes;
        links = builder.links;
        relationships = builder.relationships;
    }

    public static class Builder {
        private String type;
        private Integer id;
        private EmailTemplateAttributes attributes;
        private Links links;
        private EmailTemplateRelationships relationships;

        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public Builder id(Integer id) {
            this.id = id;
            return this;
        }

        public Builder attributes(EmailTemplateAttributes attributes) {
            this.attributes = attributes;
            return this;
        }

        public Builder links(Links links) {
            this.links = links;
            return this;
        }

        public Builder relationships(EmailTemplateRelationships relationships) {
            this.relationships = relationships;
            return this;
        }

        public EmailTemplateData build() {
            return new EmailTemplateData(this);
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
    public Attributes getAttributes() {
        return attributes;
    }

    @Override
    public Links getLinks() {
        return links;
    }

    public EmailTemplateRelationships getRelationships() {
        return relationships;
    }

    @Override
    public String toString() {
        return "EmailTemplateData{" +
                "type='" + type + '\'' +
                ", id=" + id +
                ", attributes=" + attributes +
                ", links=" + links +
                ", relationships=" + relationships +
                '}';
    }
}
