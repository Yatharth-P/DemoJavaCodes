package org.example.JavaCodes.Practice.ProblemSolving.LinkedList;

import java.util.ArrayList;
import java.util.Arrays;

public class MoveAllZerosToRight {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(0,3,4,0,5,3,7,0));
        System.out.println(list);

        for (int i=0; i<list.size(); i++)
        {
            for (int j=i; j<list.size()-1; j++)
            {
                if(list.get(j) == 0)
                {
                    list.set(j,list.set(j+1, list.get(j)));
                }
            }
        }
        System.out.println(list);
    }
}
