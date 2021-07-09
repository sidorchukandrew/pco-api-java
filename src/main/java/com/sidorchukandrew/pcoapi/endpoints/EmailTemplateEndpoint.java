package com.sidorchukandrew.pcoapi.endpoints;

import com.sidorchukandrew.pcoapi.models.*;

import java.io.IOException;

public class EmailTemplateEndpoint extends Endpoint implements ResourceEndpoint {

    private int emailTemplateId;

    public EmailTemplateEndpoint(Config config, int emailTemplateId) {
        super(config, "https://api.planningcenteronline.com/services/v2/email_templates/" + emailTemplateId);
        this.emailTemplateId = emailTemplateId;
    }

    @Override
    public EmailTemplate get() throws IOException {
        String response = http.get(ENDPOINT_URL);
        EmailTemplate emailTemplate = objectMapper.readValue(response, EmailTemplate.class);

        return emailTemplate;
    }

    public EmailTemplate update(UpdateEmailTemplateRequest updateRequest) throws IOException {
        String json = objectMapper.writeValueAsString(updateRequest.toResource());
        String response  = http.update(ENDPOINT_URL, json);

        EmailTemplate updatedEmailTemplate = objectMapper.readValue(response, EmailTemplate.class);
        return updatedEmailTemplate;
    }

    public void delete() throws IOException {
        String response = http.delete(ENDPOINT_URL);
    }

    // ACTIONS
    public RenderedEmailTemplate render(RenderEmailTemplateRequest renderRequest) throws IOException {
        String json = objectMapper.writeValueAsString(renderRequest);
        String response = http.post(ENDPOINT_URL + "/render", json);

        RenderedEmailTemplate renderedTemplate = objectMapper.readValue(response, RenderedEmailTemplate.class);
        return renderedTemplate;
    }
}
