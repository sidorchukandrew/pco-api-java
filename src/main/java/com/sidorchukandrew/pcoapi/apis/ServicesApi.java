package com.sidorchukandrew.pcoapi.apis;

import com.sidorchukandrew.pcoapi.endpoints.*;
import com.sidorchukandrew.pcoapi.models.Config;

public class ServicesApi {
    private Config config;
    private SongsEndpoint songsEndpoint;

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

    public EmailTemplateEndpoint emailTemplate(Integer id) {
        return new EmailTemplateEndpoint(config, id);
    }
}
