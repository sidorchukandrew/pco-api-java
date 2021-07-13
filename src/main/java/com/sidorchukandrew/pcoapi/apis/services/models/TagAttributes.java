package com.sidorchukandrew.pcoapi.apis.services.models;

public class TagAttributes implements Attributes {
    private String name;

    private TagAttributes() { }

    public TagAttributes(String name) {
        this.name= name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "TagAttributes{" +
                "name='" + name + '\'' +
                '}';
    }
}
