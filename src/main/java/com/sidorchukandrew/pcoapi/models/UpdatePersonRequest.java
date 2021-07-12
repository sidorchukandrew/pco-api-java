package com.sidorchukandrew.pcoapi.models;

import java.util.List;

public class UpdatePersonRequest implements UpdateRequest {
    private String preferredApp;
    private List<String> onboardings;
    private Boolean accessMediaAttachments;
    private Boolean accessPlanAttachments;
    private Boolean accessSongAttachments;
    private Integer currentFolderId;
    private String permissions;

    private UpdatePersonRequest() { }

    private UpdatePersonRequest(Builder builder) {
        preferredApp = builder.preferredApp;
        onboardings = builder.onboardings;
        accessMediaAttachments = builder.accessMediaAttachments;
        accessPlanAttachments = builder.accessPlanAttachments;
        accessSongAttachments = builder.accessSongAttachments;
        currentFolderId = builder.currentFolderId;
        permissions = builder.permissions;
    }

    public static class Builder {
        private String preferredApp;
        private List<String> onboardings;
        private Boolean accessMediaAttachments;
        private Boolean accessPlanAttachments;
        private Boolean accessSongAttachments;
        private Integer currentFolderId;
        private String permissions;

        public Builder preferredApp(String preferredApp) {
            this.preferredApp = preferredApp;
            return this;
        }

        public Builder onboardings(List<String> onboardings) {
            this.onboardings = onboardings;
            return this;
        }

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

        public Builder currentFolderId(Integer currentFolderId) {
            this.currentFolderId = currentFolderId;
            return this;
        }

        public Builder permissions(String permissions) {
            this.permissions = permissions;
            return this;
        }

        public UpdatePersonRequest build() {
            return new UpdatePersonRequest(this);
        }
    }

    @Override
    public Person toResource() {
        PersonAttributes attributes = new PersonAttributes.Builder()
                .accessMediaAttachments(accessMediaAttachments)
                .accessPlanAttachments(accessPlanAttachments)
                .accessSongAttachments(accessSongAttachments)
                .preferredApp(preferredApp)
                .permissions(permissions)
                .onboardings(onboardings)
                .build();

        RelationshipData relationshipData = new RelationshipData.Builder()
                .type("Folder")
                .id(currentFolderId)
                .build();

        Relationship currentFolderRelationship = new Relationship(relationshipData);

        PersonRelationships relationships = new PersonRelationships.Builder()
                .currentFolder(currentFolderRelationship)
                .build();

        PersonData data = new PersonData.Builder()
                .attributes(attributes)
                .relationships(relationships)
                .build();

        Person person = new Person.Builder()
                .data(data)
                .build();

        return person;
    }
}
