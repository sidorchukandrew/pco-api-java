package com.sidorchukandrew.pcoapi;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.sidorchukandrew.pcoapi.apis.ServicesApi;
import com.sidorchukandrew.pcoapi.include.FolderIncludableResource;
import com.sidorchukandrew.pcoapi.include.MediaIncludableResource;
import com.sidorchukandrew.pcoapi.models.*;
import com.sidorchukandrew.pcoapi.orderby.FolderOrderableAttribute;
import com.sidorchukandrew.pcoapi.orderby.MediaOrderableAttribute;
import com.sidorchukandrew.pcoapi.queryby.FolderQueryableAttribute;
import com.sidorchukandrew.pcoapi.queryby.MediaQueryableAttribute;

import java.io.IOException;

public class Main {

    public static void main(String [] args) {
        PlanningCenterClient pco = configurePco();
        ServicesApi servicesApi = pco.getServicesApi();

        try {
            servicesApi.media(2807525).archive();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static PlanningCenterClient configurePco() {
        return new PlanningCenterClient("", "");
    }

    private static void print(Object object) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        objectMapper.registerModule(new JavaTimeModule());
        objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        objectMapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(object));
    }
}
