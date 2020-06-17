package com.imooc.API.exercise;

//创建类Bird并实现接口IFly
public class Bird implements IFly{
    //重写fly()方法


    @Override
    public void fly() {
        System.out.println("the Bird is flying in the sky");
    }
}
