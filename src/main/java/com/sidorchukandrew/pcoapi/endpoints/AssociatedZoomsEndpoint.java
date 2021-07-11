package com.sidorchukandrew.pcoapi.endpoints;

import com.sidorchukandrew.pcoapi.models.*;

import java.io.IOException;

public class AssociatedZoomsEndpoint extends Endpoint implements CollectionEndpoint {

    public AssociatedZoomsEndpoint(Config config, String baseUrl) {
        super(config, baseUrl + "/zooms");
    }

    @Override
    public Zooms list() throws IOException {
        String response = http.get(ENDPOINT_URL);
        Zooms zooms = objectMapper.readValue(response, Zooms.class);

        return zooms;
    }

    public Zooms list(ZoomRequestOptions requestOptions) throws IOException {
        String response = http.get(ENDPOINT_URL, requestOptions);
        Zooms zooms = objectMapper.readValue(response, Zooms.class);

        return zooms;
    }

    public Zoom create(CreateZoomRequest createRequest) throws IOException {
        String json = objectMapper.writeValueAsString(createRequest.toResource());
        String response = http.post(ENDPOINT_URL, json);

        Zoom createdZoom = objectMapper.readValue(response, Zoom.class);
        return createdZoom;
    }
}
