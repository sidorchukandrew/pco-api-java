package com.sidorchukandrew.pcoapi;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.sidorchukandrew.pcoapi.apis.services.ServicesApi;
import com.sidorchukandrew.pcoapi.apis.services.include.SignupSheetIncludableResource;
import com.sidorchukandrew.pcoapi.apis.services.models.*;

import java.io.IOException;
import java.time.LocalDateTime;

public class Main {

    public static void main(String [] args) {
        System.out.println("Starting at: " + LocalDateTime.now().toString());
        System.out.println("--------------------------------------------------------------------------");
        long startTime = System.nanoTime();
        PlanningCenterClient pco = configurePco();
        ServicesApi servicesApi = pco.getServicesApi();


        try {
            Songs songs = servicesApi.songs().list();
            print(songs);
        } catch (Exception e) {
            e.printStackTrace();
        }

        long endTime = System.nanoTime();
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Finished at: " + LocalDateTime.now().toString());
        System.out.println("Duration: " + ((endTime - startTime) / 1000000000) + "s");
    }

    private static PlanningCenterClient configurePco() {
        return new PlanningCenterClient("a0e633937f9cf930524402fef95bda22da3d3fd551bba5d0b5c3f6de4e4c8777", "6b7f245e326ec9e9dacdab3fedd2e05db23e4ac6447203613333f90ca09b4b26");
    }

    public static void print(Object object) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        objectMapper.registerModule(new JavaTimeModule());
        objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        objectMapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(object));
    }
}
