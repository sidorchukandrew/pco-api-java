package com.sidorchukandrew.pcoapi.models;

public class SignupSheetRelationships {
    private Relationship plan;
    private Relationship teamPosition;
    private Relationship team;

    private SignupSheetRelationships() { }

    private SignupSheetRelationships(Builder builder) {
        plan = builder.plan;
        team = builder.team;
        teamPosition = builder.teamPosition;
    }

    public static class Builder {
        private Relationship plan;
        private Relationship teamPosition;
        private Relationship team;

        public Builder plan(Relationship plan) {
            this.plan = plan;
            return this;
        }

        public Builder teamPosition(Relationship teamPosition) {
            this.teamPosition = teamPosition;
            return this;
        }

        public Builder team(Relationship team) {
            this.team = team;
            return this;
        }

        public SignupSheetRelationships build() {
            return new SignupSheetRelationships(this);
        }
    }

    public Relationship getPlan() {
        return plan;
    }

    public Relationship getTeamPosition() {
        return teamPosition;
    }

    public Relationship getTeam() {
        return team;
    }

    @Override
    public String toString() {
        return "SignupSheetRelationships{" +
                "plan=" + plan +
                ", teamPosition=" + teamPosition +
                ", team=" + team +
                '}';
    }
}
