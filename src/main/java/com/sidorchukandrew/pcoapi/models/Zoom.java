package com.sidorchukandrew.pcoapi.models;

public class Zoom implements Resource {
    private ZoomData data;
    private Meta meta;

    private Zoom() { }

    private Zoom(Builder builder) {
        data = builder.data;
        meta = builder.meta;
    }

    public static class Builder {
        private ZoomData data;
        private Meta meta;

        public Builder data(ZoomData data) {
            this.data = data;
            return this;
        }

        public Builder meta(Meta meta) {
            this.meta = meta;
            return this;
        }

        public Zoom build() {
            return new Zoom(this);
        }
    }

    @Override
    public ZoomData getData() {
        return data;
    }

    @Override
    public Meta getMeta() {
        return meta;
    }

    @Override
    public String toString() {
        return "Zoom{" +
                "data=" + data +
                ", meta=" + meta +
                '}';
    }
}
