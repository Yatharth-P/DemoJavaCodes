package org.example.JavaCodes.Practice.ProblemSolving.LinkedList;

import java.util.ArrayList;
import java.util.Arrays;

public class SortWithoutInBuiltMethod {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10010, 5,4,6,3));
        System.out.println(list);

        for (int i =0; i < list.size(); i++)
        {
            for (int j=i+1; j < list.size(); j++)
            {
                if(list.get(i)>list.get(j))
                {
                    list.set(j,list.set(i,list.get(j)));
                }
            }
        }
        System.out.println(list);
    }
}
