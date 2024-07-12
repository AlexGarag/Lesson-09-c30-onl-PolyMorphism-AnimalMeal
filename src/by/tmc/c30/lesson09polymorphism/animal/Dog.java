package by.tmc.c30.lesson09polymorphism.animal;

public class Dog extends Animal {

    public Dog() {
        super.view = "dog";
        super.isCarnivorous = true;
    }

    @Override
    public void voice() {
        System.out.println("The " + view + " is growling");
    }
}
