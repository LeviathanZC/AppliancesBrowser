package com.zercomp.application.service.factory;

import com.zercomp.application.entity.AbstractAppliance;
import com.zercomp.application.entity.HouseholdAppliance;

import java.util.Map;

public abstract class HouseholdFactory implements AbstractFactory {

    @Override
    public AbstractAppliance create(Map<String, String> applianceInfo) {
        return createHouseholdAppliance(applianceInfo);
    }

    public abstract HouseholdAppliance createHouseholdAppliance(Map<String, String> applianceInfo);

}
