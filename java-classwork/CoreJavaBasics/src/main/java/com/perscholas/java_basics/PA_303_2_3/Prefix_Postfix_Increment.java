package com.perscholas.java_basics.PA_303_2_3;

public class Prefix_Postfix_Increment {
    /*
    Write a program that declares two integer variables: x, and y, and then assigns 5 to x and 8 to y.
    Create another variable sum and assign the value of ++x added to y, and print the result.
    Notice the value of the sum (should be 14).
    Now change the increment operator to postfix (x++) and re-run the program.
    Notice what the value of the sum is.
    The first configuration incremented x, and then calculated the sum, while the second configuration calculated the sum, and then incremented x.
    */
    public static void main(String[] args) {
        int x = 5, y = 8, sum;
        sum = ++x + y;      // 6 + 8
        System.out.println(sum);
        sum = x++ + y ;     // 6 + 8 then sum = 14 and after sum is assigned, x increase by 1 becoming 7
        System.out.println(sum);
        System.out.println(x);

    }
}
