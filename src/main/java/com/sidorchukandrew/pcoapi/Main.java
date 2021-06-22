package com.sidorchukandrew.pcoapi;

import com.sidorchukandrew.pcoapi.apis.ServicesApi;
import com.sidorchukandrew.pcoapi.models.*;
import com.sidorchukandrew.pcoapi.queryby.SongOrderableAttribute;
import com.sidorchukandrew.pcoapi.queryby.SongQueryableAttribute;

import java.io.IOException;

public class Main {

    public static void main(String [] args) {
        PlanningCenterClient pco = configurePco();
        ServicesApi servicesApi = pco.getServicesApi();
        try {
            SongRequestOptions requestOptions = new SongRequestOptions.Builder()
                    .queryBy(SongQueryableAttribute.TITLE, "Amazing Grace")
                    .queryBy(SongQueryableAttribute.ARRANGEMENT_NAME, "Primary")
                    .orderBy(SongOrderableAttribute.LAST_SCHEDULED_AT_REVERSED)
                    .build();

            servicesApi.songs().list(requestOptions);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static PlanningCenterClient configurePco() {
        return new PlanningCenterClient("", "");
    }
}
