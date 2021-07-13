package com.sidorchukandrew.pcoapi.apis.services.filterby;

import com.sidorchukandrew.pcoapi.apis.services.queryby.RequestParam;

public enum MediaFilterableParam implements RequestParam {
    ARCHIVED("archived"),
    NOT_ARCHIVED("not_archived"),
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

    private MediaFilterableParam(String label) {
        this.label = label;
    }

    @Override
    public String getLabel() {
        return label;
    }
}
