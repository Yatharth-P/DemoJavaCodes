package org.example.JavaCodes.Practice.Collections;

import java.util.ArrayList;

public class ArrayListToArray {
    public static void main(String[] args) {

        //list.toArray(arr);

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Henil");
        list1.add("Helu");
        list1.add("Mana");
        list1.add("Daku");
        list1.add("Neel");

        String[] arr = new String[list1.size()];

        //First logic
        list1.toArray(arr);

        for(String name : arr)
        {
            System.out.println(name);
        }

        //Second logic
        //Create the same size array and iterate over the list to push every element in array
    }
}
