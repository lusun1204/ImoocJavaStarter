package com.imooc.wrapproject.wrap;

public class wrapperTestTwo {
    public static void main(String[] args) {
        int score = 10;
        System.out.println("int score: "+score);
        //将基础数据类型int，转换成String包装类
        String score1 = Integer.toString(score);
        System.out.println("score1："+score1);
        //基础数据类型int，先转换为Integer包装类，再装换为String包装类；
        Integer score2 = score;
        String score3 = score2.toString();
        System.out.println("score3："+score3);
        System.out.println("~~~~~~~~~~~~~~~");
        //将包装类转为基本数据类型
        //方式1
        int s1 = Integer.parseInt(score1);
        System.out.println("s1："+s1);
        //方式2
        int s2 = Integer.valueOf(score1);
        System.out.println("s2："+s2);
    }
}
