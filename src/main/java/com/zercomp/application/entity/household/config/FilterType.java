package com.zercomp.application.entity.household.config;

public enum FilterType {

    A("A"), B("B"), C("C");

    private String type;

    FilterType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return new StringBuilder("[FilterType = ").append(this.type).append(']').toString();
    }

    public String getType() {
        return type;
    }
}
