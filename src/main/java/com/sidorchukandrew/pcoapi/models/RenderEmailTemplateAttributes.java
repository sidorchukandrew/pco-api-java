package com.sidorchukandrew.pcoapi.models;

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
