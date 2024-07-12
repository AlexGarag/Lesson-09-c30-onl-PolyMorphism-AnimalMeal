package by.tmc.c30.lesson09polymorphism;

import by.tmc.c30.lesson09polymorphism.animal.Animal;
import by.tmc.c30.lesson09polymorphism.animal.Dog;
import by.tmc.c30.lesson09polymorphism.animal.Rabbit;
import by.tmc.c30.lesson09polymorphism.meal.Great;
import by.tmc.c30.lesson09polymorphism.meal.Meal;
import by.tmc.c30.lesson09polymorphism.meal.Meat;

public class Executor {
    public static void main(String[] args) {
        Meal great  = new Great();
        Meal meat  = new Meat();
        Animal dog  = new Dog();
        Animal rabbit  = new Rabbit();
        dog.eat(great);
        dog.eat(meat);
        rabbit.eat(great);
        rabbit.eat(meat);
    }
}
