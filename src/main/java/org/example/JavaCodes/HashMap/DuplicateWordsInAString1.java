package org.example.JavaCodes.HashMap;

import java.util.HashMap;
import java.util.Set;

public class DuplicateWordsInAString1 {

    public static void main(String[] args) {

        String str = "My name is Anthony Gonsalves is name name name is is";
        String[] words = str.split(" ");

        HashMap<String,Integer> wordCount = new HashMap<String,Integer>();

        int count = 1;

        for(String word : words)
        {
            if(wordCount.containsKey(word))
            {
                wordCount.put(word,wordCount.get(word) + 1);
            }
            else
            {
                wordCount.put(word,count);
            }
        }

        Set<String> keySet = wordCount.keySet();
        for(String key : keySet)
        {
            System.out.println(key + ": " + wordCount.get(key));
        }
    }
}
