package org.example.JavaCodes.StringCodes;

public class SwapTwoStrings {

    public static void main(String args[])
    {
        String str1 = "My name is xyz";
        String str2 = "My name is not xyz";

        System.out.println("Before swapping");
        System.out.println(str1);
        System.out.println(str2);

        //Logic - good learning
        str1 = str1 + str2;
        str2 = str1.substring(0, (str1.length()-str2.length()));
        str1 = str1.substring(str2.length());

        System.out.println(str1);
        System.out.println(str2);
    }
}
