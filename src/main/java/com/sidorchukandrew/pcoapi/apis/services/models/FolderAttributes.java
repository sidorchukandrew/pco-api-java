package com.sidorchukandrew.pcoapi.apis.services.models;

import java.time.LocalDateTime;

public class FolderAttributes implements Attributes {
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String name;
    private String container;

    private FolderAttributes() { }

    private FolderAttributes(Builder builder) {
        createdAt = builder.createdAt;
        updatedAt = builder.updatedAt;
        name = builder.name;
        container = builder.container;
    }

    public static class Builder {
        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;
        private String name;
        private String container;

        public Builder createdAt(LocalDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder updatedAt(LocalDateTime updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder container(String container) {
            this.container = container;
            return this;
        }

        public FolderAttributes build() {
            return new FolderAttributes(this);
        }
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public String getName() {
        return name;
    }

    public String getContainer() {
        return container;
    }

    @Override
    public String toString() {
        return "FolderAttributes{" +
                "createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", name='" + name + '\'' +
                ", container='" + container + '\'' +
                '}';
    }
}
