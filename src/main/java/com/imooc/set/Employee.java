package com.imooc.set;

import lombok.Data;

@Data
public class Employee {
    //根据需求完成Employee类的定义
    String name;
    Double salary;

    Employee() {

    }

    Employee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

}