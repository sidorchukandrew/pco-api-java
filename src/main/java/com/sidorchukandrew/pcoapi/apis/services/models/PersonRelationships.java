package com.sidorchukandrew.pcoapi.apis.services.models;

public class PersonRelationships {
    private Relationship currentFolder;
    private Relationship createdBy;
    private Relationship updatedBy;

    private PersonRelationships() { }

    private PersonRelationships(Builder builder) {
        currentFolder = builder.currentFolder;
        createdBy = builder.createdBy;
        updatedBy = builder.updatedBy;
    }

    public static class Builder {
        private Relationship currentFolder;
        private Relationship createdBy;
        private Relationship updatedBy;

        public Builder currentFolder(Relationship currentFolder) {
            this.currentFolder = currentFolder;
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

        public PersonRelationships build() {
            return new PersonRelationships(this);
        }
    }

    public Relationship getCurrentFolder() {
        return currentFolder;
    }

    public Relationship getCreatedBy() {
        return createdBy;
    }

    public Relationship getUpdatedBy() {
        return updatedBy;
    }

    @Override
    public String toString() {
        return "PersonRelationships{" +
                "currentFolder=" + currentFolder +
                ", createdBy=" + createdBy +
                ", updatedBy=" + updatedBy +
                '}';
    }
}
