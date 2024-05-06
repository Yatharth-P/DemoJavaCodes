package org.example.JavaCodes;

public class DPInterv {
    public static void main(String[] args) {
        /*
        Input: {1,2,3,4}
        Output: {1,2,3,5}

        Input: {9,9,9}
        Output: {1,0,0,0}

        Input: {0,0,1,0}
        Output: {0,0,1,1}
        */

        int[] arr = {1,2,3,4};

        String str = "";

        for(int i=0; i< arr.length; i++)
        {
            str = str + arr[i];
        }

        str.split(",");

        int num = Integer.parseInt(str);
        System.out.println("Final num " + num+1);

    }
}
