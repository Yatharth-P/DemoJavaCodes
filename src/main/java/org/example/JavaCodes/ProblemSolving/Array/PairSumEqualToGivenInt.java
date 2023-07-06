package org.example.JavaCodes.ProblemSolving.Array;

public class PairSumEqualToGivenInt {

    public static void main(String[] args) {

        int[] a = { -40, -5, 1, 3, 6, 7, 8, 20 };

        int x = 15;

        if(a.length>2)
        {
            for(int i=0; i<a.length; i++)
            {
                for(int j=i+1; j<a.length; j++)
                {
                    if(Math.abs(a[i]+a[j]) == x)
                    {
                        System.out.println(a[i]+" "+a[j]);
                    }
                }
            }
        }
    }
}
