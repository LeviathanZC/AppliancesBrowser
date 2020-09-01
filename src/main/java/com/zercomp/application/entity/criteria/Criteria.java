package com.zercomp.application.entity.criteria;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public enum Criteria {

    POWER_CONSUMPTION("POWER_CONSUMPTION"),
    BATTERY_CAPACITY("BATTERY_CAPACITY"),
    WEIGHT("WEIGHT"),
    WIDTH("WIDTH"),
    HEIGHT("HEIGHT"),
    DEPTH("DEPTH"),
    OS("OS"),
    CAPACITY("CAPACITY"),
    MEMORY_ROM("MEMORY_ROM"),
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
    private Map<String, Object> criteria = new HashMap<String, Object>();

    private Criteria(String name) {
        this.criteriaName = name;
    }

    public String getCriteriaName() {
        return this.criteriaName;
    }

    public void add(String searchCriteria, Object value) {
        criteria.put(searchCriteria, value);
    }

    public Map<String, Object> getCriteria() {
        return Collections.unmodifiableMap(criteria);
    }

}
