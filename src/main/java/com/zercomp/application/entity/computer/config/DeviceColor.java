package com.zercomp.application.entity.computer.config;

public enum DeviceColor {

    RED("Red"),
    GREEN("Green"),
    BLUE("Blue");

    private String color;

    DeviceColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return new StringBuilder("[Color - ").append(this.color).append(']').toString();
    }
}
