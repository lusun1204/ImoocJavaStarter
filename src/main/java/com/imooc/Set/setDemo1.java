package com.imooc.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class setDemo1 {
    public static void main(String[] args) {
        Set set = new HashSet();
        Set set1 = new HashSet(10);
        HashSet hashSet = new HashSet();

        //add elements into set;

        set.add("blue");
        set.add("yellow");
        set.add("red");

        //iterator
        //hasNext;
        //next;
        System.out.println("集合中的元素为: ");
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");

        }
        System.out.println();
        System.out.println("~~~~~~~~~~~~");
        set.add("red");
        iterator = set.iterator();

        //插入失败,不会报错
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");

        }

    }
}
