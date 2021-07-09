package com.sidorchukandrew.pcoapi.models;

public class FolderLinks extends Links {
    private String folders;
    private String serviceTypes;

    private FolderLinks() { }

    private FolderLinks(Builder builder) {
        folders = builder.folders;
        serviceTypes = builder.serviceTypes;
        self = builder.self;
        next = builder.next;
        render = builder.render;
    }

    public static class Builder {
        private String folders;
        private String serviceTypes;
        private String self;
        private String next;
        private String render;
    }

    public String getFolders() {
        return folders;
    }

    public String getServiceTypes() {
        return serviceTypes;
    }

    @Override
    public String toString() {
        return "FolderLinks{" +
                "folders='" + folders + '\'' +
                ", serviceTypes='" + serviceTypes + '\'' +
                ", self='" + self + '\'' +
                ", next='" + next + '\'' +
                ", render='" + render + '\'' +
                '}';
    }
}
