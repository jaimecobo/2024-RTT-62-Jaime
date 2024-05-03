package com.perscholas.java_basics.PA_303_2_3;

public class PostfixIncrement {
    /*
    Write a program that declares an integer variable, assigns a number, and uses a postfix increment operator to increase the value.
    Print the value before and after the increment operator.
    */
    public static void main(String[] args) {
        int num1 = 24;
        System.out.println(num1++);
        System.out.println(num1);

    }
}
