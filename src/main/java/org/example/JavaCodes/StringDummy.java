package org.example.JavaCodes;

public class StringDummy {

    public static void main(String[] args) {
        String str = "Dummy";
        String str2 = "Dummy";
        String str3 = new String("Dummy");
        System.out.println(str+str2);
        System.out.println(str==str2);
        System.out.println(str==str3);
    }
}
