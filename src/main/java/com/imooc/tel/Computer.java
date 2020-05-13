package com.imooc.tel;

public class Computer implements INet,IPhoto{
    public void game(){
        System.out.println("电脑可以玩游戏");
    }

    @Override
    public void message() {

    }

    @Override
    public void network(){
        System.out.println("电脑可以上网");
    }
    public void video(){
        System.out.println("电脑可以看视频");
    }

    public void music(){
        System.out.println("电脑可以听音乐");
    }
    @Override
    public void connection(){
        System.out.println("computer 重写接口的connection的方法");
    }

    @Override
    public void photo() {

    }
//    @Override
//    public void surface(){
//        System.out.println("重写IPhoto的surface方法");
//    }
}
