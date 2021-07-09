package com.sidorchukandrew.pcoapi.models;

public class UpdateMediaRequest implements UpdateRequest {
    private String mediaType;
    private String title;
    private String creatorName;
    private String themes;

    private UpdateMediaRequest() { }

    private UpdateMediaRequest(Builder builder) {
        mediaType = builder.mediaType;
        title = builder.title;
        creatorName = builder.creatorName;
        themes = builder.themes;
    }

    @Override
    public Media toResource() {
        MediaAttributes attributes = new MediaAttributes.Builder()
                .mediaType(mediaType)
                .title(title)
                .creatorName(creatorName)
                .themes(themes)
                .build();

        MediaData data = new MediaData.Builder()
                .attributes(attributes)
                .build();

        Media media = new Media.Builder()
                .data(data)
                .build();

        return media;
    }

    public static class Builder {
        private String mediaType;
        private String title;
        private String creatorName;
        private String themes;

        // SEEMS TO AUTOMATICALLY PICK VIDEO REGARDLESS OF WHAT THE USER ENTERS
        public Builder mediaType(MediaType mediaType) {
            this.mediaType = mediaType.getLabel();
            return this;
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder creatorName(String creatorName) {
            this.creatorName = creatorName;
            return this;
        }

        public Builder themes(String themes) {
            this.themes = themes;
            return this;
        }

        public UpdateMediaRequest build() {
            return new UpdateMediaRequest(this);
        }
    }

    public String getMediaType() {
        return mediaType;
    }

    public String getTitle() {
        return title;
    }

    public String getCreatorName() {
        return creatorName;
    }

    public String getThemes() {
        return themes;
    }

    @Override
    public String toString() {
        return "UpdateMediaRequest{" +
                "mediaType='" + mediaType + '\'' +
                ", title='" + title + '\'' +
                ", creatorName='" + creatorName + '\'' +
                ", themes='" + themes + '\'' +
                '}';
    }
}
