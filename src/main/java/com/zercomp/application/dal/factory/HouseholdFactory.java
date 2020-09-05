package com.zercomp.application.dal.factory;

import com.zercomp.application.dal.factory.AbstractFactory;
import com.zercomp.application.entity.AbstractAppliance;
import com.zercomp.application.entity.HouseholdAppliance;

import java.util.Map;

public abstract class HouseholdFactory implements AbstractFactory {

    @Override
    public AbstractAppliance create(Map<String, Object> applianceInfo) {
        return createHouseholdAppliance(applianceInfo);
    }

    public abstract HouseholdAppliance createHouseholdAppliance(Map<String, Object> applianceInfo);

}
