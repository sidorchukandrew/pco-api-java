package com.sidorchukandrew.pcoapi.models;

public class Links {
    private String self;
    private String next;
    private String render;

    private Links() { }

    private Links(Builder builder) {
        self = builder.self;
        next = builder.next;
        render = builder.render;
    }

    public static class Builder {
        private String self;
        private String next;
        private String render;

        public Builder self(String self) {
            this.self = self;
            return this;
        }

        public Builder next(String next) {
            this.next = next;
            return this;
        }

        public Builder render(String render) {
            this.render = render;
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

    public String getRender() {
        return render;
    }

    @Override
    public String toString() {
        return "Links{" +
                "self='" + self + '\'' +
                ", next='" + next + '\'' +
                ", render='" + render + '\'' +
                '}';
    }
}
