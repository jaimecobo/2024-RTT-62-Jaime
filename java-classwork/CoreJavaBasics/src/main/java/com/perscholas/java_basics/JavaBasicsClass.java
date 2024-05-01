package com.perscholas.java_basics;

public class JavaBasicsClass {
    public static void main(String[] args) {

        /* Write a program that declares two integer variables, assigns an integer to each, and adds them together.
           Assign the sum to a variable. Print out the result. */
        int num1 = 3, num2 = 5;
        int sum = num1 + num2;
        System.out.println(sum);
        System.out.println("###################################################################### \n");


        /* Write a program that declares two double variables, assigns a number to each, and adds them together.
           Assign the sum to a variable. Print out the result. */
        double dNum1 = 3.14159, dNum2 = 1.618;
        double dSum= dNum1 + dNum2;
        System.out.println(dSum);
        System.out.println("###################################################################### \n");


        /* Write a program that declares an integer variable and a double variable, assigns numbers to each, and adds them together.
           Assign the sum to a variable. Print out the result. What variable type must the sum be? */
        int intNum01 = 9;
        double doubleNum01 = 3.333333333;
        double intDoubleSum = intNum01 + doubleNum01;
        System.out.println(intDoubleSum);
        System.out.println("###################################################################### \n");

    }
}
