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

        System.out.print("|");
        for (int line = 0; line <= 51; line++) {
            if(line > 50){
                System.out.println("|");
            } else{
                System.out.print("_");
            }
        }

        for(int i = 1; i <= 12; i++){
            System.out.print("| \t");

            for(int j = 1; j <= 13; j++) {
                if(j <= 12){
                    System.out.print(i * j + "\t");
                } else{
                    System.out.println("|");
                }
            }
        }

        System.out.print("|");

        for (int line = 0; line <= 51; line++) {
            if(line > 50){
                System.out.println("|");
            } else{
                System.out.print("_");
            }
        }

    }
}
