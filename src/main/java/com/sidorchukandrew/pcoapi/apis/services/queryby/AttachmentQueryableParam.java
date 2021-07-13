package com.sidorchukandrew.pcoapi.apis.services.queryby;

import com.sidorchukandrew.pcoapi.utils.RequestUtils;

public enum AttachmentQueryableParam implements RequestParam {
    ADMINISTRATOR_ID("administrator_id"),
    ATTACHABLE_TYPE("attachable_type"),
    FILENAME_LIKE("filename_like"),
    LICENSES_PURCHASED("licenses_purchased"),
    TYPE("type");

    private final String label;

    private AttachmentQueryableParam(String label) {
        this.label = RequestUtils.toQueryParam(label);
    }

    @Override
    public String getLabel() {
        return label;
    }
}
