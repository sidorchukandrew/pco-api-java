package com.sidorchukandrew.pcoapi.models;

public class EmailTemplateData {
    private String type;
    private Integer id;
    private EmailTemplateAttributes attributes;
    private Links links;

    public String getType() {
        return type;
    }

    public Integer getId() {
        return id;
    }

    public EmailTemplateAttributes getAttributes() {
        return attributes;
    }

    public Links getLinks() {
        return links;
    }

    @Override
    public String toString() {
        return "EmailTemplateData{" +
                "type='" + type + '\'' +
                ", id=" + id +
                ", attributes=" + attributes +
                ", links=" + links +
                '}';
    }
}
