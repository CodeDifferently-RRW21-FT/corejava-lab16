package com.codedifferently.labs.lab16.part_c.animals;

import java.util.Date;

public class Dog extends Mammal {
    public Dog(String name, Date birthDate, Integer id) {
        super(name, birthDate, id);
    }

    public String speak() {
        return "bark!";
    }
}
