package com.sidorchukandrew.pcoapi.models;

public class ZoomRelationships {
    private Relationship person;
    private Relationship attachable;
    private Relationship attachment;

    private ZoomRelationships() { }

    private ZoomRelationships(Builder builder) {
        person = builder.person;
        attachable = builder.attachable;
        attachment = builder.attachment;
    }

    public static class Builder {
        private Relationship person;
        private Relationship attachable;
        private Relationship attachment;

        public Builder person(Relationship person) {
            this.person = person;
            return this;
        }

        public Builder attachable(Relationship attachable) {
            this.attachable = attachable;
            return this;
        }

        public Builder attachment(Relationship attachment) {
            this.attachment = attachment;
            return this;
        }

        public ZoomRelationships build() {
            return new ZoomRelationships(this);
        }
    }

    public Relationship getPerson() {
        return person;
    }

    public Relationship getAttachable() {
        return attachable;
    }

    public Relationship getAttachment() {
        return attachment;
    }

    @Override
    public String toString() {
        return "ZoomRelationships{" +
                "person=" + person +
                ", attachable=" + attachable +
                ", attachment=" + attachment +
                '}';
    }
}
