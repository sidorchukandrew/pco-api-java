package com.sidorchukandrew.pcoapi.queryby;

public enum MediaQueryableAttribute implements RequestAttribute {
    CREATOR_NAME("creator_name"),
    ID("id"),
    THEMES("themes"),
    TITLE("title");

    private final String label;

    private MediaQueryableAttribute(String label) {
        StringBuilder builder = new StringBuilder();
        builder.append("where[");
        builder.append(label);
        builder.append("]");

        this.label = builder.toString();
    }

    @Override
    public String getLabel() {
        return label;
    }
}
