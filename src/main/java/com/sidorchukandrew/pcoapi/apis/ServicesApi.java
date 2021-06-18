package com.sidorchukandrew.pcoapi.apis;

import com.sidorchukandrew.pcoapi.endpoints.*;
import com.sidorchukandrew.pcoapi.interfaces.Config;

public class ServicesApi {
    private Config config;
    private SongsEndpoint songsEndpoint;
    private AttachmentTypesEndpoint attachmentTypesEndpoint;
    private EmailTemplatesEndpoint emailTemplatesEndpoint;

    public ServicesApi(Config config) {
        this.config = config;
    }

    public SongsEndpoint songs() {
        return new SongsEndpoint(config);
    }

    public SongEndpoint song(int songId) {
        return new SongEndpoint(config, songId);
    }

    public AttachmentTypesEndpoint attachmentTypes() {
        return new AttachmentTypesEndpoint(config);
    }

    public EmailTemplatesEndpoint emailTemplates() {
        return new EmailTemplatesEndpoint(config);
    }

    public EmailTemplateEndpoint emailTemplate(int emailTemplateId) {
        return new EmailTemplateEndpoint(config, emailTemplateId);
    }
}
