package com.imooc.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CatTest {
    public static void main(String[] args) {
        Cat huahua=new Cat("huahua",12,"England");
        Cat fanfan=new Cat("fanfan",3,"china");

        Set set = new HashSet();

        set.add(huahua);
        set.add(fanfan);

        Iterator iterator = set.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //t添加和花花名字一样的信息
        Cat huahua1=new Cat("huahua",12,"England");
        set.add(huahua1);
        System.out.println("~~~~~~~~~~~~");
        iterator = set.iterator();
         while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
