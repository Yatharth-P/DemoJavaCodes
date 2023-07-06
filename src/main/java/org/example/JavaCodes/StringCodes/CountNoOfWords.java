package org.example.JavaCodes.StringCodes;

public class CountNoOfWords {

    public static void main(String args[])
    {
        String str1 = " My name is Anthony gonsalves   jh oiqw     jkqsk";
        str1 = str1.toLowerCase();

        /* Ideal situation
        String strarr[] = str1.split(" ");
        System.out.println("No of words is equal to : " + strarr.length);
         */

        //If multiple white spaces are present
        int strEnd = str1.length()-1;
        int words = 0;
        for(int i=0; i<str1.length()-1; i++)
        {
            if(str1.charAt(i) == ' ' && str1.charAt(i+1) != ' ')
            {
                words++;
            }
            else if (str1.charAt(i) == ' ' && str1.charAt(i+1) == ' ')
            {
                i++;
            }
            else if (i==strEnd)
            {
                words++;
            }
        }
        System.out.println("Total number of words is + " + words);
    }
}
