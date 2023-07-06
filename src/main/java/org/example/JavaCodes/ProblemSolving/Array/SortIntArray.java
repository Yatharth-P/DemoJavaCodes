package org.example.JavaCodes.ProblemSolving.Array;

public class SortIntArray {

    public static void main(String[] args) {
        int[] arr = new int[] {78, 34, 1, 3, 90, 34};

        //Sort array

        for(int num : arr)
        {
            System.out.println(" " + num);
        }

        System.out.println("_____________");

        for(int i = 0; i < arr.length; i++)
        {
            for(int j=i+1; j< arr.length; j++)
            {
                if(arr[i]>arr[j])
                {
                    arr[i] = arr[i] + arr[j];
                    arr[j] = arr[i] - arr[j];
                    arr[i] = arr[i] - arr[j];
                }
            }
        }
        for(int num1 : arr)
        {
            System.out.println(" " + num1);
        }
    }
}
