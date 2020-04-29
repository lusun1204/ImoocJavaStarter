package com.imooc.extend.exercise;

import lombok.Getter;
import lombok.Setter;

// 公有的get***/set***方法完成属性封装
@Setter
@Getter
public class NonMotor {
    // 私有属性：品牌、颜色、轮子(默认2个)、座椅（默认 1个）
    private String brand;
    private String color;
    //private int wheelNum;
    private int wheelNum=2;
    //private int seatNum;
    private int seatNum=1;

    // 无参构造方法
    NonMotor(){

    }
    // 双参构造方法，完成对品牌和颜色的赋值
    NonMotor(String brand, String color){
        this.brand=brand;
        this.color=color;

    }
    // 四参构造方法，分别对所有属性赋值
    NonMotor(String brand, String color,int wheelNum,int seatNum){
        this.brand=brand;
        this.color=color;
        this.wheelNum=wheelNum;
        this.seatNum=seatNum;
        //System.out.println(this.work());
    }


    // 方法：运行，描述内容为：这是一辆**颜色的，**牌的非机动车，有**个轮子，有**个座椅的非机动车。其中**的数据由属性提供
    public String work() {
        String str="这是一辆"+this.color+"颜色的，"+this.brand+"牌的非机动车，有"+this.wheelNum+"个轮子，有"+seatNum+"个座椅的非机动车。其中**的数据由属性提供";
        return str;
    }
}

