package com.zercomp.application.dal.factory.validator;

import com.zercomp.application.entity.criteria.ApplianceName;

public class InfoValidator {



    public static boolean isThatAppliance(ApplianceName name, String that) {
        return name.getName().equals(that);
    }

}
