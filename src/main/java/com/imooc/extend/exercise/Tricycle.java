package com.imooc.extend.exercise;

public class Tricycle extends NonMotor {
    // 在无参构造中实现对轮子属性值进行修改
    Tricycle(){
        super.getWheelNum();
    }
    // 重写运行方法，描述内容为：三轮车是一款有**个轮子的非机动车。其中**的数据由属性提供
    @Override
    public String work() {
        String str="三轮车是一款有"+super.getWheelNum()+"个轮子的非机动车"+"其中**的数据由属性提供";
        return str;
    }

}
