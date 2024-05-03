package com.perscholas.java_basics.PA_303_2_3;

public class BitwiseLeftShift {
    public static void main(String[] args) {
        /*
        Write a program that declares an integer a variable x, assigns the value 2 to it,
        and prints out the binary string version of the number ( Integer.toBinaryString(x) ).
        Now, use the left shift operator (<<) to shift by 1 and assign the result to x.
        Before printing the results, write a comment with the predicted decimal value and binary string.
        Now, print out x in decimal form and in binary notation.
        Perform the preceding exercise with the following values:
        9
        17
        88
        */
        int x = 2;
        System.out.println("2 in binary notation is: " + Integer.toBinaryString(x));
        x = x <<= x;
        //The predicted decimal value of x is 8, and its binary notation is 1000
        System.out.println("Now x in decimal is: " + x + " ,and its binary notation is: " + Integer.toBinaryString(x));
        System.out.println("----------------------------------------------------------------------------------------------------");

        x = 9;
        System.out.println("9 in binary notation is: " + Integer.toBinaryString(x));
        x = x <<= x;
        System.out.println("Now x in decimal is: " + x + " ,and its binary notation is: " + Integer.toBinaryString(x));
        System.out.println("----------------------------------------------------------------------------------------------------");

        x = 17;
        System.out.println("17 in binary notation is: " + Integer.toBinaryString(x));
        x = x <<= x;
        System.out.println("Now x in decimal is: " + x + " ,and its binary notation is: " + Integer.toBinaryString(x));
        System.out.println("----------------------------------------------------------------------------------------------------");

        x = 88;
        System.out.println("88 in binary notation is: " + Integer.toBinaryString(x));
        x = x <<= x;
        System.out.println("Now x in decimal is: " + x + " ,and its binary notation is: " + Integer.toBinaryString(x));

        System.out.println("####################################################################################################");

    }
}
