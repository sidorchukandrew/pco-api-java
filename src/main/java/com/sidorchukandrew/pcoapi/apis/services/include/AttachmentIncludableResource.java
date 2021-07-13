package com.sidorchukandrew.pcoapi.apis.services.include;

import com.sidorchukandrew.pcoapi.apis.services.queryby.RequestParam;

public enum AttachmentIncludableResource implements RequestParam {
    ZOOMS("zooms");

    private final String label;

    private AttachmentIncludableResource(String label) {
        this.label = label;
    }

    @Override
    public String getLabel() {
        return label;
    }
}
