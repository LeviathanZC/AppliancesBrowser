package com.zercomp.application.service.factory.impl;

import com.zercomp.application.service.factory.AbstractFactory;
import com.zercomp.application.service.factory.HouseholdFactory;
import com.zercomp.application.entity.HouseholdAppliance;
import com.zercomp.application.entity.criteria.paramType.OvenParam;
import com.zercomp.application.entity.household.Oven;
import com.zercomp.application.entity.household.Size;

import java.util.Map;

public class OvenFactory extends HouseholdFactory {

    private static OvenFactory INSTANCE;

    private OvenFactory() {
    }

    public static HouseholdFactory getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new OvenFactory();
        }
        return INSTANCE;
    }

    @Override
    public HouseholdAppliance createHouseholdAppliance(Map<String, String> applianceInfo) {
        int powerConsumption = Integer.parseInt(AbstractFactory.getParameter(applianceInfo, OvenParam.POWER_CONSUMPTION));
        int weight = Integer.parseInt(AbstractFactory.getParameter(applianceInfo, OvenParam.WEIGHT));
        int capacity = Integer.parseInt(AbstractFactory.getParameter(applianceInfo, OvenParam.CAPACITY));
        double depth = Double.parseDouble(AbstractFactory.getParameter(applianceInfo, OvenParam.DEPTH));;
        double width = Double.parseDouble(AbstractFactory.getParameter(applianceInfo, OvenParam.WIDTH));;
        double height = Double.parseDouble(AbstractFactory.getParameter(applianceInfo, OvenParam.HEIGHT));;
        return new Oven(powerConsumption, weight, capacity, depth, new Size(width, height));
    }

}
