package com.perscholas.java_basics.PA_303_4_1;

import java.util.Scanner;

public class SwitchStatement {
    /*
    6. Write a program that accepts an integer between 1 and 7 from the user.
    Use a switch statement to print out the corresponding weekday.
    Print “Out of range” if the number is less than 1 or greater than 7. Do not forget to include “break” statements in each of your cases.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert a number from 1 to 7:");
        int num = sc.nextInt();
        String output;
        switch (num){
            case 1:
                output = "Sunday";
                break;
            case 2:
                output = "Monday";
                break;
            case 3:
                output = "Tuesday";
                break;
            case 4:
                output = "Wednesday";
                break;
            case 5:
                output = "Thursday";
                break;
            case 6:
                output = "Friday";
                break;
            case 7:
                output = "Saturday";
                break;
            default:
                output = "Out of range";
                break;
        }
        System.out.println(output);
    }
}
