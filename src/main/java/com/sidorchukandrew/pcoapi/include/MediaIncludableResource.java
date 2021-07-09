package com.sidorchukandrew.pcoapi.include;

import com.sidorchukandrew.pcoapi.queryby.RequestAttribute;

public enum MediaIncludableResource implements RequestAttribute {
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
