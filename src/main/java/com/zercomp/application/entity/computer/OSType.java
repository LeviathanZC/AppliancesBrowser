package com.zercomp.application.entity.computer;

public enum OSType {

    WINDOWS("Windows"),
    LINUX("Linux"),
    MAC_OS("MacOs");

    private String opeartionSystem;

    OSType(String os) {
        this.opeartionSystem = os;
    }

    public String getOpeartionSystem() {
        return this.opeartionSystem;
    }

    @Override
    public String toString() {
        return new StringBuilder("[OS = ").append(this.opeartionSystem).append(']').toString();
    }
}
