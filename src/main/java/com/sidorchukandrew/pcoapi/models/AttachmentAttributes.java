package com.sidorchukandrew.pcoapi.models;

import java.time.LocalDateTime;
import java.util.List;

public class AttachmentAttributes implements Attributes {
    private Boolean allowMp3Download;
    private String contentType;
    private LocalDateTime createdAt;
    private String displayName;
    private Boolean downloadable;
    private Integer fileSize;
    private String fileUploadIdentifier;
    private String filename;
    private String filetype;
    private Boolean hasPreview;
    private Integer licensesPurchased;
    private Integer licensesRemaining;
    private Integer licensesUsed;
    private String linkedUrl;
    private List<String> pageOrder;
    private String pcoType;
    private String remoteLink;
    private Boolean streamable;
    private String thumbnailUrl;
    private Boolean transposable;
    private LocalDateTime updatedAt;
    private Boolean webStreamable;

    private AttachmentAttributes() { }

    private AttachmentAttributes(Builder builder) {
        allowMp3Download = builder.allowMp3Download;
        contentType = builder.contentType;
        createdAt = builder.createdAt;
        displayName = builder.displayName;
        downloadable = builder.downloadable;
        fileSize = builder.fileSize;
        fileUploadIdentifier = builder.fileUploadIdentifier;
        filename = builder.filename;
        filetype = builder.filetype;
        hasPreview = builder.hasPreview;
        licensesPurchased = builder.licensesPurchased;
        licensesRemaining = builder.licensesRemaining;
        licensesUsed = builder.licensesUsed;
        linkedUrl = builder.linkedUrl;
        pageOrder = builder.pageOrder;
        pcoType = builder.pcoType;
        remoteLink = builder.remoteLink;
        streamable = builder.streamable;
        thumbnailUrl = builder.thumbnailUrl;
        transposable = builder.transposable;
        updatedAt = builder.updatedAt;
        webStreamable = builder.webStreamable;
    }

    public static class Builder {
        private Boolean allowMp3Download;
        private String contentType;
        private LocalDateTime createdAt;
        private String displayName;
        private Boolean downloadable;
        private Integer fileSize;
        private String fileUploadIdentifier;
        private String filename;
        private String filetype;
        private Boolean hasPreview;
        private Integer licensesPurchased;
        private Integer licensesRemaining;
        private Integer licensesUsed;
        private String linkedUrl;
        private List<String> pageOrder;
        private String pcoType;
        private String remoteLink;
        private Boolean streamable;
        private String thumbnailUrl;
        private Boolean transposable;
        private LocalDateTime updatedAt;
        private Boolean webStreamable;

        public Builder allowMp3Download(Boolean allowMp3Download) {
            this.allowMp3Download = allowMp3Download;
            return this;
        }

        public Builder contentType(String contentType) {
            this.contentType = contentType;
            return this;
        }

        public Builder createdAt(LocalDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder downloadable(Boolean downloadable) {
            this.downloadable = downloadable;
            return this;
        }

        public Builder fileSize(Integer fileSize) {
            this.fileSize = fileSize;
            return this;
        }

        public Builder fileUploadIdentifier(String fileUploadIdentifier) {
            this.fileUploadIdentifier = fileUploadIdentifier;
            return this;
        }

        public Builder filename(String filename) {
            this.filename = filename;
            return this;
        }

        public Builder filetype(String filetype) {
            this.filetype = filetype;
            return this;
        }

        public Builder hasPreview(Boolean hasPreview) {
            this.hasPreview = hasPreview;
            return this;
        }

        public Builder licensesPurchased(Integer licensesPurchased) {
            this.licensesPurchased = licensesPurchased;
            return this;
        }

        public Builder licensesRemaining(Integer licensesRemaining) {
            this.licensesRemaining = licensesRemaining;
            return this;
        }

        public Builder licensesUsed(Integer licensesUsed) {
            this.licensesUsed = licensesUsed;
            return this;
        }

        public Builder linkedUrl(String linkedUrl) {
            this.linkedUrl = linkedUrl;
            return this;
        }

        public Builder pageOrder(List<String> pageOrder) {
            this.pageOrder = pageOrder;
            return this;
        }

        public Builder pcoType(String pcoType) {
            this.pcoType = pcoType;
            return this;
        }

        public Builder remoteLink(String remoteLink) {
            this.remoteLink = remoteLink;
            return this;
        }

        public Builder streamable(Boolean streamable) {
            this.streamable = streamable;
            return this;
        }

        public Builder thumbnailUrl(String thumbnailUrl) {
            this.thumbnailUrl = thumbnailUrl;
            return this;
        }

        public Builder transposable(Boolean transposable) {
            this.transposable = transposable;
            return this;
        }

        public Builder updatedAt(LocalDateTime updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public Builder webStreamable(Boolean webStreamable) {
            this.webStreamable = webStreamable;
            return this;
        }

        public AttachmentAttributes build() {
            return new AttachmentAttributes(this);
        }
    }

    public Boolean getAllowMp3Download() {
        return allowMp3Download;
    }

    public String getContentType() {
        return contentType;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public String getDisplayName() {
        return displayName;
    }

    public Boolean getDownloadable() {
        return downloadable;
    }

    public Integer getFileSize() {
        return fileSize;
    }

    public String getFileUploadIdentifier() {
        return fileUploadIdentifier;
    }

    public String getFilename() {
        return filename;
    }

    public String getFiletype() {
        return filetype;
    }

    public Boolean getHasPreview() {
        return hasPreview;
    }

    public Integer getLicensesPurchased() {
        return licensesPurchased;
    }

    public Integer getLicensesRemaining() {
        return licensesRemaining;
    }

    public Integer getLicensesUsed() {
        return licensesUsed;
    }

    public String getLinkedUrl() {
        return linkedUrl;
    }

    public List<String> getPageOrder() {
        return pageOrder;
    }

    public String getPcoType() {
        return pcoType;
    }

    public String getRemoteLink() {
        return remoteLink;
    }

    public Boolean getStreamable() {
        return streamable;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public Boolean getTransposable() {
        return transposable;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public Boolean getWebStreamable() {
        return webStreamable;
    }

    @Override
    public String toString() {
        return "AttachmentAttributes{" +
                "allowMp3Download=" + allowMp3Download +
                ", contentType='" + contentType + '\'' +
                ", createdAt=" + createdAt +
                ", displayName='" + displayName + '\'' +
                ", downloadable=" + downloadable +
                ", fileSize=" + fileSize +
                ", fileUploadIdentifier='" + fileUploadIdentifier + '\'' +
                ", filename='" + filename + '\'' +
                ", filetype='" + filetype + '\'' +
                ", hasPreview=" + hasPreview +
                ", licensesPurchased=" + licensesPurchased +
                ", licensesRemaining=" + licensesRemaining +
                ", licensesUsed=" + licensesUsed +
                ", linkedUrl='" + linkedUrl + '\'' +
                ", pageOrder='" + pageOrder + '\'' +
                ", pcoType='" + pcoType + '\'' +
                ", remoteLink='" + remoteLink + '\'' +
                ", streamable=" + streamable +
                ", thumbnailUrl='" + thumbnailUrl + '\'' +
                ", transposable=" + transposable +
                ", updatedAt=" + updatedAt +
                ", webStreamable=" + webStreamable +
                '}';
    }
}
