package com.sidorchukandrew.pcoapi.apis.services.models;

public class AttachmentRelationships {
    private Relationship attachable;
    private RelationshipList attachmentTypes;
    private Relationship createdBy;
    private Relationship updatedBy;
    private Relationship administrator;

    private AttachmentRelationships() { }

    private AttachmentRelationships(Builder builder) {
        attachable = builder.attachable;
        attachmentTypes = builder.attachmentTypes;
        createdBy = builder.createdBy;
        updatedBy = builder.updatedBy;
        administrator = builder.administrator;
    }

    public static class Builder {
        private Relationship attachable;
        private RelationshipList attachmentTypes;
        private Relationship createdBy;
        private Relationship updatedBy;
        private Relationship administrator;

        public Builder attachable(Relationship attachable) {
            this.attachable = attachable;
            return this;
        }

        public Builder attachmentTypes(RelationshipList attachmentTypes) {
            this.attachmentTypes = attachmentTypes;
            return this;
        }

        public Builder createdBy(Relationship createdBy) {
            this.createdBy = createdBy;
            return this;
        }

        public Builder updatedBy(Relationship updatedBy) {
            this.updatedBy = updatedBy;
            return this;
        }

        public Builder administrator(Relationship administrator) {
            this.administrator = administrator;
            return this;
        }

        public AttachmentRelationships build() {
            return new AttachmentRelationships(this);
        }
    }

    public Relationship getAttachable() {
        return attachable;
    }

    public RelationshipList getAttachmentTypes() {
        return attachmentTypes;
    }

    public Relationship getCreatedBy() {
        return createdBy;
    }

    public Relationship getUpdatedBy() {
        return updatedBy;
    }

    public Relationship getAdministrator() {
        return administrator;
    }

    @Override
    public String toString() {
        return "AttachmentRelationships{" +
                "attachable=" + attachable +
                ", attachmentTypes=" + attachmentTypes +
                ", createdBy=" + createdBy +
                ", updatedBy=" + updatedBy +
                ", administrator=" + administrator +
                '}';
    }
}
