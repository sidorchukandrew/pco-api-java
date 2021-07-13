package com.sidorchukandrew.pcoapi.apis.services.endpoints;

import com.sidorchukandrew.pcoapi.apis.services.models.Config;
import com.sidorchukandrew.pcoapi.apis.services.models.SignupSheet;
import com.sidorchukandrew.pcoapi.apis.services.models.SignupSheetRequestOptions;

import java.io.IOException;

public class AssociatedSignupSheetEndpoint extends Endpoint implements ResourceEndpoint {

    private String signupSheetId;

    public AssociatedSignupSheetEndpoint(Config config, String baseUrl, String signupSheetId) {
        super(config, baseUrl + "/signup_sheets/" + signupSheetId);
        this.signupSheetId = signupSheetId;
    }

    @Override
    public SignupSheet get() throws IOException {
        String response = http.get(ENDPOINT_URL);
        SignupSheet signupSheet = objectMapper.readValue(response, SignupSheet.class);

        return signupSheet;
    }

    public SignupSheet get(SignupSheetRequestOptions requestOptions) throws IOException {
        String response = http.get(ENDPOINT_URL, requestOptions);
        SignupSheet signupSheet = objectMapper.readValue(response, SignupSheet.class);

        return signupSheet;
    }
}
