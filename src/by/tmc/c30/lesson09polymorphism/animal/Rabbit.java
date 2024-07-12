package by.tmc.c30.lesson09polymorphism.animal;

import by.tmc.c30.lesson09polymorphism.inteface_marker.Herbivore;

public class Rabbit extends Animal implements Herbivore {

    public Rabbit() {
        super.view = "rabbit";
    }

    @Override
    public void voice() {
        System.out.println("The " + view + " is squeaking");
    }
}

