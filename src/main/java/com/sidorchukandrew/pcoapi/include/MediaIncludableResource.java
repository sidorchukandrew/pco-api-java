package com.sidorchukandrew.pcoapi.include;

import com.sidorchukandrew.pcoapi.queryby.RequestParam;

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
