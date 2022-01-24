package com.codedifferently.labs.lab16.part_c.animals;

import com.codedifferently.labs.lab16.part_c.animals.food.Food;

public interface Animal {
    String speak();
    Integer getNumberOfMealsEaten();
    Integer getId();
    void eat(Food food);

}
