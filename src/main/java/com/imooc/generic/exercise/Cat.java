package com.imooc.generic.exercise;

public class Cat extends Animal{
    public Cat (String name){
        this.setName(name);
    }
    @Override
    void paly(String name) {
        System.out.println(this.getName()+"在做游戏!");
    }
}
