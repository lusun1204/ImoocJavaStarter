package com.bilibili.oop;

/**
 * 值传递
 */
public class valueTransfer {
    public static void main(String[] args) {
        int a = 1;
        System.out.println(a);
        valueTransfer.changeValue(10);
        System.out.println(a);
    }

    public static void changeValue(int a ){
         a =10;
    }
}
