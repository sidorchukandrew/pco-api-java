package com.sidorchukandrew.pcoapi.models;

public class EmailTemplateRelationships {
    private TemplateOwner templateOwner;

    private EmailTemplateRelationships() { }

    private EmailTemplateRelationships(Builder builder) {
        templateOwner = builder.templateOwner;
    }

    public static class Builder {
        private TemplateOwner templateOwner;

        public Builder templateOwner(TemplateOwner templateOwner) {
            this.templateOwner = templateOwner;
            return this;
        }

        public EmailTemplateRelationships build() {
            return new EmailTemplateRelationships(this);
        }
    }

    public TemplateOwner getTemplateOwner() {
        return templateOwner;
    }

    @Override
    public String toString() {
        return "EmailTemplateRelationships{" +
                "templateOwner=" + templateOwner +
                '}';
    }
}
