package com.sidorchukandrew.pcoapi.apis.services.endpoints;

import com.sidorchukandrew.pcoapi.apis.services.models.AttachmentRequestOptions;
import com.sidorchukandrew.pcoapi.apis.services.models.Attachments;
import com.sidorchukandrew.pcoapi.apis.services.models.Config;

import java.io.IOException;

public class AssociatedAttachmentsEndpoint extends Endpoint implements CollectionEndpoint {

    public AssociatedAttachmentsEndpoint(Config config, String baseUrl) {
        super(config, baseUrl + "/attachments");
    }

    @Override
    public Attachments list() throws IOException {
        String response = http.get(ENDPOINT_URL);
        Attachments attachments = objectMapper.readValue(response, Attachments.class);

        return attachments;
    }

    public Attachments list(AttachmentRequestOptions requestOptions) throws IOException {
        String response = http.get(ENDPOINT_URL, requestOptions);
        Attachments attachments = objectMapper.readValue(response, Attachments.class);

        return attachments;
    }
}
