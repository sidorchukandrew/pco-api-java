package com.sidorchukandrew.pcoapi.endpoints;

import com.sidorchukandrew.pcoapi.models.Config;
import com.sidorchukandrew.pcoapi.models.SignupSheets;

import java.io.IOException;

public class AssociatedSignupSheetsEndpoint extends Endpoint implements CollectionEndpoint {

    public AssociatedSignupSheetsEndpoint(Config config, String baseUrl) {
        super(config, baseUrl + "/signup_sheets");
    }

    @Override
    public SignupSheets list() throws IOException {
        String response = http.get(ENDPOINT_URL);
        SignupSheets signupSheets = objectMapper.readValue(response, SignupSheets.class);

        return signupSheets;
    }
}
