package com.sidorchukandrew.pcoapi.apis.services.models;

public class Prev {
    private Integer offset;

    private Prev() { }

    public Prev(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
    }

    @Override
    public String toString() {
        return "Prev{" +
                "offset=" + offset +
                '}';
    }
}
