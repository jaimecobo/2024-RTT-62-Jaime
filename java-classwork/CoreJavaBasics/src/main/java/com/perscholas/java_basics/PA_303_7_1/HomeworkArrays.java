package com.perscholas.java_basics.PA_303_7_1;

import javax.swing.*;
import java.util.Arrays;
import java.util.Random;

public class HomeworkArrays {
    public static void main(String[] args) {
        int[] numbers = new int[10];
//        System.out.println(Arrays.toString(numbers));
        Random rand = new Random();
        for(int i=0; i < numbers.length; i++){
            numbers[i] = rand.nextInt(99);;
        }

        int smallest = 99, largest = 0;
        for(int i = 0; i < numbers.length; i++){
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }else if(largest < numbers[i]){
                largest = numbers[i];
            }
        }
        System.out.println("The array of numbers is: " + Arrays.toString(numbers));
        System.out.println("The smallest number in the array is: " + smallest + ", and the largest is: " + largest );

        double average = 0;
        for(int i = numbers.length-1; i >= 0; i--){
                average += numbers[i];
        }
        average = average / numbers.length;
        System.out.println("The average value in the array is: " + average);
    }
}
