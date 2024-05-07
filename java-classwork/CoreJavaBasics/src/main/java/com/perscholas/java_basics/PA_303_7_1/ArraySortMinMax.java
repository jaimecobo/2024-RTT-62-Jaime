package com.perscholas.java_basics.PA_303_7_1;

import java.util.Arrays;

public class ArraySortMinMax {
    /*
    Write a program to sort the following int array in ascending order: {4, 2, 9, 13, 1, 0}.
    Print the array in ascending order, and print the smallest and the largest element of the array.
    The output will look like the following:
    Array in ascending order: 0, 1, 2, 4, 9, 13
    The smallest number is 0
    The biggest number is 13
    */
    public static void main(String[] args) {
        int[] numbers = new int[] {4, 2, 9, 13, 1, 0};
        Arrays.sort(numbers);
        System.out.println("Array in ascending order: " + Arrays.toString(numbers));
        System.out.println("The smallest number is " + numbers[0]);
        System.out.println("The biggest number is " + numbers[numbers.length-1]);
    }
}
