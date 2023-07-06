package org.example.JavaCodes.ProblemSolving.Array;

public class PairSumCloseToX {

    public static void main(String[] args) {

        //array[]={-40,-5,1,3,6,7,8,20};
        int[] array={-40,-5,1,3,6,7,8,20};
        int x =5;

        if(array.length>2)
        {
            int minDiff = Math.abs(array[0] + array[1] - x);
            int pairFirst = 0;
            int pairSecond = 1;

            for(int i=0;i<array.length;i++)
            {
                for(int j=i+1;j<array.length;j++)
                {
                    int tempDiff = Math.abs(array[i] + array[j] - x);
                    if(tempDiff<minDiff)
                    {
                        pairFirst = i;
                        pairSecond = j;
                        minDiff = tempDiff;
                    }
                }
            }
            System.out.println("pairFirst: " + array[pairFirst] + " pairSecond: " + array[pairSecond]);
        }
    }
}
