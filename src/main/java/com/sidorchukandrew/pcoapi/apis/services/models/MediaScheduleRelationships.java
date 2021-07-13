package com.sidorchukandrew.pcoapi.apis.services.models;

public class MediaScheduleRelationships {
    private Relationship plan;
    private Relationship serviceType;

    private MediaScheduleRelationships() { }

    private MediaScheduleRelationships(Builder builder) {
        plan = builder.plan;
        serviceType = builder.serviceType;
    }

    public static class Builder {
        private Relationship plan;
        private Relationship serviceType;

        public Builder plan(Relationship plan) {
            this.plan = plan;
            return this;
        }

        public Builder serviceType(Relationship serviceType) {
            this.serviceType = serviceType;
            return this;
        }

        public MediaScheduleRelationships build() {
            return new MediaScheduleRelationships(this);
        }
    }

    public Relationship getPlan() {
        return plan;
    }

    public Relationship getServiceType() {
        return serviceType;
    }

    @Override
    public String toString() {
        return "MediaScheduleRelationships{" +
                "plan=" + plan +
                ", serviceType=" + serviceType +
                '}';
    }
}
