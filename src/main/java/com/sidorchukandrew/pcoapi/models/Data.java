package com.sidorchukandrew.pcoapi.models;

interface Data {
    String getType();
    Integer getId();
    Attributes getAttributes();
    Links getLinks();
}
