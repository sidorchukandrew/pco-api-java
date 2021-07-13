package com.sidorchukandrew.pcoapi.apis.services.orderby;

import com.sidorchukandrew.pcoapi.apis.services.queryby.RequestParam;

public enum PersonOrderableParam implements RequestParam {
    FIRST_NAME("first_name"),
    FIRST_NAME_REVERSED("-first_name"),
    LAST_NAME("last_name"),
    LAST_NAME_REVERSED("-last_name"),
    CREATED_AT("created_at"),
    CREATED_AT_REVERSED("-created_at"),
    UPDATED_AT("updated_at"),
    UPDATED_AT_REVERSED("-updated_at");

    private final String label;

    private PersonOrderableParam(String label) {
        this.label = label;
    }

    @Override
    public String getLabel() {
        return label;
    }
}
