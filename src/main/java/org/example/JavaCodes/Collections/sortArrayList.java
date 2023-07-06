package org.example.JavaCodes.Collections;

import java.util.ArrayList;
import java.util.Collections;

public class sortArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> arrlist = new ArrayList<>();

        arrlist.add(4);
        arrlist.add(23);
        arrlist.add(6);
        arrlist.add(3);
        arrlist.add(7);

        System.out.println("Unsorted list is : " + arrlist);
        Collections.sort(arrlist);
        System.out.println("Sorted list is : " + arrlist);

    }
}
