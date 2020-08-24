package com.zercomp.application.entity.computer;

import com.zercomp.application.entity.ComputerAppliance;

public class TabletPC extends ComputerAppliance {

    private int flashMemoryCapacity;
    private DeviceColor color;

    public TabletPC(double batteryCapacity,
                    int memoryROM,
                    int displayInches,
                    int flashMemoryCapacity,
                    DeviceColor color) {
        super(TabletPC.class.getSimpleName(), batteryCapacity, memoryROM, displayInches);
        this.flashMemoryCapacity = flashMemoryCapacity;
        this.color = color;
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

        TabletPC other = (TabletPC) o;

        if (getFlashMemoryCapacity() != other.getFlashMemoryCapacity()) return false;
        return getColor() == other.getColor();
    }

    @Override
    public int hashCode() {
        final int prime = 113;
        int result = super.hashCode();
        result = prime * result + getFlashMemoryCapacity();
        result = prime * result + getColor().hashCode();
        return result;
    }

    @Override
    public String toString() {
        String delimeter = "\n\t";
        final StringBuilder sb = new StringBuilder(super.getName()).append('{');
        sb.append(delimeter).append("batter_capacity: ").append(super.getBatteryCapacity());
        sb.append(delimeter).append("display_inches: ").append(super.getDisplay_inches());
        sb.append(delimeter).append("memory_ROM: ").append(super.getMemoryROM());
        sb.append(delimeter).append("flash_memory_capacity: ").append(this.getFlashMemoryCapacity());
        sb.append(delimeter).append("color: ").append(this.getColor());
        return sb.append("\n}").toString();
    }

    public int getFlashMemoryCapacity() {
        return flashMemoryCapacity;
    }

    public void setFlashMemoryCapacity(int flashMemoryCapacity) {
        this.flashMemoryCapacity = flashMemoryCapacity;
    }

    public DeviceColor getColor() {
        return color;
    }

    public void setColor(DeviceColor color) {
        this.color = color;
    }
}
