package com.sidorchukandrew.pcoapi.orderby;

import com.sidorchukandrew.pcoapi.queryby.RequestParam;

public enum AttachmentTypeOrderableParam implements RequestParam {
    NAME("name");

    private String label;
    private AttachmentTypeOrderableParam(String label) {
        this.label = label;
    }

    @Override
    public String getLabel() {
        return null;
    }
}
