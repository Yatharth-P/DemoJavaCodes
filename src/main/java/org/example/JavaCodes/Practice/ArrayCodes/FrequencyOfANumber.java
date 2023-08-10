package org.example.JavaCodes.Practice.ArrayCodes;

import java.util.HashMap;

public class FrequencyOfANumber {

    public static void main(String[] args) {
        int[] numbers = {3,5,2,6,2,5,3,6,3,7,3,6,5};

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i=0; i< numbers.length; i++)
        {
            if(map.containsKey(numbers[i]))
            {
                map.put(numbers[i],map.get(numbers[i])+1);
            }
            else
            {
                map.put(numbers[i],1);
            }
        }
        for (Object i : map.keySet())
        {
            if (map.get(i)>1)
            {
                System.out.println(i + " : " + map.get(i));
            }
        }

        //Using LinkedList
        /*
        List<Integer> list = new ArrayList<>();
        //Arrays.asList(numbers);

        for(int num : numbers)
        {
            list.add(num);
        }

        for(int n : list)
        {
            System.out.println("Frequency of " + n + " is " + Collections.frequency(list,n));
        }
         */
    }
}
