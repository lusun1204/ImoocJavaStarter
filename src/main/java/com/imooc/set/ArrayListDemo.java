package com.imooc.set;

import java.util.ArrayList;
import java.util.List;
public class ArrayListDemo {
    public static void main(String[] args) {
        //用ArrayList存储学科的名称
        ArrayList arrayList = new ArrayList();
        arrayList.add("语文");
        arrayList.add("数学");
        arrayList.add("英语");



        //输出列表中元素的个数
        System.out.println(arrayList.size());

        //遍历输出所有列表元素
        for (Object x:arrayList
             ) {
            System.out.println(x);
            
        }

    }
}
