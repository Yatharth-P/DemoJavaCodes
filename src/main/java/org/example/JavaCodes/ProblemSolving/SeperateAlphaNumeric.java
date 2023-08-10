package org.example.JavaCodes.ProblemSolving;

public class SeperateAlphaNumeric {
    public static void main(String[] args) {

        String str = "Java234T567point890@#!!";

        StringBuilder alpha = new StringBuilder();
        StringBuilder num = new StringBuilder();
        StringBuilder special = new StringBuilder();

        for(int i=0; i<str.length(); i++)
        {
            if(Character.isDigit(str.charAt(i)))
            {
                num.append(str.charAt(i));
            }
            else if(Character.isLetter(str.charAt(i)))
            {
                alpha.append(str.charAt(i));
            }
            else {
                special.append(str.charAt(i));
            }
        }
        System.out.println("Alpha: " + alpha.toString());
        System.out.println("Num: " + num.toString());
        System.out.println("Special: " + special.toString());
    }
}
