package com.perscholas.java_basics.PA_303_2_3;

public class ThreeWaysToIncrementBy1 {
    public static void main(String[] args) {
        /*
        Write a program that demonstrates at least three ways to increment a variable by 1 and does this multiple times.
        Assign a value to an integer variable, print it, increment by 1, print it again, increment by 1, and then print it again.
        */
        int number = 24;
        System.out.println("number is: " + number);
        number = number + 1;
        System.out.println("number is: " + number);
        number++;
        System.out.println("number is: " + number);
        number += 1;
        System.out.println("number is: " + number);

    }
}
