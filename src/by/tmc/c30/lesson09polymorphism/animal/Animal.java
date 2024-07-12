package by.tmc.c30.lesson09polymorphism.animal;

import by.tmc.c30.lesson09polymorphism.inteface_marker.Carnivorous;
import by.tmc.c30.lesson09polymorphism.inteface_marker.Herbivore;
import by.tmc.c30.lesson09polymorphism.meal.Great;
import by.tmc.c30.lesson09polymorphism.meal.Meal;
import by.tmc.c30.lesson09polymorphism.meal.Meat;

public abstract class Animal {
    protected String view;
    public void eat(Object food, Object animal) {
        if (food instanceof Meal) {
            if ((food instanceof Meat && animal instanceof Carnivorous) || (food instanceof Great && animal instanceof Herbivore)) {
                System.out.println("The " + view + " eat " + ((Meal) food).getName());
            }
        } else {
            voice();
            System.out.println("The " + view + " does not " + food.getClass().getName());
        }
    }

    public abstract void voice();
}
