package org.example.JavaCodes.StringCodes;

public class ReverseString {

    public static void main(String args[])
    {
        String str1 = "My name is Anthony gonsalces";
        String str2 = "";

        for(int i=str1.length()-1; i>=0; i--)
        {
            str2 = str2 + str1.charAt(i);
        }
        System.out.println("String 1 : " + str1);
        System.out.println("String 2 : " + str2);
    }
}
