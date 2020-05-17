package com.imooc.API;

public interface IFather2 {
    void fly();
    default void connection(){
        System.out.println("IFather2 default");
    };
}
