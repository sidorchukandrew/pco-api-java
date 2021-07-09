package com.sidorchukandrew.pcoapi.orderby;

import com.sidorchukandrew.pcoapi.queryby.RequestAttribute;

public enum MediaOrderableAttribute implements RequestAttribute {
    CREATED_AT("created_at"),
    CREATED_AT_REVERSED("-created_at"),
    TITLE("title"),
    TITLE_REVERSED("-title"),
    UPDATED_AT("updated_at"),
    UPDATED_AT_REVERSED("-updated_at_reversed");

    private final String label;

    private MediaOrderableAttribute(String label) {
        this.label = label;
    }

    @Override
    public String getLabel() {
        return label;
    }
}
