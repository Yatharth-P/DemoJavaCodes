package org.example.JavaCodes.JavaCodes;

import java.util.ArrayList;

public class printEvenNumbers {

    public static void main(String[] args)
    {
        int[] arr1 = {2,5,8,3,87,98};
        int arrlen = arr1.length;
        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int i=0; i<arrlen; i++)
        {
            if((arr1[i] % 2) == 0)
               arrayList.add(arr1[i]);
        }
        System.out.println("Array list having even numbers" + arrayList);
    }
}
