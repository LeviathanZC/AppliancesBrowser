package com.zercomp.application.service.factory.impl;

import com.zercomp.application.service.factory.AbstractFactory;
import com.zercomp.application.service.factory.ComputerFactory;
import com.zercomp.application.entity.ComputerAppliance;
import com.zercomp.application.entity.computer.TabletPC;
import com.zercomp.application.entity.computer.config.DeviceColor;

import com.zercomp.application.entity.criteria.paramType.TabletPCParam;

import java.util.Map;

public class TabletPCFactory extends ComputerFactory {
    private static TabletPCFactory INSTANCE;

    private TabletPCFactory() {
    }

    public static ComputerFactory getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new TabletPCFactory();
        }
        return INSTANCE;
    }

    @Override
    public ComputerAppliance createComputerAppliance(Map<String, String> applianceInfo) {
        double batteryCapacity = Double.parseDouble(AbstractFactory.getParameter(applianceInfo, TabletPCParam.BATTERY_CAPACITY));
        int memoryROM = Integer.parseInt(AbstractFactory.getParameter(applianceInfo, TabletPCParam.MEMORY_ROM));
        int display_inches = Integer.parseInt(AbstractFactory.getParameter(applianceInfo, TabletPCParam.DISPLAY_INCHES));
        int flashMemoryCapacity = Integer.parseInt(AbstractFactory.getParameter(applianceInfo, TabletPCParam.FLASH_MEMORY_CAPACITY));
        DeviceColor color = DeviceColor.valueOf(AbstractFactory.getParameter(applianceInfo, TabletPCParam.COLOR));
        return new TabletPC(batteryCapacity, memoryROM, display_inches, flashMemoryCapacity, color);
    }
}
