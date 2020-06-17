package com.imooc.Inner;

public class PeopleTest {
    public static void main(String[] args) {

        People Lily = new People();
        Lily.age=12;
        //方式1：通过实例化的对象调用
        System.out.println(Lily.new Heart().beat());

        System.out.println("~~~~~~~~~~~");
        //方式2：通过外部类到内部类
        People.Heart heart = new People().new Heart();
        System.out.println(heart.beat());

        System.out.println("~~~~~~~~~~~");
        //方式3：通过封装的get方法调用
        heart=Lily.getHeart();
        System.out.println(heart.beat());

    }
}
