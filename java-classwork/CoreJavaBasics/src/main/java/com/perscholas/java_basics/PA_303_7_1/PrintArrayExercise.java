package com.perscholas.java_basics.PA_303_7_1;

import java.util.Arrays;

public class PrintArrayExercise {
    /*
    Write a program that creates an array of integers with a length of 3.
    Assign the values 1, 2, and 3 to the indexes. Print out each array element.
    */
    public static void main(String[] args) {
        int[] numbers = new int[] {1, 2, 3};
        System.out.print("[");
        for(int i = 0; i < numbers.length; i++) {
            if (i != numbers.length - 1) {
                System.out.print(numbers[i] + ", ");
            } else {
                System.out.println(numbers[i] + "]");
            }
        }

        System.out.print("[");
        for(int i = 0; i < numbers.length; i++){
            if(i == numbers.length-1) {
                System.out.println(numbers[i] + "]");
            }else{
                System.out.print(numbers[i] + ", ");
            }
        }

        System.out.println(Arrays.toString(numbers));

    }
}
