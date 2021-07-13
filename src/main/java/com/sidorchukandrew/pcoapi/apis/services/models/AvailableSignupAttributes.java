package com.sidorchukandrew.pcoapi.apis.services.models;

public class AvailableSignupAttributes implements Attributes {
    private String organizationName;
    private String planningCenterUrl;
    private String serviceTypeName;
    private Boolean signupsAvailable;

    private AvailableSignupAttributes() { }

    private AvailableSignupAttributes(Builder builder) {
        organizationName = builder.organizationName;
        planningCenterUrl = builder.planningCenterUrl;
        serviceTypeName = builder.serviceTypeName;
        signupsAvailable = builder.signupsAvailable;
    }

    public static class Builder {
        private String organizationName;
        private String planningCenterUrl;
        private String serviceTypeName;
        private Boolean signupsAvailable;

        public Builder organizationName(String organizationName) {
            this.organizationName = organizationName;
            return this;
        }

        public Builder planningCenterUrl(String planningCenterUrl) {
            this.planningCenterUrl = planningCenterUrl;
            return this;
        }

        public Builder serviceTypeName(String serviceTypeName) {
            this.serviceTypeName = serviceTypeName;
            return this;
        }

        public Builder signupsAvailable(Boolean signupsAvailable) {
            this.signupsAvailable = signupsAvailable;
            return this;
        }

        public AvailableSignupAttributes build() {
            return new AvailableSignupAttributes(this);
        }
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public String getPlanningCenterUrl() {
        return planningCenterUrl;
    }

    public String getServiceTypeName() {
        return serviceTypeName;
    }

    public Boolean getSignupsAvailable() {
        return signupsAvailable;
    }

    @Override
    public String toString() {
        return "AvailableSignupAttributes{" +
                "organizationName='" + organizationName + '\'' +
                ", planningCenterUrl='" + planningCenterUrl + '\'' +
                ", serviceTypeName='" + serviceTypeName + '\'' +
                ", signupsAvailable=" + signupsAvailable +
                '}';
    }
}
