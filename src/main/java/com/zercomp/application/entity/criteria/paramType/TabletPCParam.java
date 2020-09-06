package com.zercomp.application.entity.criteria.paramType;

import com.zercomp.application.entity.criteria.Parameter;

public enum TabletPCParam implements Parameter {
    BATTERY_CAPACITY("BATTERY_CAPACITY"),
    DISPLAY_INCHES("DISPLAY_INCHES"),
    MEMORY_ROM("MEMORY_ROM"),
    FLASH_MEMORY_CAPACITY("FLASH_MEMORY_CAPACITY"),
    COLOR("COLOR");


    private String name;

    TabletPCParam(String param) {
        this.name = param;
    }

    public String getName() {
        return name;
    }
}
