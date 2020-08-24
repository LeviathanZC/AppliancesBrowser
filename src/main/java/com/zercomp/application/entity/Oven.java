package com.zercomp.application.entity;

public class Oven extends HouseholdAppliance {

    private int weight;
    private int capacity;
    private double depth;
    private Size size;

    public Oven(int powerConsumption, int weight, int capacity, double depth,
                double width, double height) {
        this(powerConsumption, weight, capacity, depth, new Size(width, height));
    }

    public Oven(int powerConsumption, int weight, int capacity, double depth, Size size) {
        super(Oven.class.getSimpleName(), powerConsumption);
        this.weight = weight;
        this.capacity = capacity;
        this.depth = depth;
        this.size = size;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
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

        Oven other = (Oven) o;

        if (getWeight() != other.getWeight()) return false;
        if (getCapacity() != other.getCapacity()) return false;
        if (Double.compare(other.getDepth(), getDepth()) != 0) return false;
        return getSize().equals(other.getSize());
    }

    @Override
    public int hashCode() {
        final int prime = 113;
        int result = super.hashCode();
        long temp;
        result = prime * result + getWeight();
        result = prime * result + getCapacity();
        temp = Double.doubleToLongBits(getDepth());
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + getSize().hashCode();
        return result;
    }

    @Override
    public String toString() {
        String delimeter = "\n\t";
        final StringBuilder sb = new StringBuilder("Oven {");
        sb.append(delimeter).append("power_consumption: ").append(super.getPowerСonsumption());
        sb.append(delimeter).append("weight: ").append(this.getWeight());
        sb.append(delimeter).append("capacity: ").append(this.getCapacity());
        sb.append(delimeter).append("depth: ").append(this.getDepth());
        sb.append(delimeter).append("size: ").append(this.getSize());
        return sb.append('}').toString();
    }

}
