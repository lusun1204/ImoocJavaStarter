package com.imooc.Set;

import lombok.Data;

@Data
public class Cat {
    private String name;
    private int month;
    private String species;

    public Cat(String name, int month, String species) {
        this.name = name;
        this.month = month;
        this.species = species;
    }

    @Override
    public String toString() {
        return
                "name is '" + name + '\'' +
                ", month is " + month +
                ", species is '" + species + '\'';
    }
}
