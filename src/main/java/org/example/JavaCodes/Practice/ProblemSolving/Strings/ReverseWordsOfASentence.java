package org.example.JavaCodes.Practice.ProblemSolving.Strings;

public class ReverseWordsOfASentence {

    public static void main(String[] args) {

        String str = "My name is Anthony Gonsalves".toLowerCase();
        String[] words = str.split(" ");

        String reversedSentence = "";

        for (int i = 0; i < words.length; i++)
        {
            String reversedWord = "";
            for(int j = words[i].length()-1; j >=0 ; j--)
            {
                reversedWord = reversedWord + words[i].charAt(j);
            }
            reversedSentence = reversedSentence + reversedWord + " ";
        }
        System.out.println("Reversed sentence is : " + reversedSentence);
    }
}
