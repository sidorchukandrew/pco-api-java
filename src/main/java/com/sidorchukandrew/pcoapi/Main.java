package com.sidorchukandrew.pcoapi;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.sidorchukandrew.pcoapi.apis.ServicesApi;
import com.sidorchukandrew.pcoapi.include.AttachmentIncludableResource;
import com.sidorchukandrew.pcoapi.include.AvailableSignupIncludableResource;
import com.sidorchukandrew.pcoapi.include.SignupSheetIncludableResource;
import com.sidorchukandrew.pcoapi.models.*;
import com.sidorchukandrew.pcoapi.orderby.AttachmentOrderableParam;
import com.sidorchukandrew.pcoapi.orderby.PersonOrderableParam;
import com.sidorchukandrew.pcoapi.queryby.AttachmentQueryableParam;
import com.sidorchukandrew.pcoapi.queryby.PersonQueryableParam;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String [] args) {
        System.out.println("Starting at: " + LocalDateTime.now().toString());
        System.out.println("--------------------------------------------------------------------------");
        long startTime = System.nanoTime();
        PlanningCenterClient pco = configurePco();
        ServicesApi servicesApi = pco.getServicesApi();

        try {
            SignupSheetRequestOptions options = new SignupSheetRequestOptions.Builder()
                    .include(SignupSheetIncludableResource.SCHEDULED_PEOPLE)
                    .include(SignupSheetIncludableResource.SIGNUP_SHEET_METADATA)
                    .build();


            SignupSheet signupSheet = servicesApi
                    .person(43874515)
                    .availableSignup(1150437)
                    .signupSheet("i24603944p53766514t4549299o675231789")
                    .get(options);

            print(signupSheet);
        } catch (Exception e) {
            e.printStackTrace();
        }

        long endTime = System.nanoTime();
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Finished at: " + LocalDateTime.now().toString());
        System.out.println("Duration: " + ((endTime - startTime) / 1000000000) + "s");
    }

    private static PlanningCenterClient configurePco() {
        return new PlanningCenterClient("", "");
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
