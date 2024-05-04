package com.perscholas.java_basics.PA_303_4_1;

import java.util.Scanner;

public class AssignGrades {
    /*
    5. Write a program that uses if-else-if statements to print out grades A, B, C, D, F, according to the following criteria:
    A: 90-100
    B: 80-89
    C: 70-79
    D: 60-69
    F: <60
    Use the Scanner class to accept a number score from the user to determine the letter grade.
    Print out “Score out of range” if the score is less than 0 or greater than 100.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please insert your score:");
        int grade = scan.nextInt();
        if(grade < 0 || grade > 100){
            System.out.println("Score out of range");
        } else if (grade >= 90 && grade <= 100) {
            System.out.println("A");
        } else if(grade >= 80 && grade <= 89){
            System.out.println("B");
        } else if(grade >= 70 && grade <= 79){
            System.out.println("C");
        } else if(grade >= 60 && grade <= 69){
            System.out.println("D");
        } else{
            System.out.println("F");
        }
    }
}
