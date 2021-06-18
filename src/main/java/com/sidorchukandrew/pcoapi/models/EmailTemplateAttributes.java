package com.sidorchukandrew.pcoapi.models;

import java.time.LocalDateTime;

public class EmailTemplateAttributes {
    private LocalDateTime createdAt;
    private String htmlBody;
    private String kind;
    private String subject;
    private LocalDateTime updatedAt;

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public String getHtmlBody() {
        return htmlBody;
    }

    public String getKind() {
        return kind;
    }

    public String getSubject() {
        return subject;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    @Override
    public String toString() {
        return "EmailTemplateAttributes{" +
                "createdAt=" + createdAt +
                ", htmlBody='" + htmlBody + '\'' +
                ", kind='" + kind + '\'' +
                ", subject='" + subject + '\'' +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
