package com.bilibili.loop;


import com.bilibili.oop.studentDemo;

public class WhileDemo {
    public static void main(String[] args) {
        int i = 0;
        int sum=0;

        while (i<=100){
            sum=sum+i;
            i++;
        }
        System.out.println(sum);
        studentDemo.say();
        studentDemo studentDemo = new studentDemo();
        studentDemo.speak();
    }
}
