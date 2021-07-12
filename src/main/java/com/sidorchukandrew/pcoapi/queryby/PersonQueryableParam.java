package com.sidorchukandrew.pcoapi.queryby;

import com.sidorchukandrew.pcoapi.utils.RequestUtils;

public enum PersonQueryableParam implements RequestParam {
    ANY_POSITION_IN_SERVICE("any_position_in_service"),
    ASSIGNED_TO_REHEARSAL_TEAM("assigned_to_rehearsal_team"),
    FOLDER_ID("folder_id"),
    HIDDEN("hidden"),
    LEGACY_ID("legacy_id"),
    MINIMUM_PERMISSIONS("minimum_permissions"),
    NAME_LIKE("name_like"),
    SERVICE_TYPE_ID("service_type_id"),
    TAG_GROUP_IDS("tag_group_ids"),
    TAG_IDS("tag_ids"),
    TEAM_IDS("team_ids"),
    TEAM_LEADER("team_leader"),
    TEAM_LEADER_TEAM_IDS("team_leader_team_ids"),
    TEAM_POSITIONS_IDS("team_position_ids");

    private final String label;

    private PersonQueryableParam(String label) {
        this.label = RequestUtils.toQueryParam(label);
    }

    @Override
    public String getLabel() {
        return label;
    }
}
