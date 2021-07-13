package com.sidorchukandrew.pcoapi.apis.services.models;

public class RenderedEmailTemplate {
    private Meta meta;
    private RenderedEmailTemplateData data;

    private RenderedEmailTemplate() { }

    private RenderedEmailTemplate(Builder builder) {
        meta = builder.meta;
        data = builder.data;
    }

    public static class Builder {
        private Meta meta;
        private RenderedEmailTemplateData data;

        public Builder meta(Meta meta) {
            this.meta = meta;
            return this;
        }

        public Builder data(RenderedEmailTemplateData data) {
            this.data = data;
            return this;
        }

        public RenderedEmailTemplate build() {
            return new RenderedEmailTemplate(this);
        }
    }

    public Meta getMeta() {
        return meta;
    }

    public RenderedEmailTemplateData getData() {
        return data;
    }

    @Override
    public String toString() {
        return "RenderedEmailTemplate{" +
                "meta=" + meta +
                ", data=" + data +
                '}';
    }
}
