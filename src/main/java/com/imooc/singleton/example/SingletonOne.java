package com.imooc.singleton.example;
//创建对象实例的时候，直接初始化
public class SingletonOne {
    // 创建类中私有构造
    private SingletonOne(){

    }
    //创建私有静态实例
    private static SingletonOne instance = new SingletonOne();

    //创建共有静态方法，返回静态实例对象
    public static SingletonOne getInstance(){
        return instance;
    }
}
