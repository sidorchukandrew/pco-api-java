package com.sidorchukandrew.pcoapi.orderby;

import com.sidorchukandrew.pcoapi.queryby.RequestParam;

public enum MediaOrderableParam implements RequestParam {
    CREATED_AT("created_at"),
    CREATED_AT_REVERSED("-created_at"),
    TITLE("title"),
    TITLE_REVERSED("-title"),
    UPDATED_AT("updated_at"),
    UPDATED_AT_REVERSED("-updated_at_reversed");

    private final String label;

    private MediaOrderableParam(String label) {
        this.label = label;
    }

    @Override
    public String getLabel() {
        return label;
    }
}
