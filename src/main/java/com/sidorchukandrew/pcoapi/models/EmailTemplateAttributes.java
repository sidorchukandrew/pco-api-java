package com.sidorchukandrew.pcoapi.models;

import java.time.LocalDateTime;

public class EmailTemplateAttributes implements Attributes {
    private String kind;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String htmlBody;
    private String subject;

    private EmailTemplateAttributes() { }

    private EmailTemplateAttributes(Builder builder) {
        kind = builder.kind;
        createdAt = builder.createdAt;
        updatedAt = builder.updatedAt;
        htmlBody = builder.htmlBody;
        subject = builder.subject;
    }

    public static class Builder {
        private String kind;
        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;
        private String htmlBody;
        private String subject;

        public Builder kind(String kind) {
            this.kind = kind;
            return this;
        }

        public Builder createdAt(LocalDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder updatedAt(LocalDateTime updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public Builder htmlBody(String htmlBody) {
            this.htmlBody = htmlBody;
            return this;
        }

        public Builder subject(String subject) {
            this.subject = subject;
            return this;
        }

        public EmailTemplateAttributes build() {
            return new EmailTemplateAttributes(this);
        }
    }

    public String getKind() {
        return kind;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public String getHtmlBody() {
        return htmlBody;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public String toString() {
        return "EmailTemplateAttributes{" +
                "kind='" + kind + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", htmlBody='" + htmlBody + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }
}
