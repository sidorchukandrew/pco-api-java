package com.sidorchukandrew.pcoapi.apis.services.models;

import java.time.LocalDate;

public class AttachmentActivityAttributes implements Attributes {
    private LocalDate date;
    private String attachmentUrl;
    private String activityType;

    private AttachmentActivityAttributes() { }

    private AttachmentActivityAttributes(Builder builder) {
        date = builder.date;
        attachmentUrl = builder.attachmentUrl;
        activityType = builder.activityType;
    }

    public static class Builder {
        private LocalDate date;
        private String attachmentUrl;
        private String activityType;

        public Builder date(LocalDate date) {
            this.date = date;
            return this;
        }

        public Builder attachmentUrl(String attachmentUrl) {
            this.attachmentUrl = attachmentUrl;
            return this;
        }

        public Builder activityType(String activityType) {
            this.activityType = activityType;
            return this;
        }

        public AttachmentActivityAttributes build() {
            return new AttachmentActivityAttributes(this);
        }
    }

    public LocalDate getDate() {
        return date;
    }

    public String getAttachmentUrl() {
        return attachmentUrl;
    }

    public String getActivityType() {
        return activityType;
    }

    @Override
    public String toString() {
        return "AttachmentActivityAttributes{" +
                "date=" + date +
                ", attachmentUrl='" + attachmentUrl + '\'' +
                ", activityType='" + activityType + '\'' +
                '}';
    }
}
