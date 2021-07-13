package com.sidorchukandrew.pcoapi.apis.services.endpoints;

import com.sidorchukandrew.pcoapi.apis.services.models.Config;
import com.sidorchukandrew.pcoapi.apis.services.models.People;
import com.sidorchukandrew.pcoapi.apis.services.models.PeopleRequestOptions;

import java.io.IOException;

public class PeopleEndpoint extends Endpoint implements CollectionEndpoint {

    public PeopleEndpoint(Config config) {
        super(config, "https://api.planningcenteronline.com/services/v2/people");
    }

    @Override
    public People list() throws IOException {
        String response = http.get(ENDPOINT_URL);
        People people = objectMapper.readValue(response, People.class);

        return people;
    }

    public People list(PeopleRequestOptions requestOptions) throws IOException {
        String response = http.get(ENDPOINT_URL, requestOptions);
        People people = objectMapper.readValue(response, People.class);

        return people;
    }
}
