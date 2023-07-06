package org.example.JavaCodes.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapBasics {

    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<Integer,String>();
        //HashMap map = new HashMap<>();

        map.put(101, "Jalak");
        map.put(102, "hak");
        map.put(103, "Ja");
        map.put(104, "jhdsaa");
        map.put(105, "ak");

        System.out.println("Map is : " + map);

        System.out.println("Value for given key : " + map.get(104));

        //map.remove(105);
        System.out.println(map);

        System.out.println("Contains key example " + map.containsKey(102));

        System.out.println("Contains value example " + map.containsValue("Jalak"));

        System.out.println("Is hashmap empty : " +map.isEmpty());

        System.out.println("All keys SET" + map.keySet());

        System.out.println("All values Collection : " + map.values());

        //Entry Set
        System.out.println("Entry Set : " +map.entrySet());

        for(Object i: map.keySet())
        {
            System.out.println(i + " " + map.get(i));
        }

        //Entry interface methods
        for(Map.Entry entry : map.entrySet())
        {
            System.out.println(entry.getKey() + "  " + entry.getValue());
        }

        //Iterator
        Set set = map.entrySet();
        Iterator itr = set.iterator();

        while (itr.hasNext()) {
            Map.Entry entry = (Map.Entry) itr.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
