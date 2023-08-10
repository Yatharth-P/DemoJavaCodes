package org.example.JavaCodes.Practice.Collections;

import java.util.HashSet;

public class HashSetBasic {

    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("hjqw");
        hashSet.add("kswq");
        hashSet.add("saew");
        hashSet.add("hewsw");
        hashSet.add("edww");

        String[] values = new String[hashSet.size()];

        hashSet.toArray(values);

        for(String value : values)
        {
            System.out.println(value);
        }
        System.out.println(hashSet.contains("hjqw"));
    }
}
