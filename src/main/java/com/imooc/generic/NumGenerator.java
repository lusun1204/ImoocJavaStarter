package com.imooc.generic;

import java.util.Random;

public class NumGenerator implements Generator{
    Integer [] Nums = new Integer[] {1,100,300};
    @Override
    public Integer next() {
        Random random = new Random();
        return Nums[random.nextInt(3)];
    }
}
