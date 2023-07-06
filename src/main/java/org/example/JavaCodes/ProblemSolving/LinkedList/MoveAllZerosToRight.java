package org.example.JavaCodes.ProblemSolving.LinkedList;

import java.util.ArrayList;
import java.util.Arrays;

public class MoveAllZerosToRight {

    public static void main(String[] args) {
        //[3,0,0,5,0,1,0,0,0,0,4,0,0,0,2,0,0]

        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(0,3,4,0,5,3,7,0));

        System.out.println("Initial list is " + list);

        for(int i = 0; i < list.size(); i++)
        {
            for(int j = i; j < list.size()-1; j++)
            {
                if(list.get(j) == 0)
                {
                    list.set(j,list.set(j+1, list.get(j)));
                }
            }
        }
        System.out.println("Latest list is " + list);
    }
}
