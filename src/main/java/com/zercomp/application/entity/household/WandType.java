package com.zercomp.application.entity.household;

public enum WandType {

    ALL_IN_ONE("all-in-one");

    private String type;

    WandType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
