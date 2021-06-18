package com.sidorchukandrew.pcoapi;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.sidorchukandrew.pcoapi.apis.ServicesApi;
import com.sidorchukandrew.pcoapi.models.*;

import java.io.IOException;

public class Main {

    public static void main(String [] args) {
        PlanningCenterClient pco = configurePco();
        ServicesApi servicesApi = pco.getServicesApi();

        try {
            Songs songs = servicesApi.songs().list();
            System.out.println(songs.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static PlanningCenterClient configurePco() {
        return new PlanningCenterClient("", "");
    }
}
