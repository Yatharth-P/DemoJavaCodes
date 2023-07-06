package org.example.JavaCodes.BLInterview;

import java.util.HashMap;

public class Interview {
    public static void main(String[] args) {

        String str = "Nandini".toLowerCase();
        char[] letter = str.toCharArray();

        HashMap<Character, Integer> letterCount = new HashMap<Character, Integer>();

        for(char c : letter)
        {
            if(letterCount.containsKey(c))
            {
                letterCount.put(c, letterCount.get(c) + 1);
            }
            else
            {
                letterCount.put(c,1);
            }
        }

        System.out.println(letterCount);
    }
}
