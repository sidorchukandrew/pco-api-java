package com.sidorchukandrew.pcoapi.models;

public class Parent {
    private int id;
    private String type;

    private Parent() { }

    private Parent(Builder builder) {
        id = builder.id;
        type = builder.type;
    }

    public static class Builder {
        private int id;
        private String type;

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public Parent build() {
            return new Parent(this);
        }
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Parent{" +
                "id=" + id +
                ", type='" + type + '\'' +
                '}';
    }
}
