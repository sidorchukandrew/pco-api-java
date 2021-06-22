package com.sidorchukandrew.pcoapi.models;

public class Song extends Resource {
    private SongData data;
    private Meta meta;

    private Song() { }

    private Song(Builder builder) {
        data = builder.data;
        meta = builder.meta;
    }

    public static class Builder {
        private SongData data;
        private Meta meta;

        public Builder data(SongData data) {
            this.data = data;
            return this;
        }

        public Builder id(Meta meta) {
            this.meta = meta;
            return this;
        }



        public Song build() {
            return new Song(this);
        }
    }

    public SongData getData() {
        return data;
    }

    public Meta getMeta() {
        return meta;
    }

    @Override
    public String toString() {
        return "Song{" +
                "data=" + data +
                ", meta=" + meta +
                '}';
    }
}
