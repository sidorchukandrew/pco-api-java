package com.sidorchukandrew.pcoapi.endpoints;

import com.sidorchukandrew.pcoapi.models.Config;
import com.sidorchukandrew.pcoapi.models.MediaSchedule;
import com.sidorchukandrew.pcoapi.models.Resource;

import java.io.IOException;

public class AssociatedMediaScheduleEndpoint extends Endpoint implements ResourceEndpoint {

    private Integer mediaScheduleId;

    public AssociatedMediaScheduleEndpoint(Config config, String baseUrl, Integer mediaScheduleId) {
        super(config, baseUrl + "/media_schedules/" + mediaScheduleId);
        this.mediaScheduleId = mediaScheduleId;
    }

    @Override
    public MediaSchedule get() throws IOException {
        String response = http.get(ENDPOINT_URL);
        MediaSchedule mediaSchedule = objectMapper.readValue(response, MediaSchedule.class);

        return mediaSchedule;
    }
}
