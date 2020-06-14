package com.imooc.String;

public class StringTestTwoExercise {
    public static void main(String[] args) {
        //定义一个字符串"欢迎来到"
        StringBuffer str = new StringBuffer("欢迎来到");
        //在"欢迎来到"后面添加内容，将字符串变成"欢迎来到imooc"
        System.out.println(str.append("imooc"));
        //使用delete方法删除"欢迎来到",然后插入“你好！”
        System.out.println(str.delete(0,4).insert(0,"你好！"));
        //将字符串变成“你好，imooc”
        System.out.println(str.replace(2,3,","));
        //使用replace方法替换
        System.out.println(str.replace(0,2,"你好大佬"));
    }
}

