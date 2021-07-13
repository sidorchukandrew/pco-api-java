package com.sidorchukandrew.pcoapi.apis.services.orderby;

import com.sidorchukandrew.pcoapi.apis.services.queryby.RequestParam;

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
