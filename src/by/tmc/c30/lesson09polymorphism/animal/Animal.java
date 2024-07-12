package by.tmc.c30.lesson09polymorphism.animal;

import by.tmc.c30.lesson09polymorphism.meal.Great;
import by.tmc.c30.lesson09polymorphism.meal.Meal;
import by.tmc.c30.lesson09polymorphism.meal.Meat;

public abstract class Animal {
    protected String view;
    protected boolean isCarnivorous;

    public void eat(Object o) {
        Meal meal = (Meal) o;
        if ((meal instanceof Meat && isCarnivorous) || (meal instanceof Great && !isCarnivorous))  {
            System.out.println("The " + view + " eat " + meal.getName());
        } else {
            voice();
            System.out.println("The " + view + " does not " + meal.getName());
        }
    }

    public abstract void voice();
}
