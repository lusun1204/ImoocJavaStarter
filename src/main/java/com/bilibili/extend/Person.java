package com.bilibili.extend;

public class Person {
    public String name = "person";
    protected int money = 123;
    int age = 15;
    private String color = "yellow";


    public String getColor() {
        return color;
    }

    public void setColor(String color){
        this.color=color;
    }
}
