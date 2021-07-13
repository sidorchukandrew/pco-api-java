package com.sidorchukandrew.pcoapi.apis.services.models;


public class RenderEmailTemplateRelationships {
    private Relationship person;
    private Relationship emailTemplate;

    private RenderEmailTemplateRelationships() { }

    public RenderEmailTemplateRelationships(Relationship person) {
        this.person = person;
    }

    public RenderEmailTemplateRelationships(Relationship person, Relationship emailTemplate) {
        this.emailTemplate = emailTemplate;
        this.person = person;
    }

    public Relationship getPerson() {
        return person;
    }

    public Relationship getEmailTemplate() {
        return emailTemplate;
    }

    @Override
    public String toString() {
        return "RenderEmailTemplateRelationships{" +
                "person=" + person +
                ", emailTemplate=" + emailTemplate +
                '}';
    }
}
