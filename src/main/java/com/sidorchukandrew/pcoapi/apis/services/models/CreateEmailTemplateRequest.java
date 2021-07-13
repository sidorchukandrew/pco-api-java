package com.sidorchukandrew.pcoapi.apis.services.models;

public class CreateEmailTemplateRequest implements CreateRequest {
    private String htmlBody;
    private String subject;
    private String kind;

    private CreateEmailTemplateRequest() { }

    private CreateEmailTemplateRequest(Builder builder) {
        htmlBody = builder.htmlBody;
        subject = builder.subject;
        kind = builder.kind;
    }

    public static class Builder {
        private String htmlBody;
        private String subject;
        private String kind;

        public Builder htmlBody(String htmlBody) {
            this.htmlBody = htmlBody;
            return this;
        }

        public Builder subject(String subject) {
            this.subject = subject;
            return this;
        }

        public Builder kind(String kind) {
            this.kind = kind;
            return this;
        }

        public CreateEmailTemplateRequest build() {
            return new CreateEmailTemplateRequest(this);
        }
    }

    public String getHtmlBody() {
        return htmlBody;
    }

    public String getSubject() {
        return subject;
    }

    public String getKind() {
        return kind;
    }

    @Override
    public Resource toResource() {
        EmailTemplateAttributes attributes = new EmailTemplateAttributes.Builder()
                .kind(kind)
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
        return "CreateEmailTemplateRequest{" +
                "htmlBody='" + htmlBody + '\'' +
                ", subject='" + subject + '\'' +
                ", kind='" + kind + '\'' +
                '}';
    }
}
