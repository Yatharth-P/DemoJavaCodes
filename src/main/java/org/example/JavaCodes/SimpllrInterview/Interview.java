package org.example.JavaCodes.SimpllrInterview;

public class Interview {

    public static void main(String[] args) {
        //Input : Square of the Array [-2, -1, 0, 1, 2]
        //Output = [0,1,1,4,4]

        int[] square = {-2,-1,0,1,2};
        int[] squareResult = new int[square.length];

        for(int i = 0; i < square.length; i++)
        {
            squareResult[i] = Math.abs(square[i])*Math.abs(square[i]);
        }

        int temp =0;
        for(int j=0; j < squareResult.length; j++)
        {
            for(int k = j+1; k<squareResult.length; k++)
            {
                if(squareResult[k]<squareResult[j])
                {
                    temp = squareResult[j];
                    squareResult[j] = squareResult[k];
                    squareResult[k] = temp;
                }
            }
        }
        for(int result : squareResult)
        {
            System.out.println(result);
        }
    }
}
