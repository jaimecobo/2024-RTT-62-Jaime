package com.perscholas.java_basics.GLAB_303_11_5;
import java.util.HashSet;

public class HashSet02 {
    public static void main(String[] args) {
/*
Union of Sets.
To perform the union between two sets, we can use the addAll() method.
*/
        HashSet<Integer> evenNumbers = new HashSet<>();
        evenNumbers.add(2);
        evenNumbers.add(4);
        System.out.println("HashSet1: " + evenNumbers);

        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(3);
        System.out.println("HashSet2: " + numbers);

        // Union of two set
        numbers.addAll(evenNumbers);
        System.out.println("Union is: " + numbers);
    }

}
