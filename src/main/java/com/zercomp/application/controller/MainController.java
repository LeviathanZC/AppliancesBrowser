package com.zercomp.application.controller;

import com.zercomp.application.dal.factory.AbstractFactory;
import com.zercomp.application.dal.factory.impl.ComputerFactory;
import com.zercomp.application.entity.AbstractAppliance;
import com.zercomp.application.entity.criteria.ApplianceName;
import com.zercomp.application.entity.household.*;

import java.util.HashMap;
import java.util.Map;

public class MainController {

    public static void main(String[] args) {
        Map<String, Object> info = new HashMap<>();
        info.put("name", "LAPTOP");
        AbstractFactory factory = ComputerFactory.getInstance();
        factory.create(info);
        //System.out.println(ApplianceName.LAPTOP.getName() );

    }

}
