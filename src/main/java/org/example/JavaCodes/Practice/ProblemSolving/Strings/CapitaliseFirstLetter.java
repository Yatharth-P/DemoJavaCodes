package org.example.JavaCodes.Practice.ProblemSolving.Strings;

public class CapitaliseFirstLetter {

    public static void main(String[] args) {
        String str = "My name is Anthony Gonsalves".toLowerCase();
        String str2 = "";
        str = " " + str;

        System.out.println("String after space at first place : " + str);

        for(int i = 0; i<str.length(); i++)
        {
            if(str.charAt(i) == ' ' )
            {
                str2 = str2 + str.charAt(i);
                i = i+1;
                str2 = str2 + Character.toUpperCase(str.charAt(i));
            }
            else
            {
                str2 = str2 + str.charAt(i);
            }
        }
        System.out.println("After capitalizing : " + str2);
    }
}
