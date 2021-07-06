package com.sidorchukandrew.pcoapi.models;

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