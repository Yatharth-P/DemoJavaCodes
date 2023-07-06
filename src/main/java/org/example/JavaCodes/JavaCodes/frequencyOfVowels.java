package org.example.JavaCodes.JavaCodes;

import java.sql.SQLOutput;
import java.util.Locale;

public class frequencyOfVowels {

    public static void main(String args[])
    {
        int a = 0;
        int e = 0;
        int i = 0;
        int o = 0;
        int u = 0;

        String str1 = " Henil works in an MNC";
        str1 = str1.toLowerCase();

        for(int j=0; j<str1.length(); j++)
        {
            if(str1.charAt(j) == 'a')
                a = a+1;

            if (str1.charAt(j)=='e')
                e = e+1;

            if (str1.charAt(j)=='i')
                i = i+1;

            if (str1.charAt(j)=='o')
                o = o+1;

            if (str1.charAt(j)=='u')
                u = u+1;
        }
        System.out.println("A : " + a);
        System.out.println("E : " + e);
        System.out.println("I : " + i);
        System.out.println("O : " + o);
        System.out.println("U : " + u);

        System.out.println(str1.toLowerCase().matches(".*[aeiou]*."));
    }
}
