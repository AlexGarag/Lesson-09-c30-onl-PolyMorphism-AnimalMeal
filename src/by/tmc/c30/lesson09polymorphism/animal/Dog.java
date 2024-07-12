package by.tmc.c30.lesson09polymorphism.animal;

import by.tmc.c30.lesson09polymorphism.inteface_marker.Carnivorous;

public class Dog extends Animal implements Carnivorous{

    public Dog() {
        super.view = "dog";
    }

    @Override
    public void voice() {
        System.out.println("The " + view + " is growling");
    }
}
