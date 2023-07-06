package org.example.JavaCodes.ArrayCodes;

import java.util.ArrayList;
import java.util.Collections;

public class frequencyOfANumber {

    public static void main(String[] args) {

        int[] arr1 = {1,5,2,65,1,76,34,87,67,76,5,65,23,65,34,65};
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int num : arr1)
        {
            arrayList.add(num);
        }

        for (int n : arrayList)
        {
            System.out.println("Frequency of element " + n + " is : "  + Collections.frequency(arrayList, n));
        }
    }
}
