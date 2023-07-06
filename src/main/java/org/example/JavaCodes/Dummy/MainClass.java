package org.example.JavaCodes.Dummy;

public class MainClass {

    public static void main(String[] args) {
        InterEG inter;

        String animalName = "Elephant";

        if(animalName.equals("Dog"))
        {
            inter = new Dog();
            inter.run();
            inter.animal();
        }
        else if(animalName.equals("Elephant"))
        {
            inter = new Elephant();
            inter.run();
            inter.animal();
        }
    }
}
