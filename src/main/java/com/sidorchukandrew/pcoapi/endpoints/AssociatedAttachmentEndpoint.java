package com.sidorchukandrew.pcoapi.endpoints;

import com.sidorchukandrew.pcoapi.models.*;

import java.io.IOException;

public class AssociatedAttachmentEndpoint extends Endpoint implements ResourceEndpoint {

    private Integer attachmentId;

    public AssociatedAttachmentEndpoint(Config config, String baseUrl, Integer attachmentId) {
        super(config, baseUrl + "/attachments/" + attachmentId);
        this.attachmentId = attachmentId;
    }

    public AssociatedZoomsEndpoint zooms() {
        return new AssociatedZoomsEndpoint(config, ENDPOINT_URL);
    }

    public AssociatedZoomEndpoint zoom(Integer zoomId) {
        return new AssociatedZoomEndpoint(config, ENDPOINT_URL, zoomId);
    }

    @Override
    public Attachment get() throws IOException {
        String response = http.get(ENDPOINT_URL);
        Attachment attachment = objectMapper.readValue(response, Attachment.class);

        return attachment;
    }

    public Attachment get(AttachmentRequestOptions requestOptions) throws IOException {
        String response = http.get(ENDPOINT_URL, requestOptions);
        Attachment attachment = objectMapper.readValue(response, Attachment.class);

        return attachment;
    }

    public AttachmentActivity open() throws IOException {
        String response = http.post(ENDPOINT_URL + "/open", "{}");
        AttachmentActivity attachmentActivity = objectMapper.readValue(response, AttachmentActivity.class);

        return attachmentActivity;
    }

    public AttachmentActivity preview() throws IOException {
        String response = http.post(ENDPOINT_URL + "/preview", "{}");
        AttachmentActivity attachmentActivity = objectMapper.readValue(response, AttachmentActivity.class);

        return attachmentActivity;
    }
}
