package com.zercomp.application.service.factory.definer;

import com.zercomp.application.service.factory.AbstractFactory;
import com.zercomp.application.service.factory.FactoryException;
import com.zercomp.application.service.factory.impl.*;
import com.zercomp.application.entity.criteria.paramType.ApplianceName;

public class FactoryDefiner {

    private static FactoryDefiner definer;

    private FactoryDefiner() {
    }

    public static FactoryDefiner getDefiner() {
        if (definer == null) {
            definer = new FactoryDefiner();
        }
        return definer;
    }

    public AbstractFactory define(String groupName) throws FactoryException {
        ApplianceName name = ApplianceName.valueOf(groupName.toUpperCase());
        switch (name) {
            case OVEN: {
                return OvenFactory.getInstance();
            }
            case LAPTOP: {
                return LaptopFactory.getInstance();
            }
            case REFRIGERATOR: {
                return RefrigeratorFactory.getInstance();
            }
            case VACUUM_CLEANER: {
                return VacuumCleanerFactory.getInstance();
            }
            case TABLET_PC: {
                return TabletPCFactory.getInstance();
            }
            case SPEAKERS: {
                return SpeakersFactory.getInstance();
            }
            default: {
                throw new FactoryException("Undefined type of request appliance :" + name);
            }
        }
    }
}
