package org.example.JavaCodes.Practice.StringCodes;

public class CountNoOfWords {

    public static void main(String[] args) {

        String str = " My name is    Anthony     gonsalves";
        str = str.toLowerCase();

        /* Normal logic
        String[] words = str.split(" ");
        System.out.println("Total words: " + words.length);
         */

        int words = 0;
        for(int i = 0; i<str.length(); i++)
        {
            if(str.charAt(i) == ' ' && str.charAt(i+1) != ' ')
            {
                words++;
            }

            else if(str.charAt(i) == ' ' && str.charAt(i+1) == ' ')
            {
                i++;
            }

            if(i == str.length()-1)
            {
                words++;
            }
        }
        System.out.println("Total words: " + words);
    }
}
