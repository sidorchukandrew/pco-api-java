package com.sidorchukandrew.pcoapi.apis.services.models;

public class CreateSongRequest implements CreateRequest {

    private String title;
    private String admin;
    private String author;
    private String copyright;
    private Integer ccliNumber;
    private Boolean hidden;
    private String themes;

    private CreateSongRequest(Builder builder) {
        title = builder.title;
        admin = builder.admin;
        author = builder.author;
        copyright = builder.copyright;
        ccliNumber = builder.ccliNumber;
        hidden = builder.hidden;
        themes = builder.themes;
    }

    public static class Builder {
        private String title;
        private String admin;
        private String author;
        private String copyright;
        private Integer ccliNumber;
        private Boolean hidden;
        private String themes;

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder admin(String admin) {
            this.admin = admin;
            return this;
        }

        public Builder author(String author) {
            this.author = author;
            return this;
        }

        public Builder copyright(String copyright) {
            this.copyright = copyright;
            return this;
        }

        public Builder ccliNumber(Integer ccliNumber) {
            this.ccliNumber = ccliNumber;
            return this;
        }

        public Builder hidden(Boolean hidden) {
            this.hidden = hidden;
            return this;
        }

        public Builder themes(String themes) {
            this.themes = themes;
            return this;
        }

        public CreateSongRequest build() {
            return new CreateSongRequest(this);
        }
    }

    public String getTitle() {
        return title;
    }

    public String getAdmin() {
        return admin;
    }

    public String getAuthor() {
        return author;
    }

    public String getCopyright() {
        return copyright;
    }

    public Integer getCcliNumber() {
        return ccliNumber;
    }

    public Boolean getHidden() {
        return hidden;
    }

    public String getThemes() {
        return themes;
    }

    @Override
    public String toString() {
        return "CreateSongRequest{" +
                "title='" + title + '\'' +
                ", admin='" + admin + '\'' +
                ", author='" + author + '\'' +
                ", copyright='" + copyright + '\'' +
                ", ccliNumber=" + ccliNumber +
                ", hidden=" + hidden +
                ", themes='" + themes + '\'' +
                '}';
    }

    public Song toResource() {
        SongAttributes attributes = new SongAttributes.Builder()
                .admin(admin)
                .author(author)
                .ccliNumber(ccliNumber)
                .copyright(copyright)
                .hidden(hidden)
                .themes(themes)
                .title(title)
                .build();

        SongData songData = new SongData.Builder()
                .attributes(attributes)
                .type("Song")
                .build();

        Song song = new Song.Builder()
                .data(songData)
                .build();

        return song;
    }
}
