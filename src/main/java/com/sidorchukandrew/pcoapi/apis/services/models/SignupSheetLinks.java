package com.sidorchukandrew.pcoapi.apis.services.models;

public class SignupSheetLinks extends Links {
    private String accept;
    private String scheduledPeople;
    private String signupSheetMetadata;

    private SignupSheetLinks() { }

    private SignupSheetLinks(Builder builder) {
        accept = builder.accept;
        scheduledPeople = builder.scheduledPeople;
        signupSheetMetadata = builder.signupSheetMetadata;
        self = builder.self;
    }

    public static class Builder {
        private String accept;
        private String scheduledPeople;
        private String signupSheetMetadata;
        private String self;

        public Builder accept(String accept) {
            this.accept = accept;
            return this;
        }

        public Builder scheduledPeople(String scheduledPeople) {
            this.scheduledPeople = scheduledPeople;
            return this;
        }

        public Builder signupSheetMetadata(String signupSheetMetadata) {
            this.signupSheetMetadata = signupSheetMetadata;
            return this;
        }

        public Builder self(String self) {
            this.self = self;
            return this;
        }
    }

    public String getAccept() {
        return accept;
    }

    public String getScheduledPeople() {
        return scheduledPeople;
    }

    public String getSignupSheetMetadata() {
        return signupSheetMetadata;
    }

    @Override
    public String toString() {
        return "SignupSheetLinks{" +
                "accept='" + accept + '\'' +
                ", scheduledPeople='" + scheduledPeople + '\'' +
                ", signupSheetMetadata='" + signupSheetMetadata + '\'' +
                ", self='" + self + '\'' +
                '}';
    }
}
