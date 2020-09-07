package com.zercomp.application.entity.criteria.paramType;

import com.zercomp.application.entity.criteria.Parameter;

public enum ApplianceName implements Parameter {

    OVEN("Oven"),
    LAPTOP("Laptop"),
    TABLETPC("TabletPC"),
    REFRIGERATOR("Refrigerator"),
    VACUUMCLEANER("VacuumCleaner"),
    SPEAKERS("Speakers");

    private String name;

    ApplianceName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

}
