package com.sidorchukandrew.pcoapi.endpoints;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sidorchukandrew.pcoapi.http.HttpClient;
import com.sidorchukandrew.pcoapi.interfaces.CollectionEndpoint;
import com.sidorchukandrew.pcoapi.interfaces.Config;
import com.sidorchukandrew.pcoapi.models.AttachmentTypes;

import java.io.IOException;

public class AttachmentTypesEndpoint extends Endpoint implements CollectionEndpoint {

    public AttachmentTypesEndpoint(Config config) {
        super(config, "https://api.planningcenteronline.com/services/v2/attachment_types");
    }

    public AttachmentTypes list() throws IOException {
        String response = http.get(ENDPOINT_URL);
        AttachmentTypes attachmentTypes = objectMapper.readValue(response, AttachmentTypes.class);

        return attachmentTypes;
    }
}
