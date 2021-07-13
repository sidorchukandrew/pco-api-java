package com.sidorchukandrew.pcoapi.apis.services.queryby;

import com.sidorchukandrew.pcoapi.utils.RequestUtils;

public enum MediaQueryableParam implements RequestParam {
    CREATOR_NAME("creator_name"),
    ID("id"),
    THEMES("themes"),
    TITLE("title");

    private final String label;

    private MediaQueryableParam(String label) {
        this.label = RequestUtils.toQueryParam(label);
    }

    @Override
    public String getLabel() {
        return label;
    }
}
