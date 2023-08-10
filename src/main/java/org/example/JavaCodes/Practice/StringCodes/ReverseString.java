package org.example.JavaCodes.Practice.StringCodes;

public class ReverseString {

    public static void main(String[] args) {
        String str = "My name is Anthony";

        String str2 = "";

        for (int i = 0; i <str.length(); i++)
        {
            str2 = str2 + str.charAt(str.length()-1-i);
        }

        System.out.println("Before : " + str);
        System.out.println("After : " + str2);
    }
}
