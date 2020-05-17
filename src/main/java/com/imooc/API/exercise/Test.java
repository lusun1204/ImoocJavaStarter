package com.imooc.API.exercise;

//测试类
public class Test {

    public static void main(String[] args) {
		  //对象实例化
IFly iFly = new Balloon();
iFly.fly();

IFly iFly1 = new Plane();
iFly1.fly();
Balloon balloon = new Balloon();
balloon.fly();
balloon.color();

          //分别调用fly()方法



	}
}
