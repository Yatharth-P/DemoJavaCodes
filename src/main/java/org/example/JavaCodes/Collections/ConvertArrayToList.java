package org.example.JavaCodes.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ConvertArrayToList {

    public static void main(String[] args) {

        String arr1[] = {"Genik", "Sgupra", "Komal", "Tanuds", "himhs"};
        ArrayList<String> arrayList = new ArrayList<>();

        Collections.addAll(arrayList,arr1);

        System.out.println(arrayList);


    }
}
