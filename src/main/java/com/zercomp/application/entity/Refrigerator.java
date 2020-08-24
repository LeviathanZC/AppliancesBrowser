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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) return false;

        Refrigerator other = (Refrigerator) o;

        if (getFreezerCapacity() != other.getFreezerCapacity()) return false;
        if (Double.compare(other.getOverallCapacity(), getOverallCapacity()) != 0) return false;
        return getSize().equals(other.getSize());
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        long temp;
        result = prime * result + getFreezerCapacity();
        temp = Double.doubleToLongBits(getOverallCapacity());
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + getSize().hashCode();
        return result;
    }
}
