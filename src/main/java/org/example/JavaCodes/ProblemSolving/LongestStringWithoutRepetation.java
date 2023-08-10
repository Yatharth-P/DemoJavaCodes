package org.example.JavaCodes.ProblemSolving;

public class LongestStringWithoutRepetation {

    public static void main(String[] args) {
        String str = "geeksforgeeks";
        System.out.println("Original string: " + str);

        String test="";

        //result
        int maxLength = -1;

        for(char c:str.toCharArray())
        {
            String current = String.valueOf(c);

            //If string already contains the character
            //then substring after repeating character
            if(test.contains(current))
            {
                test = test.substring(test.indexOf(current) + 1);
            }

            test = test + String.valueOf(c);
            maxLength = Math.max(test.length(), maxLength);
        }
        System.out.println("Longest string: " + maxLength);
    }
}
