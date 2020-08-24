package com.zercomp.application.entity;

public abstract class ComputerAppliance extends AbstractAppliance {

    private double batteryCapacity;
    private int memoryROM;
    private int display_inches;

    public ComputerAppliance() {
        this(0, 0, 0);
    }

    public ComputerAppliance(double batteryCapacity, int memoryROM, int display_inches) {
        this(ComputerAppliance.class.getSimpleName(), batteryCapacity, memoryROM, display_inches);
    }

    public ComputerAppliance(String name, double batteryCapacity, int memoryROM, int display_inches) {
        super(name);
        this.batteryCapacity = batteryCapacity;
        this.memoryROM = memoryROM;
        this.display_inches = this.display_inches;
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

        ComputerAppliance other = (ComputerAppliance) o;

        if (Double.compare(other.batteryCapacity, batteryCapacity) != 0) return false;
        if (memoryROM != other.memoryROM) return false;
        return display_inches == other.display_inches;
    }

    @Override
    public int hashCode() {
        final int prime = 113;
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(batteryCapacity);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + memoryROM;
        result = prime * result + display_inches;
        return result;
    }

    @Override
    public String toString() {
        String delimeter = "\n\t";
        final StringBuilder sb = new StringBuilder("ComputerAppliance {");
        sb.append(delimeter).append("name: ").append(this.getName());
        sb.append(delimeter).append("battery_capacity: ").append(this.getBatteryCapacity());
        sb.append(delimeter).append("memory_ROM: ").append(this.getMemoryROM());
        sb.append(delimeter).append("display_inches: ").append(this.getDisplay_inches());
        return sb.append("\n}").toString();
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public int getMemoryROM() {
        return memoryROM;
    }

    public void setMemoryROM(int memoryROM) {
        this.memoryROM = memoryROM;
    }

    public int getDisplay_inches() {
        return display_inches;
    }

    public void setDisplay_inches(int display_inches) {
        this.display_inches = display_inches;
    }
}
