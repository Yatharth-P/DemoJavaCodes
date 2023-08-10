package org.example.JavaCodes;

public class QuinceInterview {
    public static void main(String[] args) {
        //Find highest sub array
        //[1, -2, 1, 1, -2, 1]

        int[] arr = {1, -2, 1,1,1, -2, 1};

        int max = 0;
        int size = 0;
        for(int i = 0; i < arr.length; i++)
        {

            for(int j = i+1; j < arr.length; j++)
            {
                int sum = 0;
                if(arr[j]+arr[i]>sum)
                {
                    sum = arr[j]+sum;
                }
                if(sum>max)
                {
                    max = sum;
                    size = j-i;
                }
            }
        }
        System.out.println("Max Array " + max );
        System.out.println("Size " + size);
    }
}
