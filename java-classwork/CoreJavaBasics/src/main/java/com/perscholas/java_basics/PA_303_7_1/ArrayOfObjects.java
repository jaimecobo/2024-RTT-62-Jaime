package com.perscholas.java_basics.PA_303_7_1;

import java.util.Arrays;

public class ArrayOfObjects {
    /*
        Task 10: Create an array that includes an integer, 3 strings, and 1 double. Print the array.
    */
    public static void main(String[] args) {
        Object[] objects = new Object[] {8, "Java", "Programming", "Language", 22.2};
        System.out.println(Arrays.toString(objects));
    }
}
