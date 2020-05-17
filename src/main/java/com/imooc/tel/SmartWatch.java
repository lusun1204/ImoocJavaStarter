package com.imooc.tel;

public class SmartWatch implements IPhoto,INet{
    @Override
    public void network(){
        System.out.println("智能手表可以上网");
    }
    @Override
    public void message(){
        System.out.println("智能手表可以发短信");
    }

    public void call(){
        System.out.println("智能手表可以打电话");
    }

    @Override
    public void photo() {
        System.out.println("智能手表可以拍照");
    }
    @Override
    public void connection(){
        System.out.println("我是智能手表默认的connection方法");
    }
}
