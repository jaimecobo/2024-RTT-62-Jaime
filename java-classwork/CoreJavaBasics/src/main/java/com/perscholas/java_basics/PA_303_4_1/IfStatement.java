package com.perscholas.java_basics.PA_303_4_1;

public class IfStatement {
    /*
    1. Write a program that declares 1 integer variable x, and then assigns 7 to it.
    Write an if statement to print out “Less than 10” if x is less than 10.
    Change x to equal 15, and notice the result (console should not display anything).
    */
    public static void main(String[] args) {
        int num = 15;
        if(num < 10){
            System.out.println("Less than 10");
        }
    }
}
