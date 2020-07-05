package com.imooc.List;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("java");
        list.add("c");
        list.add("c++");
        list.add("go");
        System.out.println("the number of list:" + list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        list.remove(2);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        boolean a = list.contains("java");
        System.out.println(a);

    }
}
