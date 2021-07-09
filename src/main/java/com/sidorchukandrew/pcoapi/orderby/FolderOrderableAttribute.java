package com.sidorchukandrew.pcoapi.orderby;

import com.sidorchukandrew.pcoapi.queryby.RequestAttribute;

public enum FolderOrderableAttribute implements RequestAttribute {
    NAME("name"),
    NAME_REVERSED("-name");

    private final String label;

    private FolderOrderableAttribute(String label) {
        this.label = label;
    }

    @Override
    public String getLabel() {
        return label;
    }
}
