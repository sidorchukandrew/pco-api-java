package com.sidorchukandrew.pcoapi.apis.services.endpoints;

import com.sidorchukandrew.pcoapi.apis.services.models.Config;
import com.sidorchukandrew.pcoapi.apis.services.models.SignupSheetRequestOptions;
import com.sidorchukandrew.pcoapi.apis.services.models.SignupSheets;

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

    public SignupSheets list(SignupSheetRequestOptions requestOptions) throws IOException {
        String response = http.get(ENDPOINT_URL, requestOptions);
        SignupSheets signupSheets = objectMapper.readValue(response, SignupSheets.class);

        return signupSheets;
    }
}
