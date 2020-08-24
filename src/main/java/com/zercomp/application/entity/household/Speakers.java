package com.zercomp.application.entity.household;

import com.zercomp.application.entity.HouseholdAppliance;

public class Speakers extends HouseholdAppliance {

    private int numberOfSpeakers;
    private FrequencyRange range;
    private int cordLength;

    public Speakers(int powerConsumption, int numberOfSpeakers, double startRange, double endRange, int cordLength) {
        this(powerConsumption, numberOfSpeakers, new FrequencyRange(startRange, endRange), cordLength);
    }

    public Speakers(int powerConsumption, int numberOfSpeakers, FrequencyRange range, int cordLength) {
        super(Speakers.class.getSimpleName(), powerConsumption);
        this.numberOfSpeakers = numberOfSpeakers;
        this.range = range;
        this.cordLength = cordLength;
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

        Speakers other = (Speakers) o;

        if (getNumberOfSpeakers() != other.getNumberOfSpeakers()) return false;
        if (getCordLength() != other.getCordLength()) return false;
        return getRange().equals(other.getRange());
    }

    @Override
    public int hashCode() {
        final int prime = 113;
        int result = super.hashCode();
        result = prime * result + getNumberOfSpeakers();
        result = prime * result + getRange().hashCode();
        result = prime * result + getCordLength();
        return result;
    }

    @Override
    public String toString() {
        String delimeter = "\n\t";
        final StringBuilder sb = new StringBuilder(super.getName()).append('{');
        sb.append(delimeter).append("power_consumption: ").append(super.getPowerСonsumption());
        sb.append(delimeter).append("number_of_speakers: ").append(this.getNumberOfSpeakers());
        sb.append(delimeter).append("range: ").append(this.getRange());
        sb.append(delimeter).append("coord_length: ").append(this.getCordLength());
        return sb.append("\n}").toString();
    }

    public int getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    public void setNumberOfSpeakers(int numberOfSpeakers) {
        this.numberOfSpeakers = numberOfSpeakers;
    }

    public FrequencyRange getRange() {
        return range;
    }

    public void setRange(FrequencyRange range) {
        this.range = range;
    }

    public int getCordLength() {
        return cordLength;
    }

    public void setCordLength(int cordLength) {
        this.cordLength = cordLength;
    }
}
