package com.imooc.tel;

public  class Camera implements IPhoto ,INet{
    @Override
    public void photo() {
        System.out.println("相机可以拍照");
    }

    @Override
    public void message() {

    }

    @Override
    public void network() {

    }

    @Override
    public void surface(){
        System.out.println("重写deafult的surface方法");
    };
//    @Override
//    public void connection ();
//    public void photo(){
//        System.out.println("相机可以拍照");
//    }
}
