package com.sidorchukandrew.pcoapi.endpoints;

import com.sidorchukandrew.pcoapi.models.*;

import java.io.IOException;

public class AttachmentTypesEndpoint extends Endpoint implements CollectionEndpoint {

    public AttachmentTypesEndpoint(Config config) {
        super(config, "https://api.planningcenteronline.com/services/v2/attachment_types");
    }

    @Override
    public AttachmentTypes list() throws IOException {
        String response = http.get(ENDPOINT_URL);
        AttachmentTypes attachmentTypes = objectMapper.readValue(response, AttachmentTypes.class);
        return attachmentTypes;
    }

    public AttachmentTypes list(AttachmentTypeRequestOptions options) throws IOException {
        String response = http.get(ENDPOINT_URL, options);
        AttachmentTypes attachmentTypes = objectMapper.readValue(response, AttachmentTypes.class);
        return attachmentTypes;
    }
}
