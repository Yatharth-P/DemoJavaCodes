package org.example.JavaCodes.Practice.ProblemSolving.Arrays;

public class PairSumCloseToZero {
    public static void main(String[] args) {

        int[] arr = {1, 3, -5, 7, 8, 20, -40, 6};

        int min = arr[0] + arr[1];
        int pairFirstIndex = 0;
        int pairSecondIndex = 1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (Math.abs(arr[j] + arr[i]) < min) {
                    pairFirstIndex = i;
                    pairSecondIndex = j;
                    min = Math.abs(arr[j] + arr[i]);
                }
            }
        }
        System.out.println("Given pair is " + arr[pairFirstIndex] + " : " + arr[pairSecondIndex]);
    }
}