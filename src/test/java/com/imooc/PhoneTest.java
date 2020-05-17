package com.imooc;

import com.imooc.tel.*;

public class PhoneTest {
    public static void main(String[] args) {
        FourthPhone phone = new  FourthPhone();
        phone.game();
        phone.network();
        phone.photo();
        phone.call();
        phone.message();
        phone.music();
        System.out.println("~~~~~~~~~~~~~");
        IPhoto ip = new FourthPhone();
        ip.photo();
        FourthPhone fourthPhone = new FourthPhone();
        fourthPhone.photo();
        System.out.println("~~~~~~~~~~~~~");
        /**
         * 接口实例调用静态方法,用"接口名称.静态方法名"的方式直接调用
         * 实现接口的类/子接口不会调用静态方法
         */
        INet.showStatic();
        /**
         * 接口调用default method的方式是:接口引用指向调用接口类的实例化, 用"引用设定名.方法体"的方式调用
         * 也可以实例化的对象,直接调用,比如用"new Camera().方法体"
         */
        INet inet = new Camera();
        inet.connection();
        inet.message();
        new Camera().connection();
        new Camera().message();
        System.out.println("~~~~~~~~~~~~~");
        /**
         * 实现接口的类可以重写接口的default方法, 如果调用了多个接口, 可以全部重写;
         * 实现接口的类也可以不重写default方法, 实例化的子类可以直接调用default(如果接口中default有方法体, 则会打印方法体中的内容)
         */
        INet c1 = new Computer();
        c1.connection();
        IPhoto c2 = new Computer();
        c2.surface();
        Computer c3 = new Computer();
        c3.connection();
        c3.surface();
        System.out.println("~~~~~~~~~~");
        INet w1 = new SmartWatch();
        w1.connection();
        System.out.println("~~~~~~~~~~");
        INet f4= new FourthPhone();
        f4.connection();


    }
}
