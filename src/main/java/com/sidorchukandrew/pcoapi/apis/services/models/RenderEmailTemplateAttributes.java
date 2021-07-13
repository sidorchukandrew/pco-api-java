package com.sidorchukandrew.pcoapi.apis.services.models;

class RenderEmailTemplateAttributes {
    private String format;

    public RenderEmailTemplateAttributes(String format) {
        this.format = format;
    }

    public String getFormat() {
        return format;
    }

    @Override
    public String toString() {
        return "RenderEmailTemplateAttributes{" +
                "format=" + format +
                '}';
    }
}
