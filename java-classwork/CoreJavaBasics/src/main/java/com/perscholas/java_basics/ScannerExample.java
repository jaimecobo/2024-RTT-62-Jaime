package com.perscholas.java_basics;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num1 = sc1.nextInt();

        System.out.println("The number is: " + num1);

//        sc1.close();

        System.out.println(1.0 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1); //This will print 0.5000000000000001 not 0.5
        System.out.println(1.0 + (-0.1 - 0.1 - 0.1 - 0.1 - 0.1));   //This prints 0.5
        System.out.println(1.0 - 0.9);  //This prints 0.09999999999999998 not 0.1
        float num01 = 1.0f;
        float num02 = 0.9f;
        System.out.println(num01 - num02);
        float result = num01 - num02;
        System.out.println(result);

        double subtractingFloating = 1.0 - 0.9;
        System.out.println("The result of 1.0 - 0.9 is: " + subtractingFloating);

    }
}
