package org.example.JavaCodes.Practice.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayToList {
    public static void main(String[] args) {

        //Collections.addAll(list,arr);

        String arr1[] = {"Genik", "Sgupra", "Komal", "Tanuds", "himhs"};

        ArrayList<String> arr = new ArrayList<String>(Arrays.asList(arr1));

        Collections.addAll(arr, arr1);
        System.out.println(arr);
    }
}
