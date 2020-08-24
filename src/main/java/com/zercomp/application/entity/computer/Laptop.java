package com.zercomp.application.entity.computer;

import com.zercomp.application.entity.ComputerAppliance;

public class Laptop extends ComputerAppliance {

    private OSType osType;
    private int sysetemMemory;
    private double cpu;

    public Laptop(double batteryCapacity,
                  OSType osType,
                  int memory_ROM,
                  int systemMemory,
                  double cpu,
                  int displayInches) {
        super(Laptop.class.getSimpleName(), batteryCapacity, memory_ROM, displayInches);
        this.osType = osType;
        this.sysetemMemory = systemMemory;
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

        if (getSysetemMemory() != laptop.getSysetemMemory()) return false;
        if (Double.compare(laptop.getCpu(), getCpu()) != 0) return false;
        return getOsType() == laptop.getOsType();
    }

    @Override
    public int hashCode() {
        final int prime = 113;
        int result = super.hashCode();
        long temp;
        result = prime * result + getOsType().hashCode();
        result = prime * result + getSysetemMemory();
        temp = Double.doubleToLongBits(getCpu());
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    public OSType getOsType() {
        return osType;
    }

    public void setOsType(OSType osType) {
        this.osType = osType;
    }

    public int getSysetemMemory() {
        return sysetemMemory;
    }

    public void setSysetemMemory(int sysetemMemory) {
        this.sysetemMemory = sysetemMemory;
    }

    public double getCpu() {
        return cpu;
    }

    public void setCpu(double cpu) {
        this.cpu = cpu;
    }
}
