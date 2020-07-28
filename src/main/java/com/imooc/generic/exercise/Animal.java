package com.imooc.generic.exercise;

public abstract class Animal {
    private String name;
    private String status;

    public void setName(String name) {
        this.name = name;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

    abstract void paly(String name);
}
