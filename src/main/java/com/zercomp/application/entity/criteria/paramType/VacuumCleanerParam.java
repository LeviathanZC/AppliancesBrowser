package com.zercomp.application.entity.criteria.paramType;

import com.zercomp.application.entity.criteria.Parameter;

public enum VacuumCleanerParam implements Parameter {

    POWER_CONSUMPTION("POWER_CONSUMPTION"),
    FILTER_TYPE("FILTER_TYPE"),
    BAG_TYPE("BAG_TYPE"),
    WAND_TYPE("WAND_TYPE"),
    MOTOR_SPEED_REGULATION("MOTOR_SPEED_REGULATION"),
    CLEANING_WIDTH("CLEANING_WIDTH");


    private String name;

    VacuumCleanerParam(String param) {
        this.name = param;
    }

    public String getName() {
        return name;
    }
}
