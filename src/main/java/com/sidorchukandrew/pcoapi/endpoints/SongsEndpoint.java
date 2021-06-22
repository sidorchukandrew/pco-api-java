package com.sidorchukandrew.pcoapi.endpoints;
import com.sidorchukandrew.pcoapi.models.*;

import java.io.IOException;


public class SongsEndpoint extends Endpoint implements Endpoint.CollectionEndpoint {

    public SongsEndpoint(Config config) {
        super(config, "https://api.planningcenteronline.com/services/v2/songs");
    }

    public Songs list() throws IOException {
        String response = http.get(ENDPOINT_URL);
        return objectMapper.readValue(response, Songs.class);
    }

    public Songs list(SongRequestOptions requestOptions) {
        return null;
    }

    public Song create(UpdateSongRequest createSongRequest) throws IOException {
        String json = objectMapper.writeValueAsString(createSongRequest.toResource());
        String response = http.post(ENDPOINT_URL, json);
        Song createdSong = objectMapper.readValue(response, Song.class);
        return createdSong;
    }
}
