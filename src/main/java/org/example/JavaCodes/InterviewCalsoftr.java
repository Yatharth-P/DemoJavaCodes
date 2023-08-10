package org.example.JavaCodes;

import java.util.Arrays;
import java.util.HashSet;

public class InterviewCalsoftr {

    public static void main(String[] args) {

        String[] str = {"john tom", "john mary","john tom","mary anna","mary anna"};

        HashSet<String> set = new HashSet<>(Arrays.asList(str));

        System.out.println("Unique pairs count is " + set.size());
    }
}
