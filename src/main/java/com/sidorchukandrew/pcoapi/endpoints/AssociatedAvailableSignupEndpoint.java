package com.sidorchukandrew.pcoapi.endpoints;

import com.sidorchukandrew.pcoapi.models.AvailableSignup;
import com.sidorchukandrew.pcoapi.models.AvailableSignupRequestOptions;
import com.sidorchukandrew.pcoapi.models.Config;
import com.sidorchukandrew.pcoapi.models.Resource;

import java.io.IOException;

public class AssociatedAvailableSignupEndpoint extends Endpoint implements ResourceEndpoint {

    private Integer availableSignupId;

    public AssociatedAvailableSignupEndpoint(Config config, String baseUrl, Integer availableSignupId) {
        super(config, baseUrl + "/available_signups/" + availableSignupId);
        this.availableSignupId = availableSignupId;
    }

    // Associations
    public AssociatedSignupSheetsEndpoint signupSheets() {
        return new AssociatedSignupSheetsEndpoint(config, ENDPOINT_URL);
    }

    public AssociatedSignupSheetEndpoint signupSheet(String signupSheetId) {
        return new AssociatedSignupSheetEndpoint(config, ENDPOINT_URL, signupSheetId);
    }

    @Override
    public AvailableSignup get() throws IOException {
        String response = http.get(ENDPOINT_URL);
        AvailableSignup availableSignup = objectMapper.readValue(response, AvailableSignup.class);

        return availableSignup;
    }

    public AvailableSignup get(AvailableSignupRequestOptions requestOptions) throws IOException {
        String response = http.get(ENDPOINT_URL, requestOptions);
        AvailableSignup availableSignup = objectMapper.readValue(response, AvailableSignup.class);

        return availableSignup;
    }
}
