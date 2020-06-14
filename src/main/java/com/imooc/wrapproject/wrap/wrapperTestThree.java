package com.imooc.wrapproject.wrap;

public class wrapperTestThree {
    public static void main(String[] args) {
        //等号两端如果是对象名，比较的是对象再内存当中的引用；
        Integer a = new Integer(100);
        Integer b = new Integer(100);
        System.out.println("Integer a == Integer b的结果是： "+( a ==  b));

        System.out.println("~~~~~");
        Integer c =100;
        //执行的自动拆箱的操作：Integer c = Integer.valueOf(100)
        //再缓存区里构建1个
        System.out.println("c==100的结果是："+(c==100));//自动拆箱，c拆箱后还原的值是100，比较结果实际上是两个int值得比较
        System.out.println("~~~~~");

        Integer d =100;
        //执行的自动拆箱的操作：Integer d = Integer.valueOf(100)
        //如果拆箱的结果范围在(128,128)，则系统回去查看在缓存区有没有100，如果有，则直接拿来用
        System.out.println("c==d的结果是："+(c==d));

        Integer e1=200;
        Integer e2=200;
        System.out.println("e1==e2的结果是："+(e1==e2));
        //200超出了(-128,128)的范围(常量池），直接隐式的在内存中new一个新的对象；
        //double和float类型没有常量池的概念
    }


}
