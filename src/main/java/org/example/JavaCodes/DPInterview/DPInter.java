package org.example.JavaCodes.DPInterview;

public class DPInter {
    public static void main(String[] args) {

        /*
        input: {12, 13, 23, 16, 24, 19}

        output: {13, 23, 19, 12, 16, 24}
        */

        int[] arr = {12, 13, 23, 16, 24, 19};
        int left=0;
        int right = arr.length-1;


        for(int num : arr)
        {
            System.out.println(num);
        }

        while(left < right)
        {
            while(isPrime(arr[left]))
            {
                left++;
            }

            while(!isPrime(arr[right]))
            {
                right--;
            }

            if(!isPrime(left) && isPrime(right))
            {
                arr[right] = arr[right] + arr[left];  // a + b
                arr[left] = arr[right] - arr[left];   // a-b
                arr[right] = arr[right] - arr[left];
                left++;
                right--;
            }

        }

        System.out.println("Test");

        for(int num : arr)
        {
            System.out.println(num);
        }
    }

    public static boolean isPrime(int num)
    {
        boolean isPr = true;
        for(int i = 2; i < num/2; i++)
        {
            if(num%i == 0)
            {
                return false;
            }
        }
        return isPr;
    }
}
