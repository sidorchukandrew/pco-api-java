package com.sidorchukandrew.pcoapi.models;

import java.util.List;

public interface Collection {
    Links getLinks();
    Meta getMeta();
    List getData();
    List getIncluded();
}
