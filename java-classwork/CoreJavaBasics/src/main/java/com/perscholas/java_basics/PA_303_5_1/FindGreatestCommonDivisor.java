package com.perscholas.java_basics.PA_303_5_1;

import java.util.Scanner;

public class FindGreatestCommonDivisor {
    /*
    Write a program that prompts the user to enter two positive integers, and find their greatest common divisor (GCD).
    Examples:
    Enter 2 and 4. The gcd is 2.
    Enter 16 and 24.  The gcd is 8.
    How do you find the gcd?
    Name the two input integers n1 and n2.
    You know number 1 is a common divisor, but it may not be the gcd.
    Check whether k (for k = 2, 3, 4, and so on) is a common divisor for n1 and n2, until k is greater than n1 or n2.
    */
    public static void main(String[] args) {
        int n1, n2, gcd = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        n1 = sc.nextInt();
        System.out.print("Enter second number: ");
        n2 = sc.nextInt();

    }
}
