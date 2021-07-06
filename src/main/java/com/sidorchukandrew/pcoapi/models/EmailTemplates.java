package com.sidorchukandrew.pcoapi.models;

import java.util.List;

public class EmailTemplates implements Collection {
    private Links links;
    private Meta meta;
    private List<EmailTemplateData> data;

    private EmailTemplates() { }

    private EmailTemplates(Builder builder) {
        links = builder.links;
        meta = builder.meta;
        data = builder.data;
    }

    public static class Builder {
        private Links links;
        private Meta meta;
        private List<EmailTemplateData> data;

        public Builder links(Links links) {
            this.links = links;
            return this;
        }

        public Builder meta(Meta meta) {
            this.meta = meta;
            return this;
        }

        public Builder data(List<EmailTemplateData> data) {
            this.data = data;
            return this;
        }

        public EmailTemplates build() {
            return new EmailTemplates(this);
        }
    }

    @Override
    public Links getLinks() {
        return links;
    }

    @Override
    public Meta getMeta() {
        return meta;
    }

    @Override
    public List getData() {
        return data;
    }


    @Override
    public String toString() {
        return "EmailTemplates{" +
                "links=" + links +
                ", meta=" + meta +
                ", data=" + data +
                '}';
    }
}
