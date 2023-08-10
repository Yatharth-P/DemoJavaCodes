package org.example.JavaCodes.ProblemSolving.Array;

public class LeadersOfAnArray {

    public static void main(String[] args) {
        int[] array = {5,3,56,7,3,6};

        for(int i = 0; i < array.length; i++)
        {
            for(int j = i+1;j<array.length; j++)
            {
                if(array[j]>array[i])
                {
                    break;
                }
                if(j==array.length-1)
                {
                    System.out.println(array[i]);
                }
            }
        }
        System.out.println(array[array.length-1]);
    }
}
