package org.example.JavaCodes.Practice.ProblemSolving.Arrays;

public class SecondLargestOfAnArray {
    public static void main(String[] args) {

        int[] array = {7,5,6,1,4,2};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++)
        {
            if(array[i]>largest)
            {
                secondLargest = largest;
                largest = array[i];
            }
            else if (array[i]>secondLargest && array[i]!=largest)
            {
                secondLargest = array[i];
            }
        }
        System.out.println("secondLargest : " + secondLargest);
    }
}
