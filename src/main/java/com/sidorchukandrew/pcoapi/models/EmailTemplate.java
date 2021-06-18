package com.sidorchukandrew.pcoapi.models;

public class EmailTemplate {
    private EmailTemplateData data;
    private Meta meta;

    public EmailTemplateData getData() {
        return data;
    }

    public Meta getMeta() {
        return meta;
    }

    @Override
    public String toString() {
        return "EmailTemplate{" +
                "data=" + data +
                ", meta=" + meta +
                '}';
    }
}
