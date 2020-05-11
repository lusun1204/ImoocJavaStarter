package com.imooc;

import com.imooc.tel.Camera;
import com.imooc.tel.Computer;
import com.imooc.tel.FourthPhone;
import com.imooc.tel.IPhoto;

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


        ip=new Camera();
        ip.photo();

    }
}
