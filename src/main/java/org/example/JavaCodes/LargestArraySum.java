package org.example.JavaCodes;

public class LargestArraySum {
    public static void main(String[] args) {

        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};

        int max = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int i = 0; i < nums.length; i++)
        {
            currentSum = currentSum + nums[i];

            if(currentSum>max)
            {
                max = currentSum;
            }

            if(currentSum<0)
            {
                currentSum = 0;
            }
        }

        System.out.println("Max sum is " + max);
    }
}
