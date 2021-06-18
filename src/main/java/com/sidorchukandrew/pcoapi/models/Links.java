package com.sidorchukandrew.pcoapi.models;

public class Links {
    private String self;
    private String next;

    private Links() { }
    private Links(Builder builder) {
        self = builder.self;
        next = builder.next;
    }

    public static class Builder {
        private String self;
        private String next;

        public Builder self(String self) {
            this.self = self;
            return this;
        }

        public Builder next(String next) {
            this.next = next;
            return this;
        }

        public Links build() {
            return new Links(this);
        }
    }

    public String getSelf() {
        return self;
    }

    public String getNext() {
        return next;
    }

    @Override
    public String toString() {
        return "Links{" +
                "self='" + self + '\'' +
                ", next='" + next + '\'' +
                '}';
    }
}
