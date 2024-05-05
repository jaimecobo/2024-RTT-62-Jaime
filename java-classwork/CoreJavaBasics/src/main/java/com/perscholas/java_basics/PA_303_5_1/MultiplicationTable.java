package com.perscholas.java_basics.PA_303_5_1;

public class MultiplicationTable {
    /*
    Write a program that uses nested for loops to print a multiplication table.
    */
    public static void main(String[] args) {
        System.out.print(" ");
        for (int line = 0; line <= 51; line++) {
            if(line > 50){
                System.out.println();
                if(line == 51){
                    System.out.println("|                MULTIPLICATION TABLE               |");
                }
            } else{
                System.out.print("_");
            }
        }
    }
}
