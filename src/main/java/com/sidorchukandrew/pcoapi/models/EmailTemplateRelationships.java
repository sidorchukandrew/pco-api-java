package com.sidorchukandrew.pcoapi.models;

public class EmailTemplateRelationships {
    private Relationship templateOwner;

    private EmailTemplateRelationships() { }

    private EmailTemplateRelationships(Builder builder) {
        templateOwner = builder.templateOwner;
    }

    public static class Builder {
        private Relationship templateOwner;

        public Builder templateOwner(Relationship templateOwner) {
            this.templateOwner = templateOwner;
            return this;
        }

        public EmailTemplateRelationships build() {
            return new EmailTemplateRelationships(this);
        }
    }

    public Relationship getTemplateOwner() {
        return templateOwner;
    }

    @Override
    public String toString() {
        return "EmailTemplateRelationships{" +
                "templateOwner=" + templateOwner +
                '}';
    }
}
