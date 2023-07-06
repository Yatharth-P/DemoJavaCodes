package org.example.JavaCodes.JavaCodes;

public class CapitalizeFirstLetter {

    public static void main(String args[])
    {
        String str1 = "my name is anthony gonsalves";
        str1 = " " + str1;

        String f = " ";

        for(int i=0; i<str1.length(); i++) {
            char ch = str1.charAt(i);
            if(ch == ' ')
            {
                f = f + str1.charAt(i);
                i = i+1;
                ch = str1.charAt(i);
                f = f + Character.toUpperCase(ch);
            }
            else
            {
                f = f+ch;
            }
        }
        f = f.trim();
        System.out.println(f);
    }
}
