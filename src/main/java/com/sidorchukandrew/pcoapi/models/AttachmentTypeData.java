package com.sidorchukandrew.pcoapi.models;

public class AttachmentTypeData {
    private String type;
    private Integer id;
    private AttachmentDataAttributes attributes;

    public String getType() {
        return type;
    }

    public Integer getId() {
        return id;
    }

    public AttachmentDataAttributes getAttributes() {
        return attributes;
    }

    @Override
    public String toString() {
        return "AttachmentTypeData{" +
                "type='" + type + '\'' +
                ", id=" + id +
                ", attributes=" + attributes +
                '}';
    }
}
