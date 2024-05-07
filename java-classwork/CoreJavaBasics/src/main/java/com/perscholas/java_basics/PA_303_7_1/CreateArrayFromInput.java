package com.perscholas.java_basics.PA_303_7_1;

import java.util.Arrays;
import java.util.Scanner;

public class CreateArrayFromInput {
    /*
    Task 11: Write some Java code that asks the user how many favorite things they have.
    Based on their answer, you should create a String array of the correct size.
    Then ask the user to enter the things and store them in the array you created.
    Finally, print out the contents of the array.
    Example
    How many favorite things do you have?
    7
    Enter your thing: phone
    Enter your thing: tv
    Enter your thing: xbox
    Enter your thing: wine
    Enter your thing: beer
    Enter your thing: sofa
    Enter your thing: book
    Your favorite  things are:
    phone tv xbox wine beer sofa book
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many favorites things do you have?");
        int num = scanner.nextInt();
        String[] things = new String[num];
        for(int i = 0; i < things.length; i++){
            System.out.print("Enter your number " + (i+1) + " favorite thing: ");
            things[i] = scanner.next();
        }
        for(int i = 0; i < things.length; i++){
            System.out.print(things[i] + " ");
        }
        System.out.println(Arrays.toString(things));
    }
}
