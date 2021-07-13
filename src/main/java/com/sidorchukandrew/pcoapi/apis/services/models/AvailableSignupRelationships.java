package com.sidorchukandrew.pcoapi.apis.services.models;

public class AvailableSignupRelationships {
    private Relationship organization;
    private Relationship person;
    private Relationship serviceType;

    private AvailableSignupRelationships() { }

    private AvailableSignupRelationships(Builder builder) {
        organization = builder.organization;
        person = builder.person;
        serviceType = builder.serviceType;
    }

    public static class Builder {
        private Relationship organization;
        private Relationship person;
        private Relationship serviceType;

        public Builder organization(Relationship organization) {
            this.organization = organization;
            return this;
        }

        public Builder person(Relationship person) {
            this.person = person;
            return this;
        }

        public Builder serviceType(Relationship serviceType) {
            this.serviceType = serviceType;
            return this;
        }

        public AvailableSignupRelationships build() {
            return new AvailableSignupRelationships(this);
        }
    }

    public Relationship getOrganization() {
        return organization;
    }

    public Relationship getPerson() {
        return person;
    }

    public Relationship getServiceType() {
        return serviceType;
    }

    @Override
    public String toString() {
        return "AvailableSignupRelationships{" +
                "organization=" + organization +
                ", person=" + person +
                ", serviceType=" + serviceType +
                '}';
    }
}
