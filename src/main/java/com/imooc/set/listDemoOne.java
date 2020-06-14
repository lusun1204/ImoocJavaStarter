package com.imooc.set;


import java.util.ArrayList;
import java.util.List;

public class listDemoOne {
    public static void main(String[] args) {
        List arrayList = new ArrayList();
        arrayList.add("java");
        arrayList.add("C++");
        arrayList.add("go");

        System.out.println("~~~~~~~");

        System.out.println(arrayList.size());

        System.out.println("~~~~~~~");

        for(int i=0;i<arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }
    }
}
