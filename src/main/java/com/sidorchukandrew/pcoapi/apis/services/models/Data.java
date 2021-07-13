package com.sidorchukandrew.pcoapi.apis.services.models;

interface Data {
    String getType();
    Object getId();
    Attributes getAttributes();
    Links getLinks();
}
