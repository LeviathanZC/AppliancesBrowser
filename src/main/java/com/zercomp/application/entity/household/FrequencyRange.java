package com.zercomp.application.entity.household;

public class FrequencyRange {

    private double startRange;
    private double endRange;

    public FrequencyRange(double start, double end) {
        this.startRange = start;
        this.endRange = end;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }

        FrequencyRange that = (FrequencyRange) o;

        if (Double.compare(that.getStartRange(), getStartRange()) != 0) return false;
        return Double.compare(that.getEndRange(), getEndRange()) == 0;
    }

    @Override
    public int hashCode() {
        final int prime = 113;
        int result;
        long temp;
        temp = Double.doubleToLongBits(getStartRange());
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getEndRange());
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(this.getClass().getSimpleName()).append(' ');
        sb.append('[').append(startRange).append('-').append(endRange).append("]\n");
        return sb.toString();
    }

    public double getStartRange() {
        return startRange;
    }

    public void setStartRange(double startRange) {
        this.startRange = startRange;
    }

    public double getEndRange() {
        return endRange;
    }

    public void setEndRange(double endRange) {
        this.endRange = endRange;
    }
}
