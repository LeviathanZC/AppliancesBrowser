package com.zercomp.application.entity.computer;

import com.zercomp.application.entity.ComputerAppliance;

public class Laptop extends ComputerAppliance {

    private OSType osType;
    private int systemMemory;
    private double cpu;

    public Laptop(double batteryCapacity,
                  OSType osType,
                  int memory_ROM,
                  int systemMemory,
                  double cpu,
                  int displayInches) {
        super(Laptop.class.getSimpleName(), batteryCapacity, memory_ROM, displayInches);
        this.osType = osType;
        this.systemMemory = systemMemory;
        this.cpu = cpu;
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

        Laptop laptop = (Laptop) o;

        if (getSystemMemory() != laptop.getSystemMemory()) return false;
        if (Double.compare(laptop.getCpu(), getCpu()) != 0) return false;
        return getOsType() == laptop.getOsType();
    }

    @Override
    public int hashCode() {
        final int prime = 113;
        int result = super.hashCode();
        long temp;
        result = prime * result + getOsType().hashCode();
        result = prime * result + getSystemMemory();
        temp = Double.doubleToLongBits(getCpu());
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        String delimeter = "\n\t";
        final StringBuilder sb = new StringBuilder(super.getName()).append('{');
        sb.append(delimeter).append("battery_capacity: ").append(super.getBatteryCapacity());
        sb.append(delimeter).append("memory_ROM: ").append(super.getMemoryROM());
        sb.append(delimeter).append("display_inches: ").append(super.getDisplay_inches());
        sb.append(delimeter).append("OS: ").append(this.getOsType());
        sb.append(delimeter).append("system_memory: ").append(this.getSystemMemory());
        sb.append(delimeter).append("CPU: ").append(this.getCpu());
        return sb.append("\n}").toString();
    }

    public OSType getOsType() {
        return osType;
    }

    public void setOsType(OSType osType) {
        this.osType = osType;
    }

    public int getSystemMemory() {
        return systemMemory;
    }

    public void setSystemMemory(int systemMemory) {
        this.systemMemory = systemMemory;
    }

    public double getCpu() {
        return cpu;
    }

    public void setCpu(double cpu) {
        this.cpu = cpu;
    }
}
