package com.perscholas.java_basics.PA_303_7_1;

import java.util.Arrays;

public class PrintAndCloneArray {
    /*
    Write a program that creates an array of String type and initializes it with the strings “red,” “green,” “blue,” and “yellow.”
    Print out the array length. Make a copy using the clone( ) method.
    Use the Arrays.toString( ) method on the new array to verify that the original array was copied.
    */
    public static void main(String[] args) {
        String[] colors = new String[] {"red", "green", "blue", "yellow"};
        System.out.println("The array length is: " + colors.length);
        String[] clonedColors = colors.clone();
        System.out.println("The colors array is: " + Arrays.toString(colors) + ", and the cloned array is: " + Arrays.toString(clonedColors));
    }
}
