package com.sidorchukandrew.pcoapi.queryby;

import com.sidorchukandrew.pcoapi.utils.RequestUtils;

public enum FolderQueryableParam implements RequestParam {
    PARENT_ID("parent_id");

    private final String label;

    private FolderQueryableParam(String label) {
        this.label = RequestUtils.toQueryParam(label);
    }

    @Override
    public String getLabel() {
        return label;
    }
}
