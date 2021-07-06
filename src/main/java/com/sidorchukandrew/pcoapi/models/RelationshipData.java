package com.sidorchukandrew.pcoapi.models;

public class RelationshipData {
    private String type;
    private Integer id;

    private RelationshipData() { }

    private RelationshipData(Builder builder) {
        type = builder.type;
        id = builder.id;
    }

    public static class Builder {
        private String type;
        private Integer id;

        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public Builder id(Integer id) {
            this.id = id;
            return this;
        }

        public RelationshipData build() {
            return new RelationshipData(this);
        }
    }

    public String getType() {
        return type;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return "RelationshipData{" +
                "type='" + type + '\'' +
                ", id=" + id +
                '}';
    }
}
