package org.example.JavaCodes.Practice.ProblemSolving.Arrays;

public class PairSumCloseToGivenInt {

    public static void main(String[] args) {

        int[] array={-40,-5,1,3,6,7,8,20};
        int x = 5;

        int min = Math.abs(array[0] + array[1]-x);
        int pairFirstIndex = 0;
        int pairSecondIndex = 1;

        for (int i = 0; i < array.length; i++)
        {
            for(int j = i+1; j < array.length; j++)
            {
                if(Math.abs(array[j]+array[i] - x) < min)
                {
                    min = Math.abs(array[j]+array[i] - x);
                    pairFirstIndex = i;
                    pairSecondIndex = j;
                }
            }
        }
        System.out.println("Pair is " + array[pairFirstIndex] + " and " + array[pairSecondIndex]);
    }
}
