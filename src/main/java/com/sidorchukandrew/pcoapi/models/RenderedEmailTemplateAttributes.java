package com.sidorchukandrew.pcoapi.models;

public class RenderedEmailTemplateAttributes {
    private String body;
    private String subject;

    private RenderedEmailTemplateAttributes() { }

    private RenderedEmailTemplateAttributes(Builder builder) {
        body = builder.body;
        subject = builder.subject;
    }

    public static class Builder {
        private String body;
        private String subject;

        public Builder body(String body) {
            this.body = body;
            return this;
        }

        public Builder subject(String subject) {
            this.subject = subject;
            return this;
        }

        public RenderedEmailTemplateAttributes build() {
            return new RenderedEmailTemplateAttributes(this);
        }
    }

    public String getBody() {
        return body;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public String toString() {
        return "RenderedEmailTemplateAttributes{" +
                "body='" + body + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }
}
