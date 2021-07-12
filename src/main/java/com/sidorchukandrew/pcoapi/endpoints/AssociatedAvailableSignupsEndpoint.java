package com.sidorchukandrew.pcoapi.endpoints;

import com.sidorchukandrew.pcoapi.models.AvailableSignupRequestOptions;
import com.sidorchukandrew.pcoapi.models.AvailableSignups;
import com.sidorchukandrew.pcoapi.models.Collection;
import com.sidorchukandrew.pcoapi.models.Config;

import java.io.IOException;

public class AssociatedAvailableSignupsEndpoint extends Endpoint implements CollectionEndpoint {

    public AssociatedAvailableSignupsEndpoint(Config config, String baseUrl) {
        super(config, baseUrl + "/available_signups");
    }

    @Override
    public AvailableSignups list() throws IOException {
        String response = http.get(ENDPOINT_URL);
        AvailableSignups availableSignups = objectMapper.readValue(response, AvailableSignups.class);

        return availableSignups;
    }

    public AvailableSignups list(AvailableSignupRequestOptions requestOptions) throws IOException {
        String response = http.get(ENDPOINT_URL, requestOptions);
        AvailableSignups availableSignups = objectMapper.readValue(response, AvailableSignups.class);

        return availableSignups;
    }
}
