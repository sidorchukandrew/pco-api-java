package com.sidorchukandrew.pcoapi;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.sidorchukandrew.pcoapi.apis.ServicesApi;
import com.sidorchukandrew.pcoapi.http.HttpClient;
import com.sidorchukandrew.pcoapi.models.Config;

public class PlanningCenterClient implements Config {
    private HttpClient httpClient;
    private ObjectMapper objectMapper;

    private ServicesApi servicesApi;

    public PlanningCenterClient(String accessToken) {
        httpClient = new HttpClient(accessToken);

        buildOnInitialization();
    }

    public PlanningCenterClient(String applicationId, String secret) {
        httpClient = new HttpClient(applicationId, secret);
        buildOnInitialization();
    }

    private void buildOnInitialization() {
        objectMapper = new ObjectMapper();
        objectMapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        objectMapper.registerModule(new JavaTimeModule());
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        servicesApi = new ServicesApi(this);
    }

    public ServicesApi getServicesApi() {
        return servicesApi;
    }

    public HttpClient getHttpClient() {
        return httpClient;
    }

    public ObjectMapper getObjectMapper() {
        return objectMapper;
    }
}
