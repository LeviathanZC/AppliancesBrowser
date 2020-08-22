package com.zercomp.application.entity;

public class HouseholdAppliance extends AbstractAppliance {

    private int power_consumption;

    public HouseholdAppliance() {
        super(HouseholdAppliance.class.getSimpleName());
    }

    public static void main(String[] args) {
        HouseholdAppliance app = new HouseholdAppliance();
        System.out.println(app.getName());
    }

}
