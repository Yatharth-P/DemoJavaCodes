package org.example.JavaCodes.Practice.ProblemSolving.Arrays;

public class LeftShiftArray {

    public static void main(String[] args) {

        int[] arr1 = {1,5,3,3,6};

        int shiftTimes = 3;
        for(int i = 0; i < shiftTimes; i++)
        {
            int first = arr1[0];
            for(int j = 0; j < arr1.length-1; j++)
            {
                arr1[j] = arr1[j+1];
            }
            arr1[arr1.length-1] = first;
        }

        for(int num : arr1)
        {
            System.out.println(num);
        }
    }
}
