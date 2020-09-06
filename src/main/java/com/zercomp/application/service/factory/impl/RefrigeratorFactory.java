package com.zercomp.application.service.factory.impl;

import com.zercomp.application.service.factory.AbstractFactory;
import com.zercomp.application.service.factory.HouseholdFactory;
import com.zercomp.application.entity.HouseholdAppliance;
import com.zercomp.application.entity.criteria.paramType.RefrigeratorParam;
import com.zercomp.application.entity.household.Refrigerator;
import com.zercomp.application.entity.household.Size;

import java.util.Map;

public class RefrigeratorFactory extends HouseholdFactory {

    private static RefrigeratorFactory INSTANCE;

    private RefrigeratorFactory() {
    }

    public static HouseholdFactory getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new RefrigeratorFactory();
        }
        return INSTANCE;
    }

    @Override
    public HouseholdAppliance createHouseholdAppliance(Map<String, String> applianceInfo) {
        int powerConsumption = Integer.parseInt(AbstractFactory.getParameter(applianceInfo, RefrigeratorParam.POWER_CONSUMPTION));
        int weight = Integer.parseInt(AbstractFactory.getParameter(applianceInfo, RefrigeratorParam.WEIGHT));
        int freezerCapacity = Integer.parseInt(AbstractFactory.getParameter(applianceInfo, RefrigeratorParam.FREEZER_CAPACITY));
        double overallCapacity = Double.parseDouble(AbstractFactory.getParameter(applianceInfo, RefrigeratorParam.OVERALL_CAPACITY));;
        double width = Double.parseDouble(AbstractFactory.getParameter(applianceInfo, RefrigeratorParam.WIDTH));;
        double height = Double.parseDouble(AbstractFactory.getParameter(applianceInfo, RefrigeratorParam.HEIGHT));;
        return new Refrigerator(powerConsumption, weight, freezerCapacity, overallCapacity, new Size(width, height));
    }
}
