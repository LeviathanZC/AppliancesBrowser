package com.zercomp.application.entity.household;

public enum WandType {

    ALL_IN_ONE("all-in-one");

    private String type;

    WandType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return new StringBuilder("[WandType = ").append(this.type).append(']').toString();
    }

    public String getType() {
        return type;
    }
}
