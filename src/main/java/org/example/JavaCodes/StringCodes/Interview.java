package org.example.JavaCodes.StringCodes;

public class Interview {

    public static void main(String[] args) {

        int[] number = {3,2,8,56,87};
        int temp = 0;

        for(int i = 0; i < number.length; i++)
        {
            for(int j =i+1; j < number.length; j++)
            {
                if(number[j]>number[i])
                {
                    temp = number[j];
                    number[j] = number[i];
                    number[i] = temp;
                }
            }
        }

        for(int x: number)
        {
            System.out.println("Elements are : " + x);
        }

        System.out.println("Second largest element is : " + number[1]);
    }
}
