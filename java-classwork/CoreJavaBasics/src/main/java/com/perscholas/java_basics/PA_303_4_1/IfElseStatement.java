package com.perscholas.java_basics.PA_303_4_1;

public class IfElseStatement {
    /*
    2. Write a program that declares 1 integer variable x, and then assigns 7 to it.
    Write an if-else statement that prints out “Less than 10” if x is less than 10, and “Greater than 10” if x is greater than 10.
    Change x to 15 and notice the result.
    */
    public static void main(String[] args) {
        int num = 15;
        if(num < 10){
            System.out.println("Less than 10");
        } else{
            System.out.printf("Greater than 10");
        }
    }
}
