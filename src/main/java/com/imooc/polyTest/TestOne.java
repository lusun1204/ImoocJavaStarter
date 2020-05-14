package com.imooc.polyTest;

public class TestOne implements One,Two{
//    public int x=44;
    public void test(){
        System.out.println(One.x);
    }

    public static void main(String[] args) {
        TestOne testOne = new TestOne();
//        testOne.test();
    }
}
