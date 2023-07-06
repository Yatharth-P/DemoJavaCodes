package org.example.JavaCodes.StringCodes;

public class WordCheckInString {

    public static void main(String[] args) {

        String str1 = "My name is xyz";
        String strcheck = "xyz";

        boolean stringcheck = str1.contains(strcheck);
        System.out.println("Is string check true? : " + stringcheck);
    }
}
