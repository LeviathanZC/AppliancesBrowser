package com.zercomp.application.entity;

public abstract class HouseholdAppliance extends AbstractAppliance {

    private int power_consumption;

    public HouseholdAppliance() {
        this(0);
    }

    public HouseholdAppliance(int power_consumption) {
        this(HouseholdAppliance.class.getSimpleName(), power_consumption);
    }

    public HouseholdAppliance(String name, int power_consumption) {
        super(name);
        this.power_consumption = power_consumption;
    }

    public int getPower_consumption() {
        return power_consumption;
    }

    public void setPower_consumption(int power_consumption) {
        this.power_consumption = power_consumption;
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

        return getPower_consumption() == other.getPower_consumption();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + getPower_consumption();
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("HouseholdAppliance {");
        sb.append("name: ").append(this.getName());
        sb.append("power_consumption: ").append(this.power_consumption);
        sb.append("\n}");
        return sb.toString();
    }
}