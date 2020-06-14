package com.imooc.wrapproject.wrap;

public class wrapperTestTwoExercise {
    public static void main(String[] args) {
        double a = 12.599;
        //将基本类型转换为字符串
        String str1 = Double.toString(a);
                System.out.println("a 转换为String型后+10的结果为： "+a);
        String str = "2.8";
        // 将字符串转换为基本类型
        double b = Double.valueOf(str);
                System.out.println("str 转换为double型后+10的结果为： "+str);

    }
}
