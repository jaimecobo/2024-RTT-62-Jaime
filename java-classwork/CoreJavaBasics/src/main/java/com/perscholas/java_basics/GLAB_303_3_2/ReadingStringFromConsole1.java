package com.perscholas.java_basics.GLAB_303_3_2;

import java.util.Scanner;

public class ReadingStringFromConsole {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three words separated by spaces: ");
        String s1 = input.next();
        String s2 = input.next();
        String s3 = input.next();
        System.out.println("s1 is " + s1);
        System.out.println("s2 is " + s2);
        System.out.println("s3 is " + s3);
    }

    /*
    When you are developing console applications using Java, you must read input from users through the console.
    To read a string from the console as input in Java applications, you can use the Scanner class along with System.in.

    Example 1 – Read String from Console Input
    In this example, we shall define a scanner with the input stream, System.in.
    System.in creates a standard input stream that is already open and ready to supply input data.
    The scanner is a simple text scanner that can parse primitive types and strings using regular expressions.
    So, passing System.in to Scanner allows us to parse or read strings from the standard input stream, which is the console.

    When the program is run, the execution waits after printing “Enter three words separated by spaces:,”
    where the user would enter a string similar to “hello world” as shown in the following console window.

     */

}
