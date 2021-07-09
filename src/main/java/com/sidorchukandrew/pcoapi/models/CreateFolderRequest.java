package com.sidorchukandrew.pcoapi.models;

public class CreateFolderRequest implements CreateRequest {
    private String name;
    private Integer parentId;
    private Integer campusId;

    private CreateFolderRequest() { }

    private CreateFolderRequest(Builder builder) {
        name = builder.name;
        parentId = builder.parentId;
        campusId = builder.campusId;
    }

    public static class Builder {
        private String name;
        private Integer parentId;
        private Integer campusId;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder parentId(Integer parentId) {
            this.parentId = parentId;
            return this;
        }

        public Builder campusId(Integer campusId) {
            this.campusId = campusId;
            return this;
        }

        public CreateFolderRequest build() {
            return new CreateFolderRequest(this);
        }
    }

    public String getName() {
        return name;
    }

    public Integer getParentId() {
        return parentId;
    }

    public Integer getCampusId() {
        return campusId;
    }

    @Override
    public Folder toResource() {
        FolderAttributes folderAttributes = new FolderAttributes.Builder()
                .name(name)
                .build();

        RelationshipData parentData = new RelationshipData.Builder()
                .type("Parent")
                .id(parentId)
                .build();

        Relationship parent = new Relationship(parentData);

        RelationshipData campusData = new RelationshipData.Builder()
                .type("Campus")
                .id(campusId)
                .build();

        Relationship campus = new Relationship(campusData);

        FolderRelationships relationships = new FolderRelationships.Builder()
                .parent(parent)
                .campus(campus)
                .build();

        FolderData folderData = new FolderData.Builder()
                .attributes(folderAttributes)
                .relationships(relationships)
                .build();

        Folder folder = new Folder.Builder()
                .data(folderData)
                .build();

        return folder;
    }

    @Override
    public String toString() {
        return "CreateFolderRequest{" +
                "name='" + name + '\'' +
                ", parentId=" + parentId +
                ", campusId=" + campusId +
                '}';
    }
}
