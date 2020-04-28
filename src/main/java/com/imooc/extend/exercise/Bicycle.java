package com.imooc.extend.exercise;

public class Bicycle extends NonMotor {
    // 在构造方法中调用父类多参构造，完成属性赋值
    private String color;
    private String brand;



    // 重写运行方法，描述内容为：这是一辆**颜色的，**牌的自行车。其中**的数据由属性提供
    @Override
    public String work() {
        String str = "这是一辆" + color + "颜色的，" + brand + "牌的自行车，其中**的数据由属性提供";
        return str;
    }
}

