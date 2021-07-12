package com.sidorchukandrew.pcoapi.include;

import com.sidorchukandrew.pcoapi.queryby.RequestParam;

public enum SignupSheetIncludableResource implements RequestParam {
    SCHEDULED_PEOPLE("scheduled_people"),
    SIGNUP_SHEET_METADATA("signup_sheet_metadata");

    private final String label;

    private SignupSheetIncludableResource(String label) {
        this.label = label;
    }

    @Override
    public String getLabel() {
        return label;
    }
}
