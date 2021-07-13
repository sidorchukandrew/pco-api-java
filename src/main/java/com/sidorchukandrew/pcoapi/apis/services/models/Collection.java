package com.sidorchukandrew.pcoapi.apis.services.models;

import java.util.List;

public interface Collection {
    Links getLinks();
    Meta getMeta();
    List getData();
    List getIncluded();
}
