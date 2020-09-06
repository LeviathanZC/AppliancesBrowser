package com.zercomp.application.service.factory.impl;

import com.zercomp.application.service.factory.AbstractFactory;
import com.zercomp.application.service.factory.HouseholdFactory;
import com.zercomp.application.entity.HouseholdAppliance;
import com.zercomp.application.entity.criteria.paramType.OvenParam;
import com.zercomp.application.entity.criteria.paramType.VacuumCleanerParam;
import com.zercomp.application.entity.household.VacuumCleaner;
import com.zercomp.application.entity.household.config.BagType;
import com.zercomp.application.entity.household.config.FilterType;
import com.zercomp.application.entity.household.config.WandType;

import java.util.Map;

public class VacuumCleanerFactory extends HouseholdFactory {
    private static VacuumCleanerFactory INSTANCE;

    private VacuumCleanerFactory() {
    }

    public static HouseholdFactory getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new VacuumCleanerFactory();
        }
        return INSTANCE;
    }

    @Override
    public HouseholdAppliance createHouseholdAppliance(Map<String, String> applianceInfo) {
        int powerConsumption = Integer.parseInt(AbstractFactory.getParameter(applianceInfo, VacuumCleanerParam.POWER_CONSUMPTION));
        FilterType filter = FilterType.valueOf(AbstractFactory.getParameter(applianceInfo, VacuumCleanerParam.FILTER_TYPE));
        BagType bag = BagType.valueOf(AbstractFactory.getParameter(applianceInfo, VacuumCleanerParam.BAG_TYPE));
        WandType wand = WandType.valueOf(AbstractFactory.getParameter(applianceInfo, VacuumCleanerParam.WAND_TYPE));
        int motorSpeedRegulation = Integer.parseInt(AbstractFactory.getParameter(applianceInfo, OvenParam.WEIGHT));
        int cleaningWidth = Integer.parseInt(AbstractFactory.getParameter(applianceInfo, OvenParam.CAPACITY));
        return new VacuumCleaner(powerConsumption, filter, bag, wand, motorSpeedRegulation, cleaningWidth);
    }
}
