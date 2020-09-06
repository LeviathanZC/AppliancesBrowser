package com.zercomp.application.service.factory;

import com.zercomp.application.entity.AbstractAppliance;
import com.zercomp.application.entity.ComputerAppliance;

import java.util.Map;

public abstract class ComputerFactory implements AbstractFactory {

    @Override
    public AbstractAppliance create(Map<String, String> applianceInfo) {
        return createComputerAppliance(applianceInfo);
    }

    protected abstract ComputerAppliance createComputerAppliance(Map<String, String> applianceInfo);
}
