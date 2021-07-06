package com.sidorchukandrew.pcoapi.models;

public class TemplateOwner {
    private RelationshipData data;

    private TemplateOwner() { }

    private TemplateOwner(Builder builder) {
        data = builder.data;
    }

    public static class Builder {
        private RelationshipData data;

        public Builder data(RelationshipData data) {
            this.data = data;
            return this;
        }

        public TemplateOwner build() {
            return new TemplateOwner(this);
        }
    }

    public RelationshipData getData() {
        return data;
    }

    @Override
    public String toString() {
        return "TemplateOwner{" +
                "data=" + data +
                '}';
    }
}
