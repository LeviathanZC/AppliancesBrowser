package com.zercomp.application.service.factory.impl;

import com.zercomp.application.service.factory.AbstractFactory;
import com.zercomp.application.service.factory.ComputerFactory;
import com.zercomp.application.entity.ComputerAppliance;
import com.zercomp.application.entity.computer.Laptop;
import com.zercomp.application.entity.computer.config.OSType;
import com.zercomp.application.entity.criteria.paramType.LaptopParam;

import java.util.Map;

public class LaptopFactory extends ComputerFactory {

    private static LaptopFactory INSTANCE;

    private LaptopFactory() {
    }

    public static ComputerFactory getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new LaptopFactory();
        }
        return INSTANCE;
    }

    @Override
    public ComputerAppliance createComputerAppliance(Map<String, String> applianceInfo) {
        double batteryCapacity = Double.parseDouble(AbstractFactory.getParameter(applianceInfo, LaptopParam.BATTERY_CAPACITY));
        OSType osType = OSType.valueOf(AbstractFactory.getParameter(applianceInfo, LaptopParam.OS_TYPE));
        int memoryROM = Integer.parseInt(AbstractFactory.getParameter(applianceInfo, LaptopParam.MEMORY_ROM));
        int systemMemory = Integer.parseInt(AbstractFactory.getParameter(applianceInfo, LaptopParam.SYSTEM_MEMORY));
        double cpu = Double.parseDouble(AbstractFactory.getParameter(applianceInfo, LaptopParam.CPU));
        int display_inches = Integer.parseInt(AbstractFactory.getParameter(applianceInfo, LaptopParam.DISPLAY_INCHES));
        return new Laptop(batteryCapacity, osType, memoryROM, systemMemory, cpu, display_inches);
    }


}
