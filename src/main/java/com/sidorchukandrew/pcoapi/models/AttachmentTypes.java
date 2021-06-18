package com.sidorchukandrew.pcoapi.models;

import java.util.Arrays;

public class AttachmentTypes {
    private Links links;
    private Meta meta;
    private AttachmentTypeData[] data;

    public Links getLinks() {
        return links;
    }

    public Meta getMeta() {
        return meta;
    }

    public AttachmentTypeData[] getData() {
        return data;
    }

    @Override
    public String toString() {
        return "AttachmentTypes{" +
                "links=" + links +
                ", meta=" + meta +
                ", data=" + Arrays.toString(data) +
                '}';
    }
}
