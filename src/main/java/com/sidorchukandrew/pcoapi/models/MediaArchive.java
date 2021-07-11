package com.sidorchukandrew.pcoapi.models;

public class MediaArchive {
    private MediaArchiveData data;

    private MediaArchive() { }

    public MediaArchive(MediaArchiveData data) {
        this.data = data;
    }

    public MediaArchiveData getData() {
        return data;
    }

    @Override
    public String toString() {
        return "MediaArchive{" +
                "data=" + data +
                '}';
    }
}
