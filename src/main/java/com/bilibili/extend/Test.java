package com.bilibili.extend;
//子类可以继承父类的public,default,protected,Get/Set方法

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.age); //父类属性default
        System.out.println(student.money); //父类属性protected
        System.out.println(student.name); //父类属性public
       student.setColor("blue");
        System.out.println(student.getColor());
    }
}
