package org.example.JavaCodes.JavaCodes;

public class ReverseWordsOfaSentence {

    public static void main(String args[])
    {
        String str1 = "My name is Yatharth Pandya";
        String reversedSentence = "";
        String words[] = str1.split(" ");
        int totalWords = words.length;

        for(int i=0; i<totalWords; i++)
        {
            //String word = words[i];
            String reversedWord = "";
            for(int j=words[i].length()-1; j>=0; j--)
            {
                reversedWord = reversedWord + words[i].charAt(j);
            }
            reversedSentence = reversedSentence + reversedWord + " ";
        }
        System.out.println("Reversed sentence is " + reversedSentence);

    }
}
