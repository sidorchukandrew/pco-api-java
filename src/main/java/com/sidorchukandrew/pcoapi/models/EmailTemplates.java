package com.sidorchukandrew.pcoapi.models;

import java.util.Arrays;

public class EmailTemplates {
    private Links links;
    private Meta meta;
    private EmailTemplateData[] data;

    public Links getLinks() {
        return links;
    }

    public Meta getMeta() {
        return meta;
    }

    public EmailTemplateData[] getData() {
        return data;
    }

    @Override
    public String toString() {
        return "EmailTemplates{" +
                "links=" + links +
                ", meta=" + meta +
                ", data=" + Arrays.toString(data) +
                '}';
    }
}
