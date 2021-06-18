package com.sidorchukandrew.pcoapi.interfaces;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sidorchukandrew.pcoapi.http.HttpClient;

public interface Config {

    HttpClient getHttpClient();

    ObjectMapper getObjectMapper();
}
