package com.sidorchukandrew.pcoapi.orderby;

import com.sidorchukandrew.pcoapi.queryby.RequestParam;

public enum AttachmentOrderableParam implements RequestParam {
    ATTACHABLE_TYPE("attachable_type"),
    ATTACHABLE_TYPE_REVERSED("-attachable_type"),
    CREATED_AT("created_at"),
    CREATED_AT_REVERSED("-created_at"),
    FILENAME("filename"),
    FILENAME_REVERSED("-filename"),
    FILETYPE("filetype"),
    FILETYPE_REVERSED("-filetype"),
    SIZE("size"),
    SIZE_REVERSED("-size");

    private final String label;

    private AttachmentOrderableParam(String label) {
        this.label = label;
    }

    @Override
    public String getLabel() {
        return label;
    }
}
