package org.example.JavaCodes.Practice.ProblemSolving.Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "Aa bsbs ashg".toLowerCase();
        String[] arrStr1 = str1.split("");
        String str2 = "gsha sbsb aa".toLowerCase();
        String[] arrStr2 = str2.split("");

        //Anagram logic
        List<String> list1 = new ArrayList<String>(Arrays.asList(arrStr1));
        List<String> list2 = new ArrayList<String>(Arrays.asList(arrStr2));

        Collections.sort(list1);
        Collections.sort(list2);

        System.out.println("List 1 : " + list1);
        System.out.println("List 2 : " + list2);

        boolean areListsSame = list1.equals(list2);
        System.out.println("Are lists same : " + areListsSame);

    }
}
