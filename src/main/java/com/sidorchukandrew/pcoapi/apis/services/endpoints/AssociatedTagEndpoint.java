package com.sidorchukandrew.pcoapi.apis.services.endpoints;

import com.sidorchukandrew.pcoapi.apis.services.models.Config;
import com.sidorchukandrew.pcoapi.apis.services.models.Tag;

import java.io.IOException;

public class AssociatedTagEndpoint extends Endpoint implements ResourceEndpoint {

    private Integer tagId;

    public AssociatedTagEndpoint(Config config, String baseUrl, Integer tagId) {
        super(config, baseUrl + "/tags/" + tagId);
        this.tagId = tagId;
    }

    @Override
    public Tag get() throws IOException {
        String response = http.get(ENDPOINT_URL);
        Tag tag = objectMapper.readValue(response, Tag.class);

        return tag;
    }
}
