package com.sidorchukandrew.pcoapi.apis.services.models;

import java.time.LocalDateTime;

public class SignupSheetAttributes implements Attributes {
    private LocalDateTime sortDate;
    private String groupKey;
    private String teamName;
    private String displayTimes;
    private String positionName;
    private String title;
    private Integer sortIndex;

    private SignupSheetAttributes() { }

    private SignupSheetAttributes(Builder builder) {
        sortDate = builder.sortDate;
        groupKey = builder.groupKey;
        teamName = builder.teamName;
        displayTimes = builder.displayTimes;
        positionName = builder.positionName;
        title = builder.title;
        sortIndex = builder.sortIndex;
    }

    public static class Builder {
        private LocalDateTime sortDate;
        private String groupKey;
        private String teamName;
        private String displayTimes;
        private String positionName;
        private String title;
        private Integer sortIndex;

        public Builder sortDate(LocalDateTime sortDate) {
            this.sortDate = sortDate;
            return this;
        }

        public Builder groupKey(String groupKey) {
            this.groupKey = groupKey;
            return this;
        }

        public Builder teamName(String teamName) {
            this.teamName = teamName;
            return this;
        }

        public Builder displayTimes(String displayTimes) {
            this.displayTimes = displayTimes;
            return this;
        }

        public Builder positionName(String positionName) {
            this.positionName = positionName;
            return this;
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder sortIndex(Integer sortIndex) {
            this.sortIndex = sortIndex;
            return this;
        }

        public SignupSheetAttributes build() {
            return new SignupSheetAttributes(this);
        }
    }

    public LocalDateTime getSortDate() {
        return sortDate;
    }

    public String getGroupKey() {
        return groupKey;
    }

    public String getTeamName() {
        return teamName;
    }

    public String getDisplayTimes() {
        return displayTimes;
    }

    public String getPositionName() {
        return positionName;
    }

    public String getTitle() {
        return title;
    }

    public Integer getSortIndex() {
        return sortIndex;
    }

    @Override
    public String toString() {
        return "SignupSheetAttributes{" +
                "sortDate=" + sortDate +
                ", groupKey='" + groupKey + '\'' +
                ", teamName='" + teamName + '\'' +
                ", displayTimes='" + displayTimes + '\'' +
                ", positionName='" + positionName + '\'' +
                ", title='" + title + '\'' +
                ", sortIndex=" + sortIndex +
                '}';
    }
}
