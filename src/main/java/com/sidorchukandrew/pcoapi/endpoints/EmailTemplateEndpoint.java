package com.sidorchukandrew.pcoapi.endpoints;

import com.sidorchukandrew.pcoapi.interfaces.Config;
import com.sidorchukandrew.pcoapi.interfaces.IndividualEndpoint;
import com.sidorchukandrew.pcoapi.models.EmailTemplate;

import java.io.IOException;

public class EmailTemplateEndpoint extends Endpoint implements IndividualEndpoint {
    private int emailTemplateId;

    public EmailTemplateEndpoint(Config config, int emailTemplateId) {
        super(config, "https://api.planningcenteronline.com/services/v2/email_templates/" + emailTemplateId);
        this.emailTemplateId = emailTemplateId;
    }

    public EmailTemplate get() throws IOException {
        String response = http.get(ENDPOINT_URL);
        EmailTemplate emailTemplate = objectMapper.readValue(response, EmailTemplate.class);

        return emailTemplate;
    }
}
