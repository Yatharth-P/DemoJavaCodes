package org.example.JavaCodes.Practice.ProblemSolving.Strings;

import java.util.Arrays;
import java.util.HashSet;

public class AllCharsUniqueHashMap {

    public static void main(String[] args) {
        String str1 = "my nae iss".toLowerCase().replaceAll(" ", "");
        String[] chars = str1.split("");
        HashSet<String> hashSet = new HashSet<String>(Arrays.asList(chars));

        if(hashSet.size() == chars.length)
        {
            System.out.println("AllCharsUnique");
        }
        else
        {
            System.out.println("AllCharsUnique Not");
        }
    }
}
