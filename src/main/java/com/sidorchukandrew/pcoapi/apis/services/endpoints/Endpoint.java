package com.sidorchukandrew.pcoapi.apis.services.endpoints;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sidorchukandrew.pcoapi.http.HttpClient;
import com.sidorchukandrew.pcoapi.apis.services.models.Config;

public class Endpoint {
    protected HttpClient http;
    protected ObjectMapper objectMapper;
    protected Config config;

    protected final String ENDPOINT_URL;

    public Endpoint(Config config, String url) {
        ENDPOINT_URL = url;
        http = config.getHttpClient();
        objectMapper = config.getObjectMapper();
        this.config = config;
    }
}
