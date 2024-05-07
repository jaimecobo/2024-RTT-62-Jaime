package com.perscholas.java_basics.PA_303_7_1;

import java.util.Arrays;

public class ArraySwappingElements {
    /*
    Write a program that creates a String array of 5 elements and swaps the first element with the middle element without creating a new array.
    */
    public static void main(String[] args) {
        String[] positions = new String[]{"First", "Second", "Third", "Fourth", "Fifth"};
        String carrier = positions[0];
        positions[0] = positions[positions.length/2];
        positions[positions.length/2] = carrier;
        System.out.println(Arrays.toString(positions));
    }
}
