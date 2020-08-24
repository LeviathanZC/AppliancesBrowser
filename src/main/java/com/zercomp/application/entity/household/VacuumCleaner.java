package com.zercomp.application.entity.household;

import com.zercomp.application.entity.HouseholdAppliance;
import com.zercomp.application.entity.Size;

public class VacuumCleaner extends HouseholdAppliance {

    private FilterType filterType;
    private BagType bagType;

    public VacuumCleaner(int powerConsumption, FilterType filterType, BagType bagType, double overallCapacity, Size size) {
        super(VacuumCleaner.class.getSimpleName(), powerConsumption);
        this.filterType = filterType;
        this.bagType = bagType;
    }

}
