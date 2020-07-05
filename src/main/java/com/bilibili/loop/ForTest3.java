package com.bilibili.loop;

/**
 * 打印99乘法表格
 */
public class ForTest3 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int m = 0; m < i; m++)
                System.out.print((m+1) + "*" + i + "=" + i * (m+1) + " ");
            System.out.println("\n");

        }
    }
}

