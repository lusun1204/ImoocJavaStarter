package com.imooc.set;

import java.util.List;
import java.util.ArrayList;

public class EmployeeTest {
    public static void main(String[] args) {
        //定义ArrayList对象
        ArrayList arrayList = new ArrayList();

        //创建三个Employee类的对象
        Employee employee1 = new Employee("张三", 500.0);
        Employee employee2 = new Employee("李四", 600.0);
        Employee employee3 = new Employee("王五", 700.0);

        //添加员工信息到ArrayList中
        arrayList.add(employee1);
        arrayList.add(employee2);
        arrayList.add(employee3);

        //显示员工的姓名和薪资
        System.out.println("姓名"+" "+"收入");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(((Employee)arrayList.get(i)).getName());
            System.out.print(" ");
            System.out.print(((Employee)arrayList.get(i)).getSalary());
            System.out.println();
        }
    }
}
