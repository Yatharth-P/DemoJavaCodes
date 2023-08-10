package org.example.JavaCodes.JavaCodes;

public class Palindrome {

    public static void main(String args[])
    {
        String str1 = "Awadadawa";
        str1 = str1.toLowerCase();
        String str3 = "";

        for(int i=str1.length()-1; i>=0; i--)
        {
            str3 = str3 + str1.charAt(i);
        }

        System.out.println("Palindrome" + str1.equals(str3));
    }
}
