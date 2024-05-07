package com.perscholas.java_basics.PA_303_7_1;

public class MiddleElementInArray {
    /*
    Write a program that returns the middle element in an array.
    Give the following values to the integer array: {13, 5, 7, 68, 2} and produce the following output: 7
     */
    public static void main(String[] args) {
        int[] numbers = new int[] {13, 5, 7, 68, 20};
        int middle = 0;
        if(numbers.length % 2 != 0){
            middle = numbers.length / 2;
            System.out.println(numbers[middle]);
        }
        else{
            middle = numbers.length / 2;
            System.out.println(numbers[middle-1] + ", " + numbers[middle]);
        }
    }
}
