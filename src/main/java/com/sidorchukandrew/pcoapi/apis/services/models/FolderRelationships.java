package com.sidorchukandrew.pcoapi.apis.services.models;

public class FolderRelationships {
    private RelationshipList ancestors;
    private Relationship parent;
    private Relationship campus;

    private FolderRelationships() { }

    private FolderRelationships(Builder builder) {
        ancestors = builder.ancestors;
        parent = builder.parent;
        campus = builder.campus;
    }

    public static class Builder {
        private RelationshipList ancestors;
        private Relationship parent;
        private Relationship campus;

        public Builder ancestors(RelationshipList ancestors) {
            this.ancestors = ancestors;
            return this;
        }

        public Builder parent(Relationship parent) {
            this.parent = parent;
            return this;
        }

        public Builder campus(Relationship campus) {
            this.campus = campus;
            return this;
        }

        public FolderRelationships build() {
            return new FolderRelationships(this);
        }
    }

    public RelationshipList getAncestors() {
        return ancestors;
    }

    public Relationship getParent() {
        return parent;
    }

    public Relationship getCampus() {
        return campus;
    }

    @Override
    public String toString() {
        return "FolderRelationships{" +
                "ancestors=" + ancestors +
                ", parent=" + parent +
                ", campus=" + campus +
                '}';
    }
}
