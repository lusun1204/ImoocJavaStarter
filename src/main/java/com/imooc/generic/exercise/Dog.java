package com.imooc.generic.exercise;

public class Dog extends Animal{
    public Dog(String name){
        this.setName(name);
    }
    @Override
    void paly() {
        System.out.println(this.getName()+"在做游戏!");
    }
}
