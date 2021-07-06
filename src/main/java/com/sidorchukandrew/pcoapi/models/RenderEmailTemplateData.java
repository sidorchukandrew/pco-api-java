package com.sidorchukandrew.pcoapi.models;

class RenderEmailTemplateData {
    private RenderEmailTemplateAttributes attributes;
    private RenderEmailTemplateRelationships relationships;

    public RenderEmailTemplateData(RenderEmailTemplateAttributes attributes, RenderEmailTemplateRelationships relationships) {
        this.attributes = attributes;
        this.relationships = relationships;
    }

    public RenderEmailTemplateAttributes getAttributes() {
        return attributes;
    }

    public RenderEmailTemplateRelationships getRelationships() {
        return relationships;
    }

    @Override
    public String toString() {
        return "RenderEmailTemplateData{" +
                "attributes=" + attributes +
                ", relationships=" + relationships +
                '}';
    }
}
