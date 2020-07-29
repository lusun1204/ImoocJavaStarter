package com.imooc.List;

import java.util.List;
import java.util.ArrayList;

public class EmployeeTest {
    public static void main(String[] args) {
        //定义ArrayList对象
        ArrayList arrayList = new ArrayList();

        //创建三个Employee类的对象
        Employee employee1 = new Employee(1, "张三", 5000);
        Employee employee2 = new Employee(2, "李四", 5500);
        Employee employee3 = new Employee(3, "赵六", 4000);

        //添加员工信息到ArrayList中
        arrayList.add(employee1);
        arrayList.add(employee2);
        arrayList.add(employee3);

        //显示员工的姓名和薪资
        System.out.println("员工姓名 员工薪资");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(((Employee)arrayList.get(i)).getName() + "     " + ((Employee)arrayList.get(i)).getSalary());

        }
    }
}