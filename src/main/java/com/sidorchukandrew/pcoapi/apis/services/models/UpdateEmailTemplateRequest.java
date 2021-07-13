package com.sidorchukandrew.pcoapi.apis.services.models;

public class UpdateEmailTemplateRequest implements UpdateRequest {
    private String htmlBody;
    private String subject;

    private UpdateEmailTemplateRequest() { }

    private UpdateEmailTemplateRequest(Builder builder) {
        htmlBody = builder.htmlBody;
        subject = builder.subject;
    }

    public static class Builder {
        private String htmlBody;
        private String subject;

        public Builder htmlBody(String htmlBody) {
            this.htmlBody = htmlBody;
            return this;
        }

        public Builder subject(String subject) {
            this.subject = subject;
            return this;
        }

        public UpdateEmailTemplateRequest build() {
            return new UpdateEmailTemplateRequest(this);
        }
    }

    public String getHtmlBody() {
        return htmlBody;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public Resource toResource() {
        EmailTemplateAttributes attributes = new EmailTemplateAttributes.Builder()
                .htmlBody(htmlBody)
                .subject(subject)
                .build();

        EmailTemplateData data = new EmailTemplateData.Builder()
                .attributes(attributes)
                .type("email_template")
                .build();

        EmailTemplate emailTemplate = new EmailTemplate.Builder()
                .data(data)
                .build();

        return emailTemplate;
    }

    @Override
    public String toString() {
        return "UpdateEmailTemplateRequest{" +
                "htmlBody='" + htmlBody + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }
}
