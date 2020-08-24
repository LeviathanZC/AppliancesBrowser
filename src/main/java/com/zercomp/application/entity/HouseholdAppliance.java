package com.zercomp.application.entity;

public abstract class HouseholdAppliance extends AbstractAppliance {

    private int powerСonsumption;

    public HouseholdAppliance() {
        this(0);
    }

    public HouseholdAppliance(int powerСonsumption) {
        this(HouseholdAppliance.class.getSimpleName(), powerСonsumption);
    }

    public HouseholdAppliance(String name, int powerСonsumption) {
        super(name);
        this.powerСonsumption = powerСonsumption;
    }

    public int getPowerСonsumption() {
        return powerСonsumption;
    }

    public void setPowerСonsumption(int powerСonsumption) {
        this.powerСonsumption = powerСonsumption;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }

        HouseholdAppliance other = (HouseholdAppliance) o;

        return getPowerСonsumption() == other.getPowerСonsumption();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + getPowerСonsumption();
        return result;
    }

    @Override
    public String toString() {
        String delimeter = "\n\t";
        final StringBuilder sb = new StringBuilder("HouseholdAppliance {");
        sb.append(delimeter).append("name: ").append(this.getName());
        sb.append(delimeter).append("power_consumption: ").append(this.powerСonsumption);
        sb.append("\n}");
        return sb.toString();
    }
}