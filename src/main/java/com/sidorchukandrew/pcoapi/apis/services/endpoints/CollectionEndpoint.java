package com.sidorchukandrew.pcoapi.apis.services.endpoints;

import com.sidorchukandrew.pcoapi.apis.services.models.Collection;

import java.io.IOException;

public interface CollectionEndpoint {
    Collection list() throws IOException;
}
