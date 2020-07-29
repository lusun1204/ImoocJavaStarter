package com.bilibili.oop;

/**
 * 引用传递
 */
public class referTransfer {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.name);
        referTransfer.changeName(person);
        System.out.println(person.name);

    }
    public static void changeName(Person person){
        person.name="Tom";
    }


}

class Person {
    String name;
}