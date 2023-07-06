package org.example.JavaCodes.Collections;

import java.util.HashSet;

public class HashSetBasic {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("hjqw");
        hashSet.add("kswq");
        hashSet.add("saew");
        hashSet.add("hewsw");
        hashSet.add("edww");

        String[] strings = new String[hashSet.size()];
        hashSet.toArray(strings);
    }
}
