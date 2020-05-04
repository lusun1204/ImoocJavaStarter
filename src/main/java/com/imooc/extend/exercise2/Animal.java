package com.imooc.extend.exercise2;

/*
 *final class: 该类没有子类, public final class/ final public class
 *final 方法:该方法不允许被子类重写, 但是可以正常被子类继承使用
 * final 方法内局部变量: 只要在具体被使用之前进行赋值即可, 一旦赋值不允许被修改
 * 类中的成员属性: 赋值过程: 1.定义直接初始化 2.构造方法 3.构造代码块
 * final不能修饰构造方法
 */

class Animal {
    Animal() {
        System.out.println("animal is created");
    }
}
