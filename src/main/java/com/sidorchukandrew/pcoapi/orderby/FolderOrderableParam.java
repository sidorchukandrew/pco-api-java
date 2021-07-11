package com.sidorchukandrew.pcoapi.orderby;

import com.sidorchukandrew.pcoapi.queryby.RequestParam;

public enum FolderOrderableParam implements RequestParam {
    NAME("name"),
    NAME_REVERSED("-name");

    private final String label;

    private FolderOrderableParam(String label) {
        this.label = label;
    }

    @Override
    public String getLabel() {
        return label;
    }
}
