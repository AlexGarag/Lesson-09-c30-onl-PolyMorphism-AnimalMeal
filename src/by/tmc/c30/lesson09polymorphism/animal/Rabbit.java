package by.tmc.c30.lesson09polymorphism.animal;

public class Rabbit extends Animal {

    public Rabbit() {
        super.view = "rabbit";
        super.isCarnivorous = false;
    }

    @Override
    public void voice() {
        System.out.println("The " + view + " is squeaking");
    }
}

