package com.sidorchukandrew.pcoapi.models;

public class EmailTemplate extends Resource {
    private EmailTemplateData data;
    private Meta meta;

    private EmailTemplate() { }

    private EmailTemplate(Builder builder) {
        data = builder.data;
        meta = builder.meta;
    }

    public static class Builder {
        private EmailTemplateData data;
        private Meta meta;

        public Builder data(EmailTemplateData data) {
            this.data = data;
            return this;
        }

        public Builder meta(Meta meta) {
            this.meta = meta;
            return this;
        }

        public EmailTemplate build() {
            return new EmailTemplate(this);
        }
    }

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
