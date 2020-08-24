package com.zercomp.application.entity.household;

import com.zercomp.application.entity.HouseholdAppliance;
import com.zercomp.application.entity.Size;

public class VacuumCleaner extends HouseholdAppliance {

    private FilterType filterType;
    private BagType bagType;
    private WandType wandType;
    private int motorSpeedRegulation;
    private int cleaningWidth;

    public VacuumCleaner(int powerConsumption,
                         FilterType filterType,
                         BagType bagType,
                         WandType wandType,
                         int motorSpeedRegulation,
                         int cleaningWidth) {
        super(VacuumCleaner.class.getSimpleName(), powerConsumption);
        this.filterType = filterType;
        this.bagType = bagType;
        this.wandType = wandType;
        this.motorSpeedRegulation = motorSpeedRegulation;
        this.cleaningWidth = cleaningWidth;
    }

    public FilterType getFilterType() {
        return filterType;
    }

    public void setFilterType(FilterType filterType) {
        this.filterType = filterType;
    }

    public BagType getBagType() {
        return bagType;
    }

    public void setBagType(BagType bagType) {
        this.bagType = bagType;
    }

    public WandType getWandType() {
        return wandType;
    }

    public void setWandType(WandType wandType) {
        this.wandType = wandType;
    }

    public int getMotorSpeedRegulation() {
        return motorSpeedRegulation;
    }

    public void setMotorSpeedRegulation(int motorSpeedRegulation) {
        this.motorSpeedRegulation = motorSpeedRegulation;
    }

    public int getCleaningWidth() {
        return cleaningWidth;
    }

    public void setCleaningWidth(int cleaningWidth) {
        this.cleaningWidth = cleaningWidth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }

        VacuumCleaner other = (VacuumCleaner) o;

        if (getMotorSpeedRegulation() != other.getMotorSpeedRegulation()) return false;
        if (getCleaningWidth() != other.getCleaningWidth()) return false;
        if (getFilterType() != other.getFilterType()) return false;
        if (getBagType() != other.getBagType()) return false;
        return getWandType() == other.getWandType();
    }

    @Override
    public int hashCode() {
        final int prime = 113;
        int result = super.hashCode();
        result = prime * result + getFilterType().hashCode();
        result = prime * result + getBagType().hashCode();
        result = prime * result + getWandType().hashCode();
        result = prime * result + getMotorSpeedRegulation();
        result = prime * result + getCleaningWidth();
        return result;
    }

    @Override
    public String toString() {
        String delimeter = "\n\t";
        final StringBuilder sb = new StringBuilder("VacuumCleaner {");
        sb.append(delimeter).append("power_consumption: ").append(super.getPowerСonsumption());
        sb.append(delimeter).append("filter_type: ").append(this.getFilterType());
        sb.append(delimeter).append("bag_type: ").append(this.getBagType());
        sb.append(delimeter).append("wand_type: ").append(this.getWandType());
        sb.append(delimeter).append("motor_speed_regulation: ").append(this.getMotorSpeedRegulation());
        sb.append(delimeter).append("cleaning_width: ").append(this.getCleaningWidth());
        return sb.append("\n}").toString();
    }
}
