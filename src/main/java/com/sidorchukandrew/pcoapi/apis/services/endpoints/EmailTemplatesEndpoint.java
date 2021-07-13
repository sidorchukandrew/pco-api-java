package com.sidorchukandrew.pcoapi.apis.services.endpoints;

import com.sidorchukandrew.pcoapi.apis.services.models.*;

import java.io.IOException;

public class EmailTemplatesEndpoint extends Endpoint implements CollectionEndpoint {

    public EmailTemplatesEndpoint(Config config) {
        super(config, "https://api.planningcenteronline.com/services/v2/email_templates");
    }

    @Override
    public EmailTemplates list() throws IOException {
        String response = http.get(ENDPOINT_URL);
        EmailTemplates emailTemplates = objectMapper.readValue(response, EmailTemplates.class);

        return emailTemplates;
    }

    public EmailTemplates list(EmailTemplateRequestOptions requestOptions) throws IOException {
        String response = http.get(ENDPOINT_URL, requestOptions);
        EmailTemplates emailTemplates = objectMapper.readValue(response, EmailTemplates.class);

        return emailTemplates;
    }

    public EmailTemplate create(CreateEmailTemplateRequest createRequest) throws IOException {
        String json = objectMapper.writeValueAsString(createRequest.toResource());
        String response = http.post(ENDPOINT_URL, json);

        EmailTemplate createdEmailTemplate = objectMapper.readValue(response, EmailTemplate.class);
        return createdEmailTemplate;
    }
}
