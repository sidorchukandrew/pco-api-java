package com.sidorchukandrew.pcoapi.endpoints;

import com.sidorchukandrew.pcoapi.models.*;

import java.io.IOException;

public class AssociatedMediaSchedulesEndpoint extends Endpoint implements CollectionEndpoint {
    public AssociatedMediaSchedulesEndpoint(Config config, String baseUrl) {
        super(config, baseUrl + "/media_schedules");
    }

    @Override
    public MediaSchedules list() throws IOException {
        String response = http.get(ENDPOINT_URL);
        MediaSchedules mediaSchedules = objectMapper.readValue(response, MediaSchedules.class);

        return mediaSchedules;
    }

    public MediaSchedules list(MediaScheduleRequestOptions requestOptions) throws IOException {
        String response = http.get(ENDPOINT_URL, requestOptions);
        MediaSchedules mediaSchedules = objectMapper.readValue(response, MediaSchedules.class);

        return mediaSchedules;
    }
}
