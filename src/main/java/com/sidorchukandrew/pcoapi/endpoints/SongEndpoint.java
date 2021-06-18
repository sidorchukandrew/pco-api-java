package com.sidorchukandrew.pcoapi.endpoints;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sidorchukandrew.pcoapi.http.HttpClient;
import com.sidorchukandrew.pcoapi.interfaces.Config;
import com.sidorchukandrew.pcoapi.interfaces.IndividualEndpoint;
import com.sidorchukandrew.pcoapi.models.Song;

import java.io.IOException;

public class SongEndpoint extends Endpoint implements IndividualEndpoint {
    private int songId;

    public SongEndpoint(Config config, int songId) {
        super(config, "https://api.planningcenteronline.com/services/v2/songs/" + songId);
        this.songId = songId;
    }

    public Song get() throws IOException {
        String response = http.get(ENDPOINT_URL);
        Song song = objectMapper.readValue(response, Song.class);

        return song;
    }
}
