package com.sidorchukandrew.pcoapi.orderby;

import com.sidorchukandrew.pcoapi.queryby.RequestAttribute;

public enum SongOrderableAttribute implements RequestAttribute {
    TITLE("title"),
    CREATED_AT("created_at"),
    UPDATED_AT("updated_at"),
    LAST_SCHEDULED_AT("last_scheduled_at"),
    TITLE_REVERSED("-title"),
    CREATED_AT_REVERSED("-created_at"),
    UPDATED_AT_REVERSED("-updated_at"),
    LAST_SCHEDULED_AT_REVERSED("-last_scheduled_at");

    private final String label;

    private SongOrderableAttribute(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
