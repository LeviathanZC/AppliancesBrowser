package com.zercomp.application.entity.household;

import com.zercomp.application.entity.HouseholdAppliance;
import com.zercomp.application.entity.Size;

public class VacuumCleaner extends HouseholdAppliance {

    private FilterType filterType;

    public VacuumCleaner(int powerConsumption, FilterType filterType, int freezerCapacity, double overallCapacity, Size size) {
        super(VacuumCleaner.class.getSimpleName(), powerConsumption);
        this.filterType = filterType;

    }

}
