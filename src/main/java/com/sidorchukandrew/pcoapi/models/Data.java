package com.sidorchukandrew.pcoapi.models;

interface Data {
    String getType();
    Object getId();
    Attributes getAttributes();
    Links getLinks();
}
