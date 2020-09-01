package com.zercomp.application.dal.factory;

import com.zercomp.application.entity.AbstractAppliance;

import java.util.Map;

public interface AbstractFactory {

    AbstractAppliance create(Map<String, Object> applianceInfo);

}
