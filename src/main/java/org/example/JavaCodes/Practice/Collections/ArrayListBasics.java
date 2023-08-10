package org.example.JavaCodes.Practice.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListBasics {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(4);
        arrayList.add(434);
        arrayList.add(34);
        arrayList.add(54);
        arrayList.add(7);

        System.out.println(arrayList);

        Iterator ite = arrayList.iterator();

        while(ite.hasNext())
        {
            System.out.println(ite.next());
        }

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("Henil");
        arrayList2.add("gandy");
        arrayList2.add("gsf");
        arrayList2.add("dhairya");
        arrayList2.add("VendaG");

        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Komal");
        arrayList1.add("Deeya");
        arrayList1.add("Chintu");
        arrayList1.add("yash");
        arrayList1.add("gaursav");
        
        //Merging list
        System.out.println("Merging lists");

        arrayList2.addAll(arrayList1);
        System.out.println(arrayList2);

        System.out.println("Add same list" + arrayList2.addAll(arrayList2));
        System.out.println(arrayList2);

    }
}
