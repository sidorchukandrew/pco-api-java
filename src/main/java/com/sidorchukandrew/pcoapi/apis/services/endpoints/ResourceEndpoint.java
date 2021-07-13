package com.sidorchukandrew.pcoapi.apis.services.endpoints;

import com.sidorchukandrew.pcoapi.apis.services.models.Resource;

import java.io.IOException;

public interface ResourceEndpoint {
    Resource get() throws IOException;
}
