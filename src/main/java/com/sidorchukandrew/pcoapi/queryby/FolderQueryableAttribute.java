package com.sidorchukandrew.pcoapi.queryby;

public enum FolderQueryableAttribute implements RequestAttribute {
    PARENT_ID("parent_id");

    private final String label;
    private FolderQueryableAttribute(String label) {
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
