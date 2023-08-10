package org.example.JavaCodes.Practice.ProblemSolving.Arrays;

public class SortIntArray {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 67, 4, 5,34 ,7,89 };
        int temp;
        for(int i=0; i<numbers.length; i++)
        {
            for(int j=i+1; j<numbers.length; j++)
            if(numbers[i]>numbers[j])
            {
                temp = numbers[i];
                numbers[i] = numbers[j];
                numbers[j] = temp;
            }
        }

        for(int num: numbers)
        {
            System.out.println(num);
        }
    }
}
