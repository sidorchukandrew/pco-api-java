package com.sidorchukandrew.pcoapi.apis.services.queryby;

import com.sidorchukandrew.pcoapi.utils.RequestUtils;

public enum SongQueryableParam implements RequestParam {
    ARRANGEMENT_NAME("arrangement_name"),
    ARRANGEMENT_REHEARSAL_MIX_ID("arrangement_rehearsal_mix_id"),
    ARRANGEMENT_TAG_GROUP_IDS("arrangement_tag_group_ids"),
    ARRANGMENT_TAG_IDS("arrangement_tag_ids"),
    AUTHOR("author"),
    BPM_MAX("bpm_max"),
    BPM_MIN("bpm_min"),
    CCLI_NUMBER("ccli_number"),
    ENDING_KEY("ending_key"),
    ENDING_KEY_MINOR("ending_key_minor"),
    FOLDER_ID("folder_id"),
    HIDDEN("hidden"),
    KEY_NAME("key_name"),
    LYRICS("lyrics"),
    METER("meter"),
    SERVICE_TYPE_ID("service_type_id"),
    SONG_TAG_GROUP_IDS("song_tag_group_ids"),
    SONG_TAG_IDS("song_tag_ids"),
    STARTING_KEY("starting_key"),
    STARTING_KEY_MINOR("starting_minor_key"),
    THEMES("themes"),
    TITLE("title");

    private final String label;

    private SongQueryableParam(String label) {
        this.label = RequestUtils.toQueryParam(label);
    }

    @Override
    public String getLabel() {
        return label;
    }
}
