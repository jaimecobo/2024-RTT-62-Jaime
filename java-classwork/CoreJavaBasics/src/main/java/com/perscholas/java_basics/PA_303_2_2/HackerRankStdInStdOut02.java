package com.perscholas.java_basics.PA_303_2_2;

import java.util.Scanner;

/*
In this challenge, you must read an integer, a double, and a String from stdin,
then print the values according to the instructions in the Output Format section below.
To make the problem a little easier, a portion of the code is provided for you in the editor.

-- Input Format --
There are three lines of input:
The first line contains an integer.
The second line contains a double.
The third line contains a String.

-- Output Format --
There are three lines of output:
On the first line, print String: followed by the unaltered String read from stdin.
On the second line, print Double: followed by the unaltered double read from stdin.
On the third line, print Int: followed by the unaltered integer read from stdin.
 */

public class HackerRankStdInStdOut02 {
    public static void main(String[] args) {
        String message="";
        Scanner scan = new Scanner(System.in);
        //If I was catching the String as first input I would be able to use the same scanner for all the inputs
//        message += scan.nextLine();
        int intNum = scan.nextInt();
        double doubleNum = scan.nextDouble();
        //Because this is after nextInt() or nextDouble() methods, I had to create a new scanner to be able to catch the entire String with spaces
        Scanner scanStringWithSpaces = new Scanner(System.in);
        message += scanStringWithSpaces.nextLine();

        System.out.println("String: " + message);
        System.out.println("Double: " + doubleNum);
        System.out.println("Int: " + intNum);
    }
}
