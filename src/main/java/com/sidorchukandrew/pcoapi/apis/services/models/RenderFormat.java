package com.sidorchukandrew.pcoapi.apis.services.models;

public enum RenderFormat {
    HTML("html"),
    TEXT("text");

    private final String label;

    private RenderFormat(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}