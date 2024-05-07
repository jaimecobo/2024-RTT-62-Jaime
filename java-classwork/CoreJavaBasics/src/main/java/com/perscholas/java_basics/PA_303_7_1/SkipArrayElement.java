package com.perscholas.java_basics.PA_303_7_1;

import java.util.Arrays;

public class SkipArrayElement {
    /*
    Write a program where you create an array of 5 elements.
    Loop through the array and print the value of each element, except for the middle (index 2) element.
     */
    public static void main(String[] args) {
        int[] numbers = new int[]{0, 3, 6, 9, 12};
        for(int i=0; i < numbers.length; i++){
            if(i != numbers.length/2){
                System.out.println(numbers[i]);
            }
        }
    }
}
