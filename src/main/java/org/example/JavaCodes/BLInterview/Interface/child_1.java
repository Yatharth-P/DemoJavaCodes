package org.example.JavaCodes.BLInterview.Interface;

public class child_1 implements  Inter{

    private String fooname = "";

    public void setFooname(String fooname) {
        this.fooname = fooname;
        System.out.println("Fooname from setter method called as :" + fooname);
    }
    @Override
    public void foo(String fooname) {

        this.setFooname(fooname);
        System.out.println("Foo called from  interface child ");
    }
}
