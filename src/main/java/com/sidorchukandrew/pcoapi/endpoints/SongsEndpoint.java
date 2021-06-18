package com.sidorchukandrew.pcoapi.endpoints;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.sidorchukandrew.pcoapi.http.HttpClient;
import com.sidorchukandrew.pcoapi.interfaces.CollectionEndpoint;
import com.sidorchukandrew.pcoapi.interfaces.Config;
import com.sidorchukandrew.pcoapi.models.CreateSongRequest;
import com.sidorchukandrew.pcoapi.models.Songs;
import okhttp3.*;

import java.io.IOException;


public class SongsEndpoint extends Endpoint implements CollectionEndpoint {

    public SongsEndpoint(Config config) {
        super(config, "https://api.planningcenteronline.com/services/v2/songs");
    }

    public Songs list() throws IOException {
        String response = http.get(ENDPOINT_URL);
        return objectMapper.readValue(response, Songs.class);
    }
}
