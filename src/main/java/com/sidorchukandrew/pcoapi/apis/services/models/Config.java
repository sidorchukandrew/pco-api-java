package com.sidorchukandrew.pcoapi.apis.services.models;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sidorchukandrew.pcoapi.http.HttpClient;

public interface Config {

    HttpClient getHttpClient();

    ObjectMapper getObjectMapper();
}
