package com.perscholas.java_basics.PA_303_7_1;

import org.w3c.dom.ls.LSOutput;

public class TestingArrayIndex {
    /*
    Write a program that creates an integer array with 5 elements (i.e., numbers).
    The numbers can be any integers.  Print out the value at the first index and the last index using length - 1 as the index.
    Now try printing the value at index = length (e.g., myArray[myArray.length] ).  Notice the type of exception which is produced.
    Now try to assign a value to the array index 5. You should get the same type of exception.
    */
    public static void main(String[] args) {
        int[] numbers = new int[] {9, 18, 27, 36, 45};
        System.out.println("The first element in the array is: " + numbers[0]);
        System.out.println("The last element in the array is: " + numbers[numbers.length-1]);
//        System.out.println("The element at index = length in the array is: " + numbers[numbers.length]);  // This will create an out of bounds exception
//        numbers[5] = 54;    // This will create an out of bounds exception


    }

}
