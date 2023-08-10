package org.example.JavaCodes.Practice.ProblemSolving.Strings;

public class PrintEvenNumbers {
    public static void main(String[] args) {

        int[] numbers = {2,4,5,3,8,34,53,98};

        for(int i = 0; i < numbers.length; i++)
        {
            if(numbers[i]%2 ==0)
            {
                System.out.println(numbers[i]);
            }
        }
    }
}
