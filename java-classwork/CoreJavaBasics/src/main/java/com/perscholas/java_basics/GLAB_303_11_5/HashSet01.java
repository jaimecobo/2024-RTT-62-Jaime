package com.perscholas.java_basics.GLAB_303_11_5;

import java.util.HashSet;

public class HashSet01 {
    public static void main(String[] args) {
/*
Insert Elements to HashSet using addAll().
addAll() - Inserts all of the elements of the specified collection to the set.
*/
        HashSet<Integer> evenNumber = new HashSet<>();
        // Using add() method
        evenNumber.add(2);
        evenNumber.add(4);
        evenNumber.add(6);
        System.out.println("HashSet: " + evenNumber);

        HashSet<Integer> numbers = new HashSet<>();
        // Using addAll() method
        numbers.addAll(evenNumber);
        numbers.add(5);
        System.out.println("New HashSet: " + numbers);
    }

    }
