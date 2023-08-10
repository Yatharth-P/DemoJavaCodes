package org.example.JavaCodes.Practice.ArrayCodes;

public class AddToEvenPostions {

    public static void main(String[] args) {

        int[] numbers = {3,6,3,8,2,9,34};

        for (int i = 1; i < numbers.length; i=i+2)
        {
            numbers[i] = numbers[i] +2;
        }

        for(int num:numbers)
        {
            System.out.println(num);
        }
    }
}
