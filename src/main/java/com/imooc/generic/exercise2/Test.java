package com.imooc.generic.exercise2;

public class Test {
    public <T extends Person> void display(T t){
        t.display();
    }

    public static void main(String[] args) {
        Test test = new Test();
        Student student = new Student();
        test.display(student);
    }
}
