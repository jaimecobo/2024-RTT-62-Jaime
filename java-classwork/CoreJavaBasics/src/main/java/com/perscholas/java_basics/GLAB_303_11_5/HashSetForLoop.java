package com.perscholas.java_basics.GLAB_303_11_5;

import java.util.HashSet;

public class HashSetForLoop {
/*
Remember: HashSet DOES NOT maintain any order, so this order might be changed if you run your code a second time.
 */
    public static void main(String args[]) {
        // HashSet declaration
        HashSet<String> hset = new HashSet<String>();

        // Adding elements to the HashSet
        hset.add("Apple");
        hset.add("Mango");
        hset.add("Grapes");
        hset.add("Orange");
        hset.add("Fig");
        //Addition of duplicate elements
        hset.add("Apple");
        hset.add("Mango");
        //Addition of null values
        hset.add(null);
        hset.add(null);
    }

}
