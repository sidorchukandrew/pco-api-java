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

    public EmailTemplateEndpoint emailTemplate(Integer emailTemplateId) {
        return new EmailTemplateEndpoint(config, emailTemplateId);
    }

    public FoldersEndpoint folders() {
        return new FoldersEndpoint(config);
    }

    public FolderEndpoint folder(Integer folderId) {
        return new FolderEndpoint(config, folderId);
    }

    public MediasEndpoint media() {
        return new MediasEndpoint(config);
    }

    public MediaEndpoint media(Integer mediaId) {
        return new MediaEndpoint(config, mediaId);
    }
}
