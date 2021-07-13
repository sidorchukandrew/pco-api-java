package com.sidorchukandrew.pcoapi.apis.services.models;

public class AttachmentActivityRelationships {
    private Relationship attachment;

    private AttachmentActivityRelationships() { }

    public AttachmentActivityRelationships(Relationship attachment) {
        this.attachment = attachment;
    }

    public Relationship getAttachment() {
        return attachment;
    }

    @Override
    public String toString() {
        return "AttachmentActivityRelationships{" +
                "attachment=" + attachment +
                '}';
    }
}
