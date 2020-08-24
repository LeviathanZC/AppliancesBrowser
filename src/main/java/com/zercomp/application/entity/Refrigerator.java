package com.zercomp.application.entity;

public class Refrigerator extends HouseholdAppliance {

    private int freezerCapacity;
    private double overallCapacity;
    private Size size;

    public Refrigerator(int powerConsumption, int freezerCapacity, double overallCapacity, double width, double height) {
        this(powerConsumption, freezerCapacity, overallCapacity, new Size(width, height));
    }

    public Refrigerator(int powerConsumption, int freezerCapacity, double overallCapacity, Size size) {
        super(Refrigerator.class.getSimpleName(), powerConsumption);
        this.freezerCapacity = freezerCapacity;
        this.overallCapacity = overallCapacity;
        this.size = size;
    }

    public int getFreezerCapacity() {
        return freezerCapacity;
    }

    public void setFreezerCapacity(int freezerCapacity) {
        this.freezerCapacity = freezerCapacity;
    }

    public double getOverallCapacity() {
        return overallCapacity;
    }

    public void setOverallCapacity(double overallCapacity) {
        this.overallCapacity = overallCapacity;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public void setSize(double width, double height) {
        this.size = new Size(width, height);
    }
}
