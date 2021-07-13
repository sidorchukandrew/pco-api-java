package com.sidorchukandrew.pcoapi.apis.services.include;

import com.sidorchukandrew.pcoapi.apis.services.queryby.RequestParam;

public enum AvailableSignupIncludableResource implements RequestParam {
    SIGNUP_SHEETS("signup_sheets");

    private final String label;

    private AvailableSignupIncludableResource(String label) {
        this.label = label;
    }

    @Override
    public String getLabel() {
        return label;
    }
}
