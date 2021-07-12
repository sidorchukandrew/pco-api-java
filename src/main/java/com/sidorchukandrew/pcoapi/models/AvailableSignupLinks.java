package com.sidorchukandrew.pcoapi.models;

public class AvailableSignupLinks extends Links {
    private String signupSheets;

    private AvailableSignupLinks() { }

    private AvailableSignupLinks(Builder builder) {
        self = builder.self;
        signupSheets = builder.signupSheets;
    }

    public static class Builder {
        private String signupSheets;
        private String self;

        public Builder signupSheets(String signupSheets) {
            this.signupSheets = signupSheets;
            return this;
        }

        public Builder self(String self) {
            this.self = self;
            return this;
        }

        public AvailableSignupLinks build() {
            return new AvailableSignupLinks(this);
        }
    }

    public String getSignupSheets() {
        return signupSheets;
    }

    @Override
    public String toString() {
        return "AvailableSignupLinks{" +
                "signupSheets='" + signupSheets + '\'' +
                ", self='" + self + '\'' +
                '}';
    }
}
