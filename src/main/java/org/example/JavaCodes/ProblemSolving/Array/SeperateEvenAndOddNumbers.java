package org.example.JavaCodes.ProblemSolving.Array;

public class SeperateEvenAndOddNumbers {

    public static void main(String[] args) {

        int[] numbers = {12, 17, 70, 15, 22, 65, 21, 90};

        //Code to seperate even and odd numbers
        int left =0;
        int right =numbers.length-1;

        for(int i=0; i<numbers.length; i++)
        {
            while (numbers[left]%2 == 0)
            {
                left++;
            }

            while (numbers[right]%2 == 1)
            {
                right--;
            }

            if(left<right)
            {
                int temp=numbers[left];
                numbers[left]=numbers[right];
                numbers[right]=temp;
            }
        }
        for (int i=0; i<numbers.length; i++)
        {
            System.out.println("Number " + numbers[i] + "");
        }
        System.out.println();
    }
}
