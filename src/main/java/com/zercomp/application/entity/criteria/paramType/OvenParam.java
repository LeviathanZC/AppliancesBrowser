package com.zercomp.application.entity.criteria.paramType;

import com.zercomp.application.entity.criteria.Parameter;

public enum OvenParam implements Parameter {

    POWER_CONSUMPTION("POWER_CONSUMPTION"),
    OS("OS"),
    CAPACITY("CAPACITY"),
    DEPTH("DEPTH"),
    HEIGHT("HEIGHT"),
    WIDTH("WIDTH");


    private String name;

    OvenParam(String param) {
        this.name = param;
    }

    public String getName() {
        return name;
    }
}
