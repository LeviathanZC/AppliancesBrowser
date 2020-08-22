package com.zercomp.application.entity;

public abstract class AbstractAppliance {

    protected String name;

    public AbstractAppliance(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }

        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }

        AbstractAppliance other = (AbstractAppliance) o;

        return name != null ? this.name.equals(other.getName()) : false;
    }

}
