package com.sidorchukandrew.pcoapi.endpoints;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sidorchukandrew.pcoapi.http.HttpClient;
import com.sidorchukandrew.pcoapi.models.Config;

import java.io.IOException;

class Endpoint {
    protected HttpClient http;
    protected ObjectMapper objectMapper;

    protected final String ENDPOINT_URL;

    public Endpoint(Config config, String url) {
        ENDPOINT_URL = url;
        http = config.getHttpClient();
        objectMapper = config.getObjectMapper();
    }

    public static interface CollectionEndpoint {
        Object list() throws IOException;
    }
}
