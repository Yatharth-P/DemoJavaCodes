package org.example.JavaCodes.Practice.ArrayCodes;

public class SecondHighestNumber {

    public static void main(String[] args) {

        int[] numbers = {6,3,8,2,9,34};
        int temp = 0;
        //sort numbers
        for(int i =0; i< numbers.length; i++)
        {
            for(int j =i+1; j< numbers.length; j++)
            {
                if(numbers[i]>numbers[j])
                {
                    temp = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = temp;
                }
            }
        }
        System.out.println("Second largest number is " + numbers[numbers.length - 2]);
    }
}
