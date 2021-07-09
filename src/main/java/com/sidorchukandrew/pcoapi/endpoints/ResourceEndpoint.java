package com.sidorchukandrew.pcoapi.endpoints;

import com.sidorchukandrew.pcoapi.models.Resource;
import java.io.IOException;

interface ResourceEndpoint {
    Resource get() throws IOException;
}
