package org.example.JavaCodes.Practice.StringCodes;

public class FrequencyOfALetter {

    public static void main(String[] args) {
        String str = "My name is Anthony Gonsalves";

        char ch = 'a';
        int count =0;
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == ch)
            {
                count++;
            }
        }

        System.out.println(ch + " is present  " + count + " times");
    }
}
