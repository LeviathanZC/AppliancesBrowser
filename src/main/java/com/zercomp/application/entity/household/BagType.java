package com.zercomp.application.entity.household;

public enum BagType {

    A2("A2"),
    AA89("AA-89"),
    XX00("XX00");

    private String type;

    BagType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}