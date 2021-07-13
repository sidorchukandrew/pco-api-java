package com.sidorchukandrew.pcoapi.apis.services.endpoints;

import com.sidorchukandrew.pcoapi.apis.services.models.Config;
import com.sidorchukandrew.pcoapi.apis.services.models.Song;
import com.sidorchukandrew.pcoapi.apis.services.models.UpdateSongRequest;

import java.io.IOException;

public class SongEndpoint extends Endpoint implements ResourceEndpoint {
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

    public void delete() throws IOException {
        String response = http.delete(ENDPOINT_URL);
    }

    public Song update(UpdateSongRequest updateSongRequest) throws IOException {
        String json = objectMapper.writeValueAsString(updateSongRequest.toResource());
        String response = http.patch(ENDPOINT_URL, json);
        Song updatedSong = objectMapper.readValue(response, Song.class);
        return updatedSong;
    }
}
