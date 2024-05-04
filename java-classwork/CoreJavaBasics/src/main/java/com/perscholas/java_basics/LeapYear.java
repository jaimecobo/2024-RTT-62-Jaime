package com.perscholas.java_basics;

import java.util.Scanner;

public class LeapYear {
    /*
    This program first prompts the user to enter a year as an int, and checks if it is a leap year.
    A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please insert a year:");
        int year = scan.nextInt();
        if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0) ){
            System.out.println(year + " is a leap year!");
        } else{
            System.out.println(year + " is not a leap year!");
        }
    }
}
