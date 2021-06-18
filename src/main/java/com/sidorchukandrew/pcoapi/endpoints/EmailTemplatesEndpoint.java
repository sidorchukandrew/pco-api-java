package com.sidorchukandrew.pcoapi.endpoints;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sidorchukandrew.pcoapi.http.HttpClient;
import com.sidorchukandrew.pcoapi.interfaces.CollectionEndpoint;
import com.sidorchukandrew.pcoapi.interfaces.Config;
import com.sidorchukandrew.pcoapi.models.EmailTemplates;

import java.io.IOException;

public class EmailTemplatesEndpoint extends Endpoint implements CollectionEndpoint {
    public EmailTemplatesEndpoint(Config config) {
        super(config, "https://api.planningcenteronline.com/services/v2/email_templates");
    }

    public EmailTemplates list() throws IOException {
        String response = http.get(ENDPOINT_URL);
        EmailTemplates emailTemplates = objectMapper.readValue(response, EmailTemplates.class);

        return emailTemplates;
    }
}
