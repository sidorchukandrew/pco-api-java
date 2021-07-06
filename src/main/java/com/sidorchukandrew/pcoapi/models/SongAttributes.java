package com.sidorchukandrew.pcoapi.models;

import java.time.LocalDateTime;

public class SongAttributes implements Attributes {
    private String admin;
    private String author;
    private Integer ccliNumber;
    private String copyright;
    private LocalDateTime createdAt;
    private Boolean hidden;
    private LocalDateTime lastScheduledAt;
    private String lastScheduledShortDates;
    private String notes;
    private String themes;
    private String title;
    private LocalDateTime updatedAt;

    private SongAttributes() { }

    private SongAttributes(Builder builder) {
        admin = builder.admin;
        author = builder.author;
        ccliNumber = builder.ccliNumber;
        createdAt = builder.createdAt;
        hidden = builder.hidden;
        copyright = builder.copyright;
        lastScheduledAt = builder.lastScheduledAt;
        lastScheduledShortDates = builder.lastScheduledShortDates;
        notes = builder.notes;
        themes = builder.themes;
        title = builder.title;
        updatedAt = builder.updatedAt;
    }

    public static class Builder {
        private String admin;
        private String author;
        private Integer ccliNumber;
        private String copyright;
        private LocalDateTime createdAt;
        private Boolean hidden;
        private LocalDateTime lastScheduledAt;
        private String lastScheduledShortDates;
        private String notes;
        private String themes;
        private String title;
        private LocalDateTime updatedAt;

        public Builder admin(String admin) {
            this.admin = admin;
            return this;
        }

        public Builder author(String author) {
            this.author = author;
            return this;
        }

        public Builder ccliNumber(Integer ccliNumber) {
            this.ccliNumber = ccliNumber;
            return this;
        }

        public Builder copyright(String copyright) {
            this.copyright = copyright;
            return this;
        }

        public Builder createdAt(LocalDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder hidden(Boolean hidden) {
            this.hidden = hidden;
            return this;
        }

        public Builder lastScheduledAt(LocalDateTime lastScheduledAt) {
            this.lastScheduledAt = lastScheduledAt;
            return this;
        }

        public Builder lastScheduledShortDates(String lastScheduledShortDates) {
            this.lastScheduledShortDates = lastScheduledShortDates;
            return this;
        }

        public Builder notes(String notes) {
            this.notes = notes;
            return this;
        }

        public Builder themes(String themes) {
            this.themes = themes;
            return this;
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder updatedAt(LocalDateTime updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public SongAttributes build() {
            return new SongAttributes(this);
        }
    }

    public String getAdmin() {
        return admin;
    }

    public String getAuthor() {
        return author;
    }

    public Integer getCcliNumber() {
        return ccliNumber;
    }

    public String getCopyright() {
        return copyright;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public Boolean getHidden() {
        return hidden;
    }

    public LocalDateTime getLastScheduledAt() {
        return lastScheduledAt;
    }

    public String getLastScheduledShortDates() {
        return lastScheduledShortDates;
    }

    public String getNotes() {
        return notes;
    }

    public String getThemes() {
        return themes;
    }

    public String getTitle() {
        return title;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    @Override
    public String toString() {
        return "SongAttributes{" +
                "admin='" + admin + '\'' +
                ", author='" + author + '\'' +
                ", ccliNumber=" + ccliNumber +
                ", copyright='" + copyright + '\'' +
                ", createdAt=" + createdAt +
                ", hidden=" + hidden +
                ", lastScheduledAt=" + lastScheduledAt +
                ", lastScheduledShortDates='" + lastScheduledShortDates + '\'' +
                ", notes='" + notes + '\'' +
                ", themes='" + themes + '\'' +
                ", title='" + title + '\'' +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
