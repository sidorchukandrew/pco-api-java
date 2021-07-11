package com.sidorchukandrew.pcoapi.endpoints;

import com.sidorchukandrew.pcoapi.models.AttachmentRequestOptions;
import com.sidorchukandrew.pcoapi.models.Attachments;
import com.sidorchukandrew.pcoapi.models.Config;

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
