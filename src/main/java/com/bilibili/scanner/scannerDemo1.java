package com.bilibili.scanner;

import java.util.Scanner;

public class scannerDemo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter long: ");

        int sum=0;
        int m=0;

        while (scanner.hasNextInt()){
            int n=scanner.nextInt();
            sum=n+sum;
            m++;
        }
        System.out.println("m is:" + m);
        System.out.println("sum is:" + sum);
        scanner.close();
    }
}
