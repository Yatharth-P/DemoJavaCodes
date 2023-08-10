package org.example.JavaCodes.Practice.ProblemSolving.Arrays;

public class SmallestAndLargestOfArray {
    public static void main(String[] args) {

        int[] array = {12,56,76,89,100,343,21,234};

        int smallest = array[0];
        int largest = array[1];

        for (int i = 0; i < array.length; i++)
        {
            if(array[i]>largest)
            {
                largest = array[i];
            }
            else if (array[i]<smallest)
            {
                smallest = array[i];
            }
        }

        System.out.println("Smallest: " + smallest);
        System.out.println("Larg" + largest);
    }
}
