package org.example.JavaCodes.Practice.ProblemSolving.Arrays;

public class PairSumEqualToGivenInt {
    public static void main(String[] args) {
        int[] a = { -40, -5, 1, 3, 6, 7, 8, 20 };
        int x = 15;

        for(int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (Math.abs(a[j] + a[i]) == x) {
                    System.out.println("Pair is : " + a[j] + " " + a[i]);
                }
            }
        }
    }
}
