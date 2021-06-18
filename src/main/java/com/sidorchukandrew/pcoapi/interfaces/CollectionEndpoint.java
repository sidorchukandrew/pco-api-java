package com.sidorchukandrew.pcoapi.interfaces;

import java.io.IOException;

public interface CollectionEndpoint {
    Object list() throws IOException;
}
