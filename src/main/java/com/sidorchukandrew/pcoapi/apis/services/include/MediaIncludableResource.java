package com.sidorchukandrew.pcoapi.apis.services.include;

import com.sidorchukandrew.pcoapi.apis.services.queryby.RequestParam;

public enum MediaIncludableResource implements RequestParam {
    ATTACHMENTS("attachments");

    private final String label;

    private MediaIncludableResource(String label) {
        this.label = label;
    }

    @Override
    public String getLabel() {
        return label;
    }
}
