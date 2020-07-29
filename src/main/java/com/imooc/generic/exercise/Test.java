package com.imooc.generic.exercise;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        //定义List并添加Dog类对象
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());


        //定义List并添加Cat类对象
        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat());

        //使用AnimalPlay类的方法，按照演示效果输出内容
        AnimalPlay animalPlay = new AnimalPlay();
        animalPlay.playGames(dogs);

    }
}