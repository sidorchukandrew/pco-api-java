package com.sidorchukandrew.pcoapi.apis.services.models;

public class Links {
    protected String self;
    protected String next;
    protected String render;
    protected String prev;

    protected Links() { }

    private Links(Builder builder) {
        self = builder.self;
        next = builder.next;
        render = builder.render;
        prev = builder.prev;
    }

    public static class Builder {
        private String self;
        private String next;
        private String render;
        private String prev;

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

        public Builder prev(String prev) {
            this.prev = prev;
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

    public String getPrev() {
        return prev;
    }

    @Override
    public String toString() {
        return "Links{" +
                "self='" + self + '\'' +
                ", next='" + next + '\'' +
                ", render='" + render + '\'' +
                ", prev='" + prev + '\'' +
                '}';
    }
}
