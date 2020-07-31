package com.imooc.generic.exercise;

public class Cat extends Animal{
    public Cat (String name){
        this.setName(name);
    }
    @Override
    void paly() {
        System.out.println(this.getName()+"在做游戏!");
    }
}
