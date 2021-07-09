package com.sidorchukandrew.pcoapi.models;

public class CreateMediaRequest implements CreateRequest {
    private String mediaType;
    private String title;
    private String creatorName;
    private String themes;

    private CreateMediaRequest() { }

    private CreateMediaRequest(Builder builder) {
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

        public CreateMediaRequest build() {
            return new CreateMediaRequest(this);
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
        return "CreateMediaRequest{" +
                "mediaType='" + mediaType + '\'' +
                ", title='" + title + '\'' +
                ", creatorName='" + creatorName + '\'' +
                ", themes='" + themes + '\'' +
                '}';
    }
}
