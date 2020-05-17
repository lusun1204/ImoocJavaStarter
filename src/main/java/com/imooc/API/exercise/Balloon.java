package com.imooc.API.exercise;

//创建类Balloon并实现接口IFly
public class Balloon implements IFly{
    //重写方法fly()


    @Override
    public void fly() {
        System.out.println("the Ballon is flying in the sky");
    }
    public void color(){
        System.out.println("the Ballon is red");
    }
}
