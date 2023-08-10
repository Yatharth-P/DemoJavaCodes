package org.example.JavaCodes.Practice.ProblemSolving.Strings;

public class AllCharsUnique {

    public static void main(String[] args) {

        String str = "my nae is".replaceAll(" ", "");
        String[] chars = str.split("");
        boolean isUnique = true;

        for(int i = 0; i < chars.length; i++)
        {
            if(str.indexOf(chars[i]) != str.lastIndexOf(chars[i]))
            {
                isUnique = false;
                break;
            }
        }
        if(isUnique)
        {
            System.out.println("AllCharsUnique");
        }
        else {
            System.out.println("AllCharsNotUnique");
        }
    }
}
