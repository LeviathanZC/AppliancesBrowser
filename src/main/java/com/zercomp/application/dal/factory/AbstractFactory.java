package com.zercomp.application.dal.factory;

import com.zercomp.application.entity.AbstractAppliance;

import java.util.List;

public interface AbstractFactory {

    AbstractAppliance create(List<String> appliance);

}
