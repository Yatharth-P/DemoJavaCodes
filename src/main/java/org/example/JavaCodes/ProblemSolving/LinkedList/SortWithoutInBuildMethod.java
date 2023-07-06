package org.example.JavaCodes.ProblemSolving.LinkedList;

import java.util.ArrayList;
import java.util.Arrays;

public class SortWithoutInBuildMethod {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10010, 5,4,6,3));

        System.out.println("List before : " + list);

        for(int i=0; i< list.size(); i++)
        {
            for(int j=i+1; j<list.size(); j++)
            {
                if(list.get(i)>list.get(j))
                {
                    list.set(j,list.set(i, list.get(j)));
                }
            }
        }
        System.out.println("List after : " + list);
    }
}
