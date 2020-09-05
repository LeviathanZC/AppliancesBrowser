package com.zercomp.application.entity.criteria.paramType;

import com.zercomp.application.entity.criteria.Parameter;

public enum RefrigeratorParam implements Parameter {

    POWER_CONSUMPTION("POWER_CONSUMPTION"),
    WEIGHT("WEIGHT"),
    FREEZER_CAPACITY("FREEZER_CAPACITY"),
    OVERALL_CAPACITY("OVERALL_CAPACITY"),
    HEIGHT("HEIGHT"),
    WIDTH("WIDTH");


    private String name;

    RefrigeratorParam(String param) {
        this.name = param;
    }

    public String getName() {
        return name;
    }
}
