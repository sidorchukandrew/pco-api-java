package com.sidorchukandrew.pcoapi.endpoints;

import com.sidorchukandrew.pcoapi.models.Collection;
import com.sidorchukandrew.pcoapi.models.Config;
import com.sidorchukandrew.pcoapi.models.FolderRequestOptions;
import com.sidorchukandrew.pcoapi.models.Folders;

import java.io.IOException;

public class AssociatedFoldersEndpoint extends Endpoint implements CollectionEndpoint {

    public AssociatedFoldersEndpoint(Config config, Integer parentId) {
        super(config, "https://api.planningcenteronline.com/services/v2/folders/" + parentId + "/folders");
    }

    @Override
    public Folders list() throws IOException {
        String response = http.get(ENDPOINT_URL);
        Folders folders = objectMapper.readValue(response, Folders.class);

        return folders;
    }

    public Folders list(FolderRequestOptions requestOptions) throws  IOException {
        String response = http.get(ENDPOINT_URL, requestOptions);
        Folders folders = objectMapper.readValue(response, Folders.class);

        return folders;
    }
}
