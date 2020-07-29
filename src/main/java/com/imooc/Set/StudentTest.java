package com.imooc.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StudentTest {
    public static void main(String[] args) {
        //定义三个Student类的对象及一个HashSet类的对象
        Student s1 = new Student(3, "William", 65);
        Student s2 = new Student(1, "Tom", 87);
        Student s3 = new Student(2, "Lucy", 95);

        HashSet <Student>set = new HashSet<Student>();

        set.add(s1);
        set.add(s2);
        set.add(s3);

        //将Student类的对象添加到集合中


        //使用迭代器显示Student类的对象中的内容
        for (Student student : set) {
            System.out.println(student);
        }
        boolean flag1 = set.removeAll(set);
        if (set.isEmpty()){
            System.out.println("there is nothing");
        }

    }
}

