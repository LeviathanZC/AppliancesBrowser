package com.zercomp.application.entity.criteria;

import com.sun.javaws.exceptions.InvalidArgumentException;
import com.zercomp.application.entity.criteria.paramType.*;

public class ParamDefiner {

    public Parameter define(ApplianceName name, String paramName) throws Exception {
        switch (name) {
            case OVEN: {
                return OvenParam.valueOf(paramName);
            }
            case LAPTOP: {
                return LaptopParam.valueOf(paramName);
            }
            case TABLETPC: {
                return TabletPCParam.valueOf(paramName);
            }
            case VACUUMCLEANER: {
                return VacuumCleanerParam.valueOf(paramName);
            }
            case SPEAKERS: {
                return SpeakersParam.valueOf(paramName);
            }
            case REFRIGERATOR: {
                return RefrigeratorParam.valueOf(paramName);
            }
            default: {
                throw new Exception("Programmist invalid, blyat");
            }
        }
    }

}
