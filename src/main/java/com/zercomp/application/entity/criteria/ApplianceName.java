package com.zercomp.application.entity.criteria;

public enum ApplianceName {

    OVEN("Oven"),
    LAPTOP("Laptop"),
    TABLET_PC("TabletPC"),
    REFRIGERATOR("Refrigerator"),
    VACUUM_CLEANER("VacuumCleaner"),
    SPEAKERS("Speakers");

    private String name;

    ApplianceName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

}
