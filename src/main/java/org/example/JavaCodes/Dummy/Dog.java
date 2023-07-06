package org.example.JavaCodes.Dummy;

public class Dog implements InterEG{
    @Override
    public void run() {
        System.out.println("Dog class run method called");
    }

    @Override
    public void animal() {
        System.out.println("Dog class animal method called");
    }
}
