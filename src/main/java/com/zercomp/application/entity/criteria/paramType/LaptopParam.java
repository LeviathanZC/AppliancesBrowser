package com.zercomp.application.entity.criteria.paramType;

import com.zercomp.application.entity.criteria.Parameter;

public enum LaptopParam implements Parameter {

    BATTERY_CAPACITY("BATTERY_CAPACITY"),
    WEIGHT("WEIGHT"),
    MEMORY_ROM("MEMORY_ROM"),
    SYSTEM_MEMORY("SYSTEM_MEMORY"),
    CPU("CPU"),
    DISPLAY_INCHES("DISPLAY_INCHES");


    private String name;

    LaptopParam(String param) {
        this.name = param;
    }

    public String getName() {
        return name;
    }
}
