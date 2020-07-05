package com.bilibili.loop;

public class ForDemo1 {
    public static void main(String[] args) {
        int [] numbers = {10,11,12,13,15};
        try {
            for (int x : numbers){
                System.out.println(x);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
