package com.imooc.API;

public interface ISon extends IFather,IFather2{
    void run();
    default void connection(){
        System.out.println("ISon default");
    };
}
