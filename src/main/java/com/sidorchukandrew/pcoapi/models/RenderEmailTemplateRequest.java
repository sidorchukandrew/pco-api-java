package com.sidorchukandrew.pcoapi.models;

public class RenderEmailTemplateRequest {
    private RenderEmailTemplateData data;

    private RenderEmailTemplateRequest() { }

    private RenderEmailTemplateRequest(Builder builder) {
        RelationshipData personData = new RelationshipData.Builder()
                .id(builder.personId)
                .type("Person")
                .build();

        Relationship person = new Relationship(personData);
        RenderEmailTemplateRelationships renderRelationships = new RenderEmailTemplateRelationships(person);

        RenderEmailTemplateAttributes attributes = new RenderEmailTemplateAttributes(builder.format);

        RenderEmailTemplateData renderData = new RenderEmailTemplateData(attributes, renderRelationships);

        this.data = renderData;
    }

    public static class Builder {
        private String format;
        private Integer personId;

        public Builder(RenderFormat format, Integer personId) {
            this.format = format.getLabel();
            this.personId = personId;
        }

        public RenderEmailTemplateRequest build() {
            return new RenderEmailTemplateRequest(this);
        }
    }

    public RenderEmailTemplateData getData() {
        return data;
    }

    @Override
    public String toString() {
        return "RenderEmailTemplateRequest{" +
                "data=" + data +
                '}';
    }
}
