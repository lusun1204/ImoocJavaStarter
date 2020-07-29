package com.bilibili.loop;

public class ForTest2 {
    public static void main(String[] args) {

        /*while*/
        int i = 0;
        int n = 0;
        while (i <= 1000) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
                n++;
                if (n % 3 == 0) {
                    System.out.println("\n");
                }
            }
            i++;
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
        /*for*/
        for (int a = 0; a <= 1000; a++) {
            if (a % 5 == 0) {
                System.out.print(a + " ");
                n++;
                if (n % 3 == 0) {
                    System.out.println("\n");
                }
            }
        }
    }
}
