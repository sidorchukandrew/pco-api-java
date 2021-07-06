package com.sidorchukandrew.pcoapi.orderby;

import com.sidorchukandrew.pcoapi.queryby.RequestAttribute;

public enum AttachmentTypeOrderableAttribute implements RequestAttribute {
    NAME("name");

    private String label;
    private AttachmentTypeOrderableAttribute(String label) {
        this.label = label;
    }

    @Override
    public String getLabel() {
        return null;
    }
}
