package com.sidorchukandrew.pcoapi.models;

public class RenderedEmailTemplateData {
    private String type;
    private String id;
    private Links links;
    private RenderedEmailTemplateAttributes attributes;
    private RenderEmailTemplateRelationships relationships;

    private RenderedEmailTemplateData() { }

    private RenderedEmailTemplateData(Builder builder) {
        type = builder.type;
        id = builder.id;
        links = builder.links;
        attributes = builder.attributes;
        relationships = builder.relationships;
    }

    public static class Builder {
        private String type;
        private String id;
        private Links links;
        private RenderedEmailTemplateAttributes attributes;
        private RenderEmailTemplateRelationships relationships;

        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder links(Links links) {
            this.links = links;
            return this;
        }

        public Builder attributes(RenderedEmailTemplateAttributes attributes) {
            this.attributes = attributes;
            return this;
        }

        public Builder relationships(RenderEmailTemplateRelationships relationships) {
            this.relationships = relationships;
            return this;
        }

        public RenderedEmailTemplateData build() {
            return new RenderedEmailTemplateData(this);
        }
    }

    public String getType() {
        return type;
    }

    public String getId() {
        return id;
    }

    public Links getLinks() {
        return links;
    }

    public RenderedEmailTemplateAttributes getAttributes() {
        return attributes;
    }

    public RenderEmailTemplateRelationships getRelationships() {
        return relationships;
    }

    @Override
    public String toString() {
        return "RenderedEmailTemplateData{" +
                "type='" + type + '\'' +
                ", id='" + id + '\'' +
                ", links=" + links +
                ", attributes=" + attributes +
                ", relationships=" + relationships +
                '}';
    }
}
