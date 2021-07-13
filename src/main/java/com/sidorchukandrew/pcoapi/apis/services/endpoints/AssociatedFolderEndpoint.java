package com.sidorchukandrew.pcoapi.apis.services.endpoints;

import com.sidorchukandrew.pcoapi.apis.services.models.Config;
import com.sidorchukandrew.pcoapi.apis.services.models.Folder;
import com.sidorchukandrew.pcoapi.apis.services.models.FolderRequestOptions;

import java.io.IOException;

public class AssociatedFolderEndpoint extends Endpoint implements ResourceEndpoint {

    private Integer folderId;
    public AssociatedFolderEndpoint(Config config, String baseUrl, Integer associatedFolderId) {
        super(config, baseUrl + "/folders/" + associatedFolderId);
        this.folderId = associatedFolderId;
    }

    @Override
    public Folder get() throws IOException {
        String response = http.get(ENDPOINT_URL);
        Folder folder = objectMapper.readValue(response, Folder.class);

        return folder;
    }

    public Folder get(FolderRequestOptions requestOptions) throws IOException {
        String response = http.get(ENDPOINT_URL, requestOptions);
        Folder folder = objectMapper.readValue(response, Folder.class);

        return folder;
    }

    public AssociatedFolderEndpoint folder(Integer associatedFolderId) {
        return new AssociatedFolderEndpoint(config, ENDPOINT_URL, associatedFolderId);
    }

    public AssociatedFoldersEndpoint folders() {
        return new AssociatedFoldersEndpoint(config, folderId);
    }
}
