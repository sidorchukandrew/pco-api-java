package com.sidorchukandrew.pcoapi.models;

import java.time.LocalDateTime;

public class MediaScheduleAttributes implements Attributes {
    private String planDates;
    private String planShortDates;
    private String serviceTypeName;
    private LocalDateTime planSortDate;

    private MediaScheduleAttributes() { }

    private MediaScheduleAttributes(Builder builder) {
        planDates = builder.planDates;
        planShortDates = builder.planShortDates;
        serviceTypeName = builder.serviceTypeName;
        planSortDate = builder.planSortDate;
    }

    public static class Builder {
        private String planDates;
        private String planShortDates;
        private String serviceTypeName;
        private LocalDateTime planSortDate;

        public Builder planDates(String planDates) {
            this.planDates = planDates;
            return this;
        }

        public Builder planShortDates(String planShortDates) {
            this.planShortDates = planShortDates;
            return this;
        }

        public Builder serviceTypeName(String serviceTypeName) {
            this.serviceTypeName = serviceTypeName;
            return this;
        }

        public Builder planSortDate(LocalDateTime planSortDate) {
            this.planSortDate = planSortDate;
            return this;
        }

        public MediaScheduleAttributes build() {
            return new MediaScheduleAttributes(this);
        }
    }

    public String getPlanDates() {
        return planDates;
    }

    public String getPlanShortDates() {
        return planShortDates;
    }

    public String getServiceTypeName() {
        return serviceTypeName;
    }

    public LocalDateTime getPlanSortDate() {
        return planSortDate;
    }

    @Override
    public String toString() {
        return "MediaScheduleAttributes{" +
                "planDates='" + planDates + '\'' +
                ", planShortDates='" + planShortDates + '\'' +
                ", serviceTypeName='" + serviceTypeName + '\'' +
                ", planSortDate=" + planSortDate +
                '}';
    }
}
