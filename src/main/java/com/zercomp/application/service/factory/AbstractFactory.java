package com.zercomp.application.service.factory;

import com.zercomp.application.entity.AbstractAppliance;
import com.zercomp.application.entity.criteria.Parameter;

import java.util.Map;

public interface AbstractFactory {

    AbstractAppliance create(Map<String, String> applianceInfo);

    static String getParameter(Map<String, String> info, Parameter parameter) {
        return info.get(parameter.getName());
    }
}
