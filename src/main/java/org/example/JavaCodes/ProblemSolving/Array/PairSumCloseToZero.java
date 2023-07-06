package org.example.JavaCodes.ProblemSolving.Array;

public class PairSumCloseToZero {
    public static void main(String[] args) {

        //Find pair with min sum

        int[] arr = {1, 3, -5, 7, 8, 20,-40,6};

        if(arr.length>2)
        {
            int min = arr[0] + arr[1];
            int pairFirstIndex = 0;
            int pairSecondIndex = 1;

            for(int i=0; i<arr.length; i++)
            {
                for(int j=i+1; j<arr.length; j++)
                {
                    int tempSum = arr[i] + arr[j];
                    if(Math.abs(tempSum)<Math.abs(min))
                    {
                        pairFirstIndex = i;
                        pairSecondIndex = j;
                        min = tempSum;
                    }
                }
            }
            System.out.println("The pair whose sum is close to zero "  + arr[pairFirstIndex] + " " + arr[pairSecondIndex]);
        }



    }
}
