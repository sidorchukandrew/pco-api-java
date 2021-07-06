package com.sidorchukandrew.pcoapi.endpoints;

import java.io.IOException;

interface ResourceEndpoint {
    Object get() throws IOException;
}
