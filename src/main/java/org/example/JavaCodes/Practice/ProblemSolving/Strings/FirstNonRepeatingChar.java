package org.example.JavaCodes.Practice.ProblemSolving.Strings;

public class FirstNonRepeatingChar {

    public static void main(String[] args) {

        String str = "My name is Anthony Gonsalves".toLowerCase().replaceAll(" ", "");
        boolean isUniquePresent = false;

        for(int i=0; i<str.length(); i++)
        {
                if(str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i)))
                {
                    isUniquePresent = true;
                    System.out.println("Char " + str.charAt(i) + " is unique");
                    break;
                }
        }
    }
}
