package org.example.JavaCodes.SimpllrInterview;

public class MainClass {

    public static void main(String[] args) {

        //Overriding
        ParentClass parent = new ChildClass();
        parent.foo();

        //Overloading
        ChildClass child = new ChildClass();
        child.foo1(5);
        child.foo1(6,8);
    }
}
