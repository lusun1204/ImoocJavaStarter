package com.imooc.API;

public interface IFather {
    String color="black";
    void say();
    default void connection(){
        System.out.println("IFather default");
    };
}
