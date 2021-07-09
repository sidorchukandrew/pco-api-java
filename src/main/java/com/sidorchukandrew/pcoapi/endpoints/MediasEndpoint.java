package com.sidorchukandrew.pcoapi.endpoints;

import com.sidorchukandrew.pcoapi.models.*;

import java.io.IOException;

public class MediasEndpoint extends Endpoint implements CollectionEndpoint {
    public MediasEndpoint(Config config) {
        super(config, "https://api.planningcenteronline.com/services/v2/media");
    }

    @Override
    public Medias list() throws IOException {
        String response = http.get(ENDPOINT_URL);
        Medias media = objectMapper.readValue(response, Medias.class);

        return media;
    }

    public Medias list(MediaRequestOptions requestOptions) throws IOException {
        String response = http.get(ENDPOINT_URL, requestOptions);
        Medias media = objectMapper.readValue(response, Medias.class);

        return media;
    }

    public Media create(CreateMediaRequest createRequest) throws IOException {
        String json = objectMapper.writeValueAsString(createRequest.toResource());
        String response = http.post(ENDPOINT_URL, json);

        Media createdMedia = objectMapper.readValue(response, Media.class);
        return createdMedia;
    }
}
