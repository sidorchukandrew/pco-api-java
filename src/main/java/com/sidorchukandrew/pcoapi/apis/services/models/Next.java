package com.sidorchukandrew.pcoapi.apis.services.models;

public class Next {
    private int offset;

    private Next() { }

    private Next(Builder builder) {
        offset = builder.offset;
    }

    public static class Builder {
        private int offset;

        public Builder offset(int offset) {
            this.offset = offset;
            return this;
        }

        public Next build() {
            return new Next(this);
        }
    }

    public int getOffset() {
        return offset;
    }

    @Override
    public String toString() {
        return "Next{" +
                "offset=" + offset +
                '}';
    }
}
