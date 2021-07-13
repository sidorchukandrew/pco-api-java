package com.sidorchukandrew.pcoapi.apis.services.endpoints;

import com.sidorchukandrew.pcoapi.apis.services.models.*;

import java.io.IOException;

public class FolderEndpoint extends Endpoint implements ResourceEndpoint {
    private Integer folderId;

    public FolderEndpoint(Config config, Integer folderId) {
        super(config, "https://api.planningcenteronline.com/services/v2/folders/" + folderId);
        this.folderId = folderId;
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

    public Folder update(UpdateFolderRequest updateRequest) throws IOException {
        String json = objectMapper.writeValueAsString(updateRequest.toResource());
        String response = http.patch(ENDPOINT_URL, json);

        Folder updatedFolder = objectMapper.readValue(response, Folder.class);
        return updatedFolder;
    }

    public void delete() throws IOException {
        String response = http.delete(ENDPOINT_URL);
    }

    public AssociatedFoldersEndpoint folders() {
        return new AssociatedFoldersEndpoint(config, folderId);
    }

    public AssociatedFolderEndpoint folder(Integer associatedFolderId) {
        return new AssociatedFolderEndpoint(config, ENDPOINT_URL, associatedFolderId);
    }
}
