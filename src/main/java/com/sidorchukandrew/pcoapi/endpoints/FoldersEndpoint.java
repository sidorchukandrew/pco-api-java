package com.sidorchukandrew.pcoapi.endpoints;

import com.sidorchukandrew.pcoapi.models.*;
import com.sidorchukandrew.pcoapi.queryby.FolderQueryableAttribute;

import java.io.IOException;

public class FoldersEndpoint extends Endpoint implements CollectionEndpoint {
    public FoldersEndpoint(Config config) {
        super(config, "https://api.planningcenteronline.com/services/v2/folders");
    }

    @Override
    public Folders list() throws IOException {
        String response = http.get(ENDPOINT_URL);
        Folders folders = objectMapper.readValue(response, Folders.class);

        return folders;
    }

    public Folders list(FolderRequestOptions requestOptions) throws IOException {
        String response = http.get(ENDPOINT_URL, requestOptions);
        Folders folders = objectMapper.readValue(response, Folders.class);

        return folders;
    }

    public Folder create(CreateFolderRequest createRequest) throws IOException {
        String json = objectMapper.writeValueAsString(createRequest.toResource());
        String response = http.post(ENDPOINT_URL, json);

        Folder createdFolder  = objectMapper.readValue(response, Folder.class);
        return createdFolder;
    }
}
