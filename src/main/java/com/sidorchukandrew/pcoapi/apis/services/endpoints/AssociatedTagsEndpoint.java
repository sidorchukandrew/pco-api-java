package com.sidorchukandrew.pcoapi.apis.services.endpoints;

import com.sidorchukandrew.pcoapi.apis.services.models.Config;
import com.sidorchukandrew.pcoapi.apis.services.models.TagRequestOptions;
import com.sidorchukandrew.pcoapi.apis.services.models.Tags;

import java.io.IOException;

public class AssociatedTagsEndpoint extends Endpoint implements CollectionEndpoint {

    public AssociatedTagsEndpoint(Config config, String baseUrl) {
        super(config, baseUrl + "/tags");
    }

    @Override
    public Tags list() throws IOException {
        String response = http.get(ENDPOINT_URL);
        Tags tags = objectMapper.readValue(response, Tags.class);

        return tags;
    }

    public Tags list(TagRequestOptions requestOptions) throws IOException {
        String response = http.get(ENDPOINT_URL, requestOptions);
        Tags tags = objectMapper.readValue(response, Tags.class);

        return tags;
    }
}
