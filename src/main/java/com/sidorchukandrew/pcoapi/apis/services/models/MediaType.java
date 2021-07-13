package com.sidorchukandrew.pcoapi.apis.services.models;

import com.sidorchukandrew.pcoapi.apis.services.queryby.RequestParam;

public enum MediaType implements RequestParam {

    AUDIO("audio"),
    BACKGROUND_AUDIO("background_audio"),
    BACKGROUND_IMAGE("background_image"),
    BACKGROUND_VIDEO("background_video"),
    COUNTDOWN("countdown"),
    DOCUMENT("document"),
    DRAMA("drama"),
    IMAGE("image"),
    POWERPOINT("powerpoint"),
    SONG_VIDEO("song_video"),
    VIDEO("video");

    private final String label;

    private MediaType(String label) {
        this.label = label;
    }


    @Override
    public String getLabel() {
        return label;
    }
}
