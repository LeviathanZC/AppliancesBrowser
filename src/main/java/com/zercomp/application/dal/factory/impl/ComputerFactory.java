package com.zercomp.application.dal.factory.impl;

import com.zercomp.application.dal.factory.AbstractFactory;
import com.zercomp.application.entity.AbstractAppliance;

import java.util.List;

public class ComputerFactory implements AbstractFactory {

    private static AbstractFactory instance = new ComputerFactory();

    private ComputerFactory() {
    }

    public static AbstractFactory getInstance() {
        return instance;
    }

    @Override
    public AbstractAppliance create(List<String> appliance) {

        return null;
    }
}
