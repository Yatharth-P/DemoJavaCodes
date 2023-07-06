package org.example.JavaCodes.ProblemSolving.Array;

public class RemoveDuplicatesFromSortedArray {
    //Remopving duplicates from a sorted array
    public static void main(String[] args) {
        int[] arr = {10,20,20,30,30,40,50,50};

        int j=0;
        for(int i=1;i<arr.length-1;i++)
        {
            if(arr[i]!=arr[i+1])
            {
                arr[j++] = arr[i];
            }
        }
        arr[j++] = arr[arr.length-1];
    }
}
