package com.imooc.generic;

import java.util.Random;

public class FruitGenerator implements Generator{
    private String [] fruits = new String[]{"Apple","banana","pear"};
    @Override
    public String next() {
        Random random = new Random();
        return fruits[random.nextInt(3)];
    }
}
