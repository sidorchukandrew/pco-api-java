package com.sidorchukandrew.pcoapi;

import com.sidorchukandrew.pcoapi.apis.ServicesApi;
import com.sidorchukandrew.pcoapi.models.*;

import java.io.IOException;

public class Main {

    public static void main(String [] args) {
        PlanningCenterClient pco = configurePco();
        ServicesApi servicesApi = pco.getServicesApi();

        try {
            UpdateSongRequest updates = new UpdateSongRequest.Builder()
                    .copyright("Dove Records")
                    .build();

            Song updatedSong = servicesApi.song(20773541).update(updates);
            System.out.println(updatedSong.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static PlanningCenterClient configurePco() {
        return new PlanningCenterClient("a0e633937f9cf930524402fef95bda22da3d3fd551bba5d0b5c3f6de4e4c8777", "6b7f245e326ec9e9dacdab3fedd2e05db23e4ac6447203613333f90ca09b4b26");
    }
}
