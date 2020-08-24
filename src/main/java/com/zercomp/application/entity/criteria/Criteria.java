package com.zercomp.application.entity.criteria;

public enum Criteria {

    POWER_CONSUMPTION("POWER_CONSUMPTION"),
    BATTERY_CAPACITY("BATTERY_CAPACITY"),
    WEIGHT("WEIGHT"),
    WIDTH("WIDTH"),
    HEIGHT("HEIGHT"),
    DEPTH("DEPTH"),
    OS("OS"),
    CAPACITY("CAPACITY"),
    MERMORY_ROM("MERMORY_ROM"),
    SYSTEM_MEMORY("SYSTEM_MEMORY"),
    CPU("CPU"),
    DISPLAY_INCHES("DISPLAY_INCHES"),
    FREEZER_CAPACITY("FREEZER_CAPACITY"),
    OVERALL_CAPACITY("OVERALL_CAPACITY"),
    FILTER_TYPE("FILTER_TYPE"),
    BAG_TYPE("BAG_TYPE"),
    WAND_TYPE("WAND_TYPE"),
    MOTOR_SPEED_REGULATION("MOTOR_SPEED_REGULATION"),
    CLEANING_WIDTH("CLEANING_WIDTH"),
    FLASH_MEMORY_CAPACITY("FLASH_MEMORY_CAPACITY"),
    COLOR("COLOR"),
    NUMBER_OF_SPEAKERS("NUMBER_OF_SPEAKERS"),
    FREQUENCY_RANGE("FREQUENCY_RANGE"),
    CORD_LENGTH("CORD_LENGTH");


    private final String criteriaName;

    private Criteria(String name) {
        this.criteriaName = name;
    }

    public String getCriteriaName() {
        return this.criteriaName;
    }

}
