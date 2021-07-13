package com.sidorchukandrew.pcoapi.apis.services.include;

import com.sidorchukandrew.pcoapi.apis.services.queryby.RequestParam;

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
