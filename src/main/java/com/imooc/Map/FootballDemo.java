package com.imooc.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FootballDemo {
    public static void main(String[] args) {
        //定义HashMap的对象并添加数据
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(2014, "德国");
        hashMap.put(2010, "西班牙");
        hashMap.put(2006, "意大利");

        //使用迭代器的方式遍历
        Iterator iterator = hashMap.values().iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        System.out.println();
        //
        for (String s : hashMap.values()) {
            System.out.print(s+" ");
        }


        //使用EntrySet同时获取key和value
        System.out.println();
        Set<Entry<Integer,String>> entrySet = hashMap.entrySet();
        for(Entry<Integer,String> entry:entrySet ){
            System.out.print(entry.getKey()+"-");
            System.out.println(entry.getValue());
        }

    }
}
