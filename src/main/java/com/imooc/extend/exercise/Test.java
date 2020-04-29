package com.imooc.extend.exercise;

public class Test {
    public static void main(String[] args) {
        System.out.println("父类信息测试：");
        NonMotor nonMotor = new NonMotor("红色","天宇",9,2);
        System.out.println(nonMotor.work());

        System.out.println("自行车类信息测试：");
        Bicycle bicycle = new Bicycle();
        System.out.println(bicycle.work());

        System.out.println("电动车类信息测试：");
        ElectricVehicle electricVehicle = new ElectricVehicle();
        electricVehicle.setBatteryBrand("飞鸽牌");
        System.out.println(electricVehicle.work());

        System.out.println("三轮车类信息测试：");

    }
}
