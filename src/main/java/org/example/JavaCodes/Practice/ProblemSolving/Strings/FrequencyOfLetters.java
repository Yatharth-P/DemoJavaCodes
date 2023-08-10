package org.example.JavaCodes.Practice.ProblemSolving.Strings;

public class FrequencyOfLetters {

    public static void main(String[] args) {
        String str = "My name is Anthony Gonsalves".toLowerCase();

        for(char c = 'a'; c<='z' ; c++)
        {
            int count =0;
            for(int i = 0;i<str.length();i++)
            {
                if (c == str.charAt(i))
                {
                    count++;
                }
            }
            System.out.println("Count of " + c + " is " + count);
        }
    }
}
