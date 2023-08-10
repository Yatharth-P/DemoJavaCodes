package org.example.JavaCodes.StringCodes;

import java.util.HashMap;
import java.util.Set;

public class QuinceInterview1 {
    public static void main(String[] args) {
        //inmxe
        //xnime
        //str1 = "bcadeh" str2 = "hea"

        String str1 = "bcadeh";
        String[] strchar1 = str1.split("");
        String str2 = "hea";
        String[] strchar2 = str2.split("");

        HashMap<String,Integer> map1 = new HashMap<>();
        HashMap<String,Integer> map2 = new HashMap<>();

        for(String chars : strchar1)
        {
            if(map1.containsKey(chars))
            {
                map1.put(chars,map1.get(chars)+1);
            }
            else
            {
                map1.put(chars,1);
            }
        }

        for(String chars : strchar2)
        {
            if(map2.containsKey(chars))
            {
                map2.put(chars,map2.get(chars)+1);
            }
            else
            {
                map2.put(chars,1);
            }
        }

        System.out.println("Map 1 :" +map1);
        System.out.println("Map 2: " +map2);

        Set<String> keys1 = map1.keySet();
        Set<String> keys2 = map2.keySet();

        if(keys1.size()> keys2.size())
        {
            for(String i : keys2)
            {
                if(!keys1.contains(i) && keys2.contains(i))
                {
                    map1.remove(i);
                }
            }
        }

        System.out.println("Map 1 :" +map1);
        System.out.println("Map 2: " +map2);
    }
}
