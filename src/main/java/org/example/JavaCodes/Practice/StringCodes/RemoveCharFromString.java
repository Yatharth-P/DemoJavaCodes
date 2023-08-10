package org.example.JavaCodes.Practice.StringCodes;

public class RemoveCharFromString {

    public static void main(String[] args) {
        String str = "My name is Anthony Gonsalves";
        str = str.toLowerCase();

        char ch = 'a';

        str = str.replaceAll(String.valueOf(ch), "");

        System.out.println("Updated " + str);
    }
}
