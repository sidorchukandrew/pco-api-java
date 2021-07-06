package com.sidorchukandrew.pcoapi.endpoints;

import com.sidorchukandrew.pcoapi.models.Collection;

import java.io.IOException;

public interface CollectionEndpoint {
    Collection list() throws IOException;
}
