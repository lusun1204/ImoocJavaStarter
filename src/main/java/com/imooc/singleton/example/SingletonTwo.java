package com.imooc.singleton.example;

//调用的时候，初始化
public class SingletonTwo {
    //构建类中私有构造
    private SingletonTwo() {

    }

    //创建静态的该类实例对象
    private static SingletonTwo instance = null;

    //创建开放的静态方法提供实例对象
    public static SingletonTwo getInstance() {
        if (instance == null) {
            instance = new SingletonTwo();
        }
        return instance;
    }
}
