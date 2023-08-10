package org.example.JavaCodes.Practice.ProblemSolving.Strings;

public class AllSubStringsOfAString {
    public static void main(String[] args) {

        String str = "mynab";

        for(int i = 0; i <str.length(); i++)
        {
            for(int j = i+1; j<str.length(); j++)
            {
                System.out.println("Substring " + str.substring(i,j));
            }
        }
    }
}
