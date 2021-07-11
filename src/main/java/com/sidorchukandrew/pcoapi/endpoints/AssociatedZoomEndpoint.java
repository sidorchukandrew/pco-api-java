package com.sidorchukandrew.pcoapi.endpoints;

import com.sidorchukandrew.pcoapi.models.Config;
import com.sidorchukandrew.pcoapi.models.UpdateZoomRequest;
import com.sidorchukandrew.pcoapi.models.Zoom;

import java.io.IOException;

public class AssociatedZoomEndpoint extends Endpoint implements ResourceEndpoint {

    private Integer zoomId;

    public AssociatedZoomEndpoint(Config config, String baseUrl, Integer zoomId) {
        super(config, baseUrl + "/zooms/" + zoomId);
        this.zoomId = zoomId;
    }

    @Override
    public Zoom get() throws IOException {
        String response = http.get(ENDPOINT_URL);
        Zoom zoom = objectMapper.readValue(response, Zoom.class);

        return zoom;
    }

    public Zoom update(UpdateZoomRequest updateRequest) throws IOException {
        String json = objectMapper.writeValueAsString(updateRequest.toResource());
        String response = http.patch(ENDPOINT_URL, json);

        Zoom updatedZoom = objectMapper.readValue(response, Zoom.class);
        return updatedZoom;
    }

    public void delete() throws IOException {
        http.delete(ENDPOINT_URL);
    }
}
