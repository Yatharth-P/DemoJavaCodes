package org.example.JavaCodes.ArrayCodes;

public class BasicArray {
    public static void main(String args[])
    {
        //java program to copy elements of array 1 to array 2

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = new int[arr1.length];

        for(int i=0; i<arr1.length; i++)
        {
            arr2[i] = arr1[i];
        }

        for (int i=0; i<arr1.length; i++)
        {
            System.out.println("New array is " + arr2[i]);
        }
    }
}
