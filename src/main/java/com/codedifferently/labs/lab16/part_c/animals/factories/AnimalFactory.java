package com.codedifferently.labs.lab16.part_c.animals.factories;

import com.codedifferently.labs.lab16.part_c.animals.Cat;
import com.codedifferently.labs.lab16.part_c.animals.Dog;
import com.codedifferently.labs.lab16.part_c.animals.storage.CatHouse;
import com.codedifferently.labs.lab16.part_c.animals.storage.DogHouse;

import java.util.Date;

public class AnimalFactory {
    public static Dog createDog(String name, Date birthDate) {
        Integer newId = DogHouse.getNumberOfDogs();
        return new Dog(name, birthDate, newId);
    }

    public static Cat createCat(String name, Date birthDate) {
        Integer newId = CatHouse.getNumberOfCats();
        return new Cat(name, birthDate, newId);
    }
}
