package com.imooc.generic.exercise;

import java.util.List;

public class AnimalPlay {
    public void playGames(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            animal.paly();
        }
    }
}
