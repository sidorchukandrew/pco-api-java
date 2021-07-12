package com.sidorchukandrew.pcoapi.models;

import java.time.LocalDateTime;
import java.util.List;

public class PersonAttributes implements Attributes {
    private Boolean accessMediaAttachments;
    private Boolean accessPlanAttachments;
    private Boolean accessSongAttachments;
    private LocalDateTime anniversary;
    private Boolean archived;
    private LocalDateTime archivedAt;
    private Boolean assignedToRehearsalTeam;
    private LocalDateTime birthdate;
    private Boolean canEditAllPeople;
    private Boolean canViewAllPeople;
    private LocalDateTime createdAt;
    private String firstName;
    private String fullName;
    private String givenName;
    private String icalCode;
    private String lastName;
    private Integer legacyId;
    private LocalDateTime loggedInAt;
    private String maxPermissions;
    private String meTab;
    private String mediaTab;
    private String middleName;
    private String namePrefix;
    private String nameSuffix;
    private String nickname;
    private String notes;
    private List<String> onboardings;
    private Boolean passedBackgroundCheck;
    private String peopleTab;
    private String permissions;
    private String photoThumnailUrl;
    private String photoUrl;
    private String plansTab;
    private Boolean praiseChartsEnabled;
    private String preferredApp;
    private Boolean siteAdministrator;
    private String songsTab;
    private String status;
    private LocalDateTime updatedAt;

    private PersonAttributes() { }

    private PersonAttributes(Builder builder) {
        accessMediaAttachments = builder.accessMediaAttachments;
        accessPlanAttachments = builder.accessPlanAttachments;
        accessSongAttachments = builder.accessSongAttachments;
        anniversary = builder.anniversary;
        archived = builder.archived;
        archivedAt = builder.archivedAt;
        assignedToRehearsalTeam = builder.assignedToRehearsalTeam;
        birthdate = builder.birthdate;
        canEditAllPeople = builder.canEditAllPeople;
        canViewAllPeople = builder.canViewAllPeople;
        createdAt = builder.createdAt;
        firstName = builder.firstName;
        fullName = builder.fullName;
        givenName = builder.givenName;
        icalCode = builder.icalCode;
        lastName = builder.lastName;
        legacyId = builder.legacyId;
        loggedInAt = builder.loggedInAt;
        maxPermissions = builder.maxPermissions;
        meTab = builder.meTab;
        mediaTab = builder.mediaTab;
        middleName = builder.middleName;
        namePrefix = builder.namePrefix;
        nameSuffix = builder.nameSuffix;
        nickname = builder.nickname;
        notes = builder.notes;
        onboardings = builder.onboardings;
        passedBackgroundCheck = builder.passedBackgroundCheck;
        peopleTab = builder.peopleTab;
        permissions = builder.permissions;
        photoThumnailUrl = builder.photoThumnailUrl;
        photoUrl = builder.photoUrl;
        plansTab = builder.plansTab;
        praiseChartsEnabled = builder.praiseChartsEnabled;
        preferredApp = builder.preferredApp;
        siteAdministrator = builder.siteAdministrator;
        songsTab = builder.songsTab;
        status = builder.status;
    }

    public static class Builder {
        private Boolean accessMediaAttachments;
        private Boolean accessPlanAttachments;
        private Boolean accessSongAttachments;
        private LocalDateTime anniversary;
        private Boolean archived;
        private LocalDateTime archivedAt;
        private Boolean assignedToRehearsalTeam;
        private LocalDateTime birthdate;
        private Boolean canEditAllPeople;
        private Boolean canViewAllPeople;
        private LocalDateTime createdAt;
        private String firstName;
        private String fullName;
        private String givenName;
        private String icalCode;
        private String lastName;
        private Integer legacyId;
        private LocalDateTime loggedInAt;
        private String maxPermissions;
        private String meTab;
        private String mediaTab;
        private String middleName;
        private String namePrefix;
        private String nameSuffix;
        private String nickname;
        private String notes;
        private List<String> onboardings;
        private Boolean passedBackgroundCheck;
        private String peopleTab;
        private String permissions;
        private String photoThumnailUrl;
        private String photoUrl;
        private String plansTab;
        private Boolean praiseChartsEnabled;
        private String preferredApp;
        private Boolean siteAdministrator;
        private String songsTab;
        private String status;
        private LocalDateTime updatedAt;

        public Builder accessMediaAttachments(Boolean accessMediaAttachments) {
            this.accessMediaAttachments = accessMediaAttachments;
            return this;
        }

        public Builder accessPlanAttachments(Boolean accessPlanAttachments) {
            this.accessPlanAttachments = accessPlanAttachments;
            return this;
        }

        public Builder accessSongAttachments(Boolean accessSongAttachments) {
            this.accessSongAttachments = accessSongAttachments;
            return this;
        }

        public Builder anniversary(LocalDateTime anniversary) {
            this.anniversary = anniversary;
            return this;
        }

        public Builder archived(Boolean archived) {
            this.archived = archived;
            return this;
        }

        public Builder archivedAt(LocalDateTime archivedAt) {
            this.archivedAt = archivedAt;
            return this;
        }

        public Builder assignedToRehearsalTeam(Boolean assignedToRehearsalTeam) {
            this.assignedToRehearsalTeam = assignedToRehearsalTeam;
            return this;
        }

        public Builder birthdate(LocalDateTime birthdate) {
            this.birthdate = birthdate;
            return this;
        }

        public Builder canEditAllPeople(Boolean canEditAllPeople) {
            this.canEditAllPeople = canEditAllPeople;
            return this;
        }

        public Builder canViewAllPeople(Boolean canViewAllPeople) {
            this.canViewAllPeople = canViewAllPeople;
            return this;
        }

        public Builder createdAt(LocalDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder fullName(String fullName) {
            this.fullName = fullName;
            return this;
        }

        public Builder givenName(String givenName) {
            this.givenName = givenName;
            return this;
        }

        public Builder icalCode(String icalCode) {
            this.icalCode = icalCode;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder legacyId(Integer legacyId) {
            this.legacyId = legacyId;
            return this;
        }

        public Builder loggedInAt(LocalDateTime loggedInAt) {
            this.loggedInAt = loggedInAt;
            return this;
        }

        public Builder maxPermissions(String maxPermissions) {
            this.maxPermissions = maxPermissions;
            return this;
        }

        public Builder meTab(String meTab) {
            this.meTab = meTab;
            return this;
        }

        public Builder mediaTab(String mediaTab) {
            this.mediaTab = mediaTab;
            return this;
        }

        public Builder middleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public Builder namePrefix(String namePrefix) {
            this.namePrefix = namePrefix;
            return this;
        }

        public Builder nameSuffix(String nameSuffix) {
            this.nameSuffix = nameSuffix;
            return this;
        }

        public Builder nickname(String nickname) {
            this.nickname = nickname;
            return this;
        }

        public Builder notes(String notes) {
            this.notes = notes;
            return this;
        }

        public Builder onboardings(List<String> onboardings) {
            this.onboardings = onboardings;
            return this;
        }

        public Builder passedBackgroundCheck(Boolean passedBackgroundCheck) {
            this.passedBackgroundCheck = passedBackgroundCheck;
            return this;
        }

        public Builder peopleTab(String peopleTab) {
            this.peopleTab = peopleTab;
            return this;
        }

        public Builder permissions(String permissions) {
            this.permissions = permissions;
            return this;
        }

        public Builder photoThumnailUrl(String photoThumnailUrl) {
            this.photoThumnailUrl = photoThumnailUrl;
            return this;
        }

        public Builder photoUrl(String photoUrl) {
            this.photoUrl = photoUrl;
            return this;
        }

        public Builder plansTab(String plansTab) {
            this.plansTab = plansTab;
            return this;
        }

        public Builder praiseChartsEnabled(Boolean praiseChartsEnabled) {
            this.praiseChartsEnabled = praiseChartsEnabled;
            return this;
        }

        public Builder preferredApp(String preferredApp) {
            this.preferredApp = preferredApp;
            return this;
        }

        public Builder siteAdministrator(Boolean siteAdministrator) {
            this.siteAdministrator = siteAdministrator;
            return this;
        }

        public Builder songsTab(String songsTab) {
            this.songsTab = songsTab;
            return this;
        }

        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public Builder updatedAt(LocalDateTime updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public PersonAttributes build() {
            return new PersonAttributes(this);
        }
    }

    public Boolean getAccessMediaAttachments() {
        return accessMediaAttachments;
    }

    public Boolean getAccessPlanAttachments() {
        return accessPlanAttachments;
    }

    public Boolean getAccessSongAttachments() {
        return accessSongAttachments;
    }

    public LocalDateTime getAnniversary() {
        return anniversary;
    }

    public Boolean getArchived() {
        return archived;
    }

    public LocalDateTime getArchivedAt() {
        return archivedAt;
    }

    public Boolean getAssignedToRehearsalTeam() {
        return assignedToRehearsalTeam;
    }

    public LocalDateTime getBirthdate() {
        return birthdate;
    }

    public Boolean getCanEditAllPeople() {
        return canEditAllPeople;
    }

    public Boolean getCanViewAllPeople() {
        return canViewAllPeople;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getFullName() {
        return fullName;
    }

    public String getGivenName() {
        return givenName;
    }

    public String getIcalCode() {
        return icalCode;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getLegacyId() {
        return legacyId;
    }

    public LocalDateTime getLoggedInAt() {
        return loggedInAt;
    }

    public String getMaxPermissions() {
        return maxPermissions;
    }

    public String getMeTab() {
        return meTab;
    }

    public String getMediaTab() {
        return mediaTab;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getNamePrefix() {
        return namePrefix;
    }

    public String getNameSuffix() {
        return nameSuffix;
    }

    public String getNickname() {
        return nickname;
    }

    public String getNotes() {
        return notes;
    }

    public List<String> getOnboardings() {
        return onboardings;
    }

    public Boolean getPassedBackgroundCheck() {
        return passedBackgroundCheck;
    }

    public String getPeopleTab() {
        return peopleTab;
    }

    public String getPermissions() {
        return permissions;
    }

    public String getPhotoThumnailUrl() {
        return photoThumnailUrl;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public String getPlansTab() {
        return plansTab;
    }

    public Boolean getPraiseChartsEnabled() {
        return praiseChartsEnabled;
    }

    public String getPreferredApp() {
        return preferredApp;
    }

    public Boolean getSiteAdministrator() {
        return siteAdministrator;
    }

    public String getSongsTab() {
        return songsTab;
    }

    public String getStatus() {
        return status;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    @Override
    public String toString() {
        return "PersonAttributes{" +
                "accessMediaAttachments=" + accessMediaAttachments +
                ", accessPlanAttachments=" + accessPlanAttachments +
                ", accessSongAttachments=" + accessSongAttachments +
                ", anniversary=" + anniversary +
                ", archived=" + archived +
                ", archivedAt=" + archivedAt +
                ", assignedToRehearsalTeam=" + assignedToRehearsalTeam +
                ", birthdate=" + birthdate +
                ", canEditAllPeople=" + canEditAllPeople +
                ", canViewAllPeople=" + canViewAllPeople +
                ", createdAt=" + createdAt +
                ", firstName='" + firstName + '\'' +
                ", fullName='" + fullName + '\'' +
                ", givenName='" + givenName + '\'' +
                ", icalCode='" + icalCode + '\'' +
                ", lastName='" + lastName + '\'' +
                ", legacyId=" + legacyId +
                ", loggedInAt=" + loggedInAt +
                ", maxPermissions='" + maxPermissions + '\'' +
                ", meTab='" + meTab + '\'' +
                ", mediaTab='" + mediaTab + '\'' +
                ", middleName='" + middleName + '\'' +
                ", namePrefix='" + namePrefix + '\'' +
                ", nameSuffix='" + nameSuffix + '\'' +
                ", nickname='" + nickname + '\'' +
                ", notes='" + notes + '\'' +
                ", onboardings=" + onboardings +
                ", passedBackgroundCheck=" + passedBackgroundCheck +
                ", peopleTab='" + peopleTab + '\'' +
                ", permissions='" + permissions + '\'' +
                ", photoThumnailUrl='" + photoThumnailUrl + '\'' +
                ", photoUrl='" + photoUrl + '\'' +
                ", plansTab='" + plansTab + '\'' +
                ", praiseChartsEnabled=" + praiseChartsEnabled +
                ", preferredApp='" + preferredApp + '\'' +
                ", siteAdministrator=" + siteAdministrator +
                ", songsTab='" + songsTab + '\'' +
                ", status='" + status + '\'' +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
