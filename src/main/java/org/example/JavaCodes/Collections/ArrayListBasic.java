package org.example.JavaCodes.Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListBasic {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(4);
        arrayList.add(434);
        arrayList.add(34);
        arrayList.add(54);
        arrayList.add(7);

        System.out.println(arrayList.get(3));

        arrayList.set(1,59);

        //Iterator
        Iterator ite = arrayList.iterator();
        while(ite.hasNext())
        {
            System.out.println(" " + ite.next());
        }

        System.out.println("Arraylist is : " + arrayList);
    }
}
