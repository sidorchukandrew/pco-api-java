package com.sidorchukandrew.pcoapi.include;

import com.sidorchukandrew.pcoapi.queryby.RequestParam;

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
