package com.sidorchukandrew.pcoapi.apis.services.models;

public class CollapseServiceTypes {
    private CollapseServiceTypesData data;

    private CollapseServiceTypes() { }

    public CollapseServiceTypes(CollapseServiceTypesData data) {
        this.data = data;
    }

    public CollapseServiceTypesData getData() {
        return data;
    }

    @Override
    public String toString() {
        return "CollapseServiceTypes{" +
                "data=" + data +
                '}';
    }
}
