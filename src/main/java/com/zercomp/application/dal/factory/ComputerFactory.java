package com.zercomp.application.dal.factory;

import com.zercomp.application.dal.factory.AbstractFactory;
import com.zercomp.application.entity.AbstractAppliance;
import com.zercomp.application.entity.ComputerAppliance;
import com.zercomp.application.entity.criteria.paramType.ApplianceName;

import java.util.Map;

public abstract class ComputerFactory implements AbstractFactory {

    @Override
    public AbstractAppliance create(Map<String, Object> applianceInfo) {
        return createComputerAppliance(applianceInfo);
    }

    public abstract ComputerAppliance createComputerAppliance(Map<String, Object> applianceInfo);
}
