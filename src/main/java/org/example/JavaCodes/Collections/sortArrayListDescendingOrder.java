package org.example.JavaCodes.Collections;

import java.util.ArrayList;
import java.util.Collections;

public class sortArrayListDescendingOrder {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Manas");
        arrayList.add("Yash");
        arrayList.add("Vibek");
        arrayList.add("Paul");
        arrayList.add("Suchi");

        System.out.println("Given list is : " + arrayList);

        Collections.sort(arrayList);
        System.out.println("List after sorting : " + arrayList);

        Collections.reverse(arrayList);
        System.out.println("List after sorting ulta : " + arrayList);
    }
}
