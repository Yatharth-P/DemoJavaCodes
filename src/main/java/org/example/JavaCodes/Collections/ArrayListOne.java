package org.example.JavaCodes.Collections;

import java.util.ArrayList;

public class ArrayListOne {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Henil");
        arrayList.add("gandy");
        arrayList.add("gsf");
        arrayList.add("dhairya");
        arrayList.add("VendaG");

        for (String name : arrayList)
        {
            System.out.println(name);
        }

        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Komal");
        arrayList1.add("Deeya");
        arrayList1.add("Chintu");
        arrayList1.add("yash");
        arrayList1.add("gaursav");

        System.out.println("Merging lists");
        System.out.println(arrayList.addAll(arrayList1));
        System.out.println("New array list is : " + arrayList);

        System.out.println(arrayList.addAll(arrayList));
        System.out.println("New array list is : " + arrayList);

        boolean xyz = arrayList.removeAll(arrayList1);
        System.out.println(arrayList);
    }
}
