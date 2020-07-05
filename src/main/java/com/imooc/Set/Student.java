package com.imooc.Set;

import lombok.Data;

@Data
public class Student{
   //根据需求完成Student类的定义
   private int number;
   private String name;
   private double grade;

    public Student(int number, String name, double grade) {
        this.number = number;
        this.name = name;
        this.grade = grade;
    }
}