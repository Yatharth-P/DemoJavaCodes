package org.example.JavaCodes.StringCodes;

public class FrequencyOfaLetter {

    public static void main(String args[])
    {
        String str1 = "My name is Anthony Gonsalves";
        str1 = str1.toLowerCase();
        char a = 'a';
        int count = 0;
        for (int i = 0; i<str1.length(); i++)
        {
            if(str1.charAt(i) == a)
            {
                count++;
            }
        }
        System.out.println("Total count of char " + a + " is " + count);
    }
}
