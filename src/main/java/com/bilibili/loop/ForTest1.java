package com.bilibili.loop;

public class ForTest1 {
    public static void main(String[] args) {
        int baseSum = 0;
        int evenSum = 0;

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                baseSum = baseSum + i;
            } else {
                evenSum = evenSum + i;
            }
        }
        System.out.println(baseSum);
        System.out.println(evenSum);
    }
}
