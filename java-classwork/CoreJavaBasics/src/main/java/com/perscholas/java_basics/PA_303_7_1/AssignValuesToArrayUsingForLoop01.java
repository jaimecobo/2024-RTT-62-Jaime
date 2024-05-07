package com.perscholas.java_basics.PA_303_7_1;

import java.util.Arrays;

public class AssignValuesToArrayUsingForLoop {
    /*
    Task 5: Write a program where you create an integer array with a length of 5.
    Loop through the array and assign the value of the loop control variable (e.g., i) to the corresponding index in the array.
     */
    public static void main(String[] args) {
        int[] numbers = new int[5];
        for(int i=1; i < numbers.length; i++){
            numbers[i] = i;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
