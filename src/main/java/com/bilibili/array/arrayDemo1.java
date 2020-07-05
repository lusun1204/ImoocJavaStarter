package com.bilibili.array;

import java.util.Arrays;

public class arrayDemo1 {
    public static void main(String[] args) {
        int[] arrays = new int[]{1, 2,3};
        int [] arrays1 = {1,2 ,3};
        System.out.println(Arrays.toString(arrays));

        System.out.println(Arrays.equals(arrays,arrays1));

        System.out.println(Arrays.binarySearch(arrays,2));
    }
}
