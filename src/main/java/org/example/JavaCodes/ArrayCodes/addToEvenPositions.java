package org.example.JavaCodes.ArrayCodes;

public class addToEvenPositions {

    public static void main(String[] args) {
        int[] arr1 = {1,6,4,8,3,9};
        for(int number : arr1)
        {
            System.out.println("Array element : " + number);
        }

        for (int i=1; i< arr1.length; i++)
        {
            if(i%2 == 0)
            {
                arr1[i] = arr1[i] + 2;
            }
        }

        for (int num: arr1)
        {
            System.out.println("Array after addition at even places : " + num);
        }
    }
}
