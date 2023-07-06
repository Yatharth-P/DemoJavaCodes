package org.example.JavaCodes.StringCodes;

public class RemoveCharFromString {
    public static void main(String args[])
    {

        String str1 = "My name is Anthony gonsalves.";
        char ch = 'a';
        System.out.println("Before - " + str1);
        str1 = str1.replaceAll(String.valueOf(ch), " ");
        System.out.println("After - " + str1);

    }
}
