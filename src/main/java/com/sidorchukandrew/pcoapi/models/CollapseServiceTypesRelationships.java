package com.sidorchukandrew.pcoapi.models;

public class CollapseServiceTypesRelationships {
    private RelationshipList serviceType;

    private CollapseServiceTypesRelationships() { }

    public CollapseServiceTypesRelationships(RelationshipList serviceType) {
        this.serviceType = serviceType;
    }

    public RelationshipList getServiceType() {
        return serviceType;
    }

    @Override
    public String toString() {
        return "CollapseServiceTypesRelationships{" +
                "serviceType=" + serviceType +
                '}';
    }
}
