package com.sidorchukandrew.pcoapi.apis.services.models;

public class PersonLinks extends Links {
    private String assignTags;
    private String availableSignups;
    private String blockouts;
    private String collapseServiceTypes;
    private String expandServiceTypes;
    private String personTeamPositionAssignments;
    private String planPeople;
    private String schedules;
    private String tags;
    private String teamLeaders;
    private String textSettings;

    private PersonLinks() { }

    private PersonLinks(Builder builder) {
        assignTags = builder.assignTags;
        availableSignups = builder.availableSignups;
        blockouts = builder.blockouts;
        collapseServiceTypes = builder.collapseServiceTypes;
        expandServiceTypes = builder.expandServiceTypes;
        personTeamPositionAssignments = builder.personTeamPositionAssignments;
        planPeople = builder.planPeople;
        schedules = builder.schedules;
        tags = builder.tags;
        teamLeaders = builder.teamLeaders;
        textSettings = builder.textSettings;
        self = builder.self;
    }

    public static class Builder {
        private String assignTags;
        private String availableSignups;
        private String blockouts;
        private String collapseServiceTypes;
        private String expandServiceTypes;
        private String personTeamPositionAssignments;
        private String planPeople;
        private String schedules;
        private String tags;
        private String teamLeaders;
        private String textSettings;
        private String self;

        public Builder assignTags(String assignTags) {
            this.assignTags = assignTags;
            return this;
        }

        public Builder availableSignups(String availableSignups) {
            this.availableSignups = availableSignups;
            return this;
        }

        public Builder blockouts(String blockouts) {
            this.blockouts = blockouts;
            return this;
        }

        public Builder collapseServiceTypes(String collapseServiceTypes) {
            this.collapseServiceTypes = collapseServiceTypes;
            return this;
        }

        public Builder expandServiceTypes(String expandServiceTypes) {
            this.expandServiceTypes = expandServiceTypes;
            return this;
        }

        public Builder personTeamPositionAssignments(String personTeamPositionAssignments) {
            this.personTeamPositionAssignments = personTeamPositionAssignments;
            return this;
        }

        public Builder planPeople(String planPeople) {
            this.planPeople = planPeople;
            return this;
        }

        public Builder schedules(String schedules) {
            this.schedules = schedules;
            return this;
        }

        public Builder tags(String tags) {
            this.tags = tags;
            return this;
        }

        public Builder teamLeaders(String teamLeaders) {
            this.teamLeaders = teamLeaders;
            return this;
        }

        public Builder textSettings(String textSettings) {
            this.textSettings = textSettings;
            return this;
        }

        public Builder self(String self) {
            this.self = self;
            return this;
        }

        public PersonLinks build() {
            return new PersonLinks(this);
        }
    }

    public String getAssignTags() {
        return assignTags;
    }

    public String getAvailableSignups() {
        return availableSignups;
    }

    public String getBlockouts() {
        return blockouts;
    }

    public String getCollapseServiceTypes() {
        return collapseServiceTypes;
    }

    public String getExpandServiceTypes() {
        return expandServiceTypes;
    }

    public String getPersonTeamPositionAssignments() {
        return personTeamPositionAssignments;
    }

    public String getPlanPeople() {
        return planPeople;
    }

    public String getSchedules() {
        return schedules;
    }

    public String getTags() {
        return tags;
    }

    public String getTeamLeaders() {
        return teamLeaders;
    }

    public String getTextSettings() {
        return textSettings;
    }
}
