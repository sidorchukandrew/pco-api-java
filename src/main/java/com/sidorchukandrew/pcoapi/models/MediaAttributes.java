package com.sidorchukandrew.pcoapi.models;

import java.time.LocalDateTime;

public class MediaAttributes implements Attributes {
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String creatorName;
    private String imageUrl;
    private String themes;
    private String title;
    private String thumbnailFileName;
    private String thumbnailContentType;
    private LocalDateTime thumbnailUpdatedAt;
    private Integer thumbnailFileSize;
    private String thumbnailUrl;
    private Integer length;
    private String mediaType;
    private String mediaTypeName;
    private String previewFileName;
    private String previewContentType;
    private Integer previewFileSize;
    private LocalDateTime previewUpdatedAt;
    private String previewUrl;

    private MediaAttributes() { }

    private MediaAttributes(Builder builder) {
        createdAt = builder.createdAt;
        updatedAt = builder.updatedAt;
        creatorName = builder.creatorName;
        imageUrl = builder.imageUrl;
        themes = builder.themes;
        title = builder.title;
        thumbnailContentType = builder.thumbnailContentType;
        thumbnailFileName = builder.thumbnailFileName;
        thumbnailFileSize = builder.thumbnailFileSize;
        thumbnailUpdatedAt = builder.thumbnailUpdatedAt;
        thumbnailUrl = builder.thumbnailUrl;
        length = builder.length;
        mediaType = builder.mediaType;
        mediaTypeName = builder.mediaTypeName;
        previewContentType = builder.previewContentType;
        previewFileName = builder.previewFileName;
        previewFileSize = builder.previewFileSize;
        previewUpdatedAt = builder.previewUpdatedAt;
        previewUrl = builder.previewUrl;
    }

    public static class Builder {
        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;
        private String creatorName;
        private String imageUrl;
        private String themes;
        private String title;
        private String thumbnailFileName;
        private String thumbnailContentType;
        private LocalDateTime thumbnailUpdatedAt;
        private Integer thumbnailFileSize;
        private String thumbnailUrl;
        private Integer length;
        private String mediaType;
        private String mediaTypeName;
        private String previewFileName;
        private String previewContentType;
        private Integer previewFileSize;
        private LocalDateTime previewUpdatedAt;
        private String previewUrl;

        public Builder createdAt(LocalDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder updatedAt(LocalDateTime updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public Builder creatorName(String creatorName) {
            this.creatorName = creatorName;
            return this;
        }

        public Builder imageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
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

        public Builder thumbnailFileName(String thumbnailFileName) {
            this.thumbnailFileName = thumbnailFileName;
            return this;
        }

        public Builder thumbnailContentType(String thumbnailContentType) {
            this.thumbnailContentType = thumbnailContentType;
            return this;
        }

        public Builder thumbnailUpdatedAt(LocalDateTime thumbnailUpdatedAt) {
            this.thumbnailUpdatedAt = thumbnailUpdatedAt;
            return this;
        }

        public Builder thumbnailFileSize(Integer thumbnailFileSize) {
            this.thumbnailFileSize = thumbnailFileSize;
            return this;
        }

        public Builder thumbnailUrl(String thumbnailUrl) {
            this.thumbnailUrl = thumbnailUrl;
            return this;
        }

        public Builder length(Integer length) {
            this.length = length;
            return this;
        }

        public Builder mediaType(String mediaType) {
            this.mediaType = mediaType;
            return this;
        }

        public Builder mediaTypeName(String mediaTypeName) {
            this.mediaTypeName = mediaTypeName;
            return this;
        }

        public Builder previewFileName(String previewFileName) {
            this.previewFileName = previewFileName;
            return this;
        }

        public Builder previewContentType(String previewContentType) {
            this.previewContentType = previewContentType;
            return this;
        }

        public Builder previewFileSize(Integer previewFileSize) {
            this.previewFileSize = previewFileSize;
            return this;
        }

        public Builder previewUpdatedAt(LocalDateTime previewUpdatedAt) {
            this.previewUpdatedAt = previewUpdatedAt;
            return this;
        }

        public Builder previewUrl(String previewUrl) {
            this.previewUrl = previewUrl;
            return this;
        }

        public MediaAttributes build() {
            return new MediaAttributes(this);
        }
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public String getCreatorName() {
        return creatorName;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getThemes() {
        return themes;
    }

    public String getTitle() {
        return title;
    }

    public String getThumbnailFileName() {
        return thumbnailFileName;
    }

    public String getThumbnailContentType() {
        return thumbnailContentType;
    }

    public LocalDateTime getThumbnailUpdatedAt() {
        return thumbnailUpdatedAt;
    }

    public Integer getThumbnailFileSize() {
        return thumbnailFileSize;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public Integer getLength() {
        return length;
    }

    public String getMediaType() {
        return mediaType;
    }

    public String getMediaTypeName() {
        return mediaTypeName;
    }

    public String getPreviewFileName() {
        return previewFileName;
    }

    public String getPreviewContentType() {
        return previewContentType;
    }

    public Integer getPreviewFileSize() {
        return previewFileSize;
    }

    public LocalDateTime getPreviewUpdatedAt() {
        return previewUpdatedAt;
    }

    public String getPreviewUrl() {
        return previewUrl;
    }

    @Override
    public String toString() {
        return "MediaAttributes{" +
                "createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", creatorName='" + creatorName + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", themes='" + themes + '\'' +
                ", title='" + title + '\'' +
                ", thumbnailFileName='" + thumbnailFileName + '\'' +
                ", thumbnailContentType='" + thumbnailContentType + '\'' +
                ", thumbnailUpdatedAt=" + thumbnailUpdatedAt +
                ", thumbnailFileSize=" + thumbnailFileSize +
                ", thumbnailUrl='" + thumbnailUrl + '\'' +
                ", length=" + length +
                ", mediaType='" + mediaType + '\'' +
                ", mediaTypeName='" + mediaTypeName + '\'' +
                ", previewFileName='" + previewFileName + '\'' +
                ", previewContentType='" + previewContentType + '\'' +
                ", previewFileSize=" + previewFileSize +
                ", previewUpdatedAt=" + previewUpdatedAt +
                ", previewUrl='" + previewUrl + '\'' +
                '}';
    }
}
