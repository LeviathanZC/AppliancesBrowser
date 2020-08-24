package com.zercomp.application.entity.household;

import com.zercomp.application.entity.HouseholdAppliance;
import com.zercomp.application.entity.Size;

public class Refrigerator extends HouseholdAppliance {

    private int freezerCapacity;
    private int weight;
    private double overallCapacity;
    private Size size;

    public Refrigerator(int powerConsumption, int weight, int freezerCapacity, double overallCapacity,
                        double width, double height) {
        this(powerConsumption, weight, freezerCapacity, overallCapacity, new Size(width, height));
    }

    public Refrigerator(int powerConsumption, int weight, int freezerCapacity, double overallCapacity, Size size) {
        super(Refrigerator.class.getSimpleName(), powerConsumption);
        this.freezerCapacity = freezerCapacity;
        this.weight = weight;
        this.overallCapacity = overallCapacity;
        this.size = size;
    }

    public int getFreezerCapacity() {
        return freezerCapacity;
    }

    public void setFreezerCapacity(int freezerCapacity) {
        this.freezerCapacity = freezerCapacity;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
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
        if (getWeight() != other.getWeight()) return false;
        if (Double.compare(other.getOverallCapacity(), getOverallCapacity()) != 0) return false;
        return getSize().equals(other.getSize());
    }

    @Override
    public int hashCode() {
        final int prime = 113;
        int result = super.hashCode();
        long temp;
        result = prime * result + getFreezerCapacity();
        result = prime * result + getWeight();
        temp = Double.doubleToLongBits(getOverallCapacity());
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + getSize().hashCode();
        return result;
    }

    @Override
    public String toString() {
        String delimeter = "\n\t";
        final StringBuilder sb = new StringBuilder("Refrigerator {");
        sb.append(delimeter).append("power_consumption: ").append(super.getPowerСonsumption());
        sb.append(delimeter).append("weight: ").append(this.getWeight());
        sb.append(delimeter).append("freezer_capacity: ").append(this.getFreezerCapacity());
        sb.append(delimeter).append("overall_capacity: ").append(this.getOverallCapacity());
        sb.append(delimeter).append("size: ").append(this.getSize());
        return sb.append('}').toString();
    }
}
