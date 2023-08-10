package org.example.JavaCodes.SimpllrInterview;

public class ChildClass extends ParentClass{

    public void foo()
    {
        System.out.println("Foo called from child class");
    }

    public void foo1(int i, int n)
    {
        System.out.println("Foo 1 called from child class having 2 parameters : " +  i + "  " + n);

    }

    public void foo1(int i)
    {
        System.out.println("Foo 1 called from child class having 1 parameter :  " + i);
    }

}
