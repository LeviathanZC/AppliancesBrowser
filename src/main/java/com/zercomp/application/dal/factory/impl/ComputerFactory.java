package com.zercomp.application.dal.factory.impl;

import com.zercomp.application.dal.factory.AbstractFactory;
import com.zercomp.application.dal.factory.validator.InfoValidator;
import com.zercomp.application.entity.AbstractAppliance;
import com.zercomp.application.entity.ComputerAppliance;
import com.zercomp.application.entity.criteria.ApplianceName;

import java.util.Map;

public class ComputerFactory implements AbstractFactory {

    private static AbstractFactory instance = new ComputerFactory();

    private ComputerFactory() {
    }

    public static AbstractFactory getInstance() {
        return instance;
    }

    private static final String laptopName = ApplianceName.LAPTOP.getName();
    private static final String tabletPCName = ApplianceName.TABLET_PC.getName();

    @Override
    public AbstractAppliance create(Map<String, Object> applianceInfo) {
        ApplianceName that = ApplianceName.valueOf((String) applianceInfo.get("name"));

        return null;
    }

    private ComputerAppliance createLaptop(Map<String, Object> laptopInfo) {
        System.out.println(laptopInfo);
        return null;
    }
}
