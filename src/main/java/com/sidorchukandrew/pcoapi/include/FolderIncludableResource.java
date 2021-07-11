package com.sidorchukandrew.pcoapi.include;

import com.sidorchukandrew.pcoapi.queryby.RequestParam;

public enum FolderIncludableResource implements RequestParam {
    SERVICE_TYPES("service_types");

    private final String label;

    private FolderIncludableResource(String label) {
        this.label = label;
    }

    @Override
    public String getLabel() {
        return label;
    }
}
