package com.zercomp.application.entity.criteria.paramType;

import com.zercomp.application.entity.criteria.Parameter;

public enum SpeakersParam implements Parameter {

    POWER_CONSUMPTION("POWER_CONSUMPTION"),
    NUMBER_OF_SPEAKERS("NUMBER_OF_SPEAKERS"),
    FREQUENCY_RANGE("FREQUENCY_RANGE"),
    CORD_LENGTH("CORD_LENGTH");


    private String name;

    SpeakersParam(String param) {
        this.name = param;
    }

    public String getName() {
        return name;
    }
}
