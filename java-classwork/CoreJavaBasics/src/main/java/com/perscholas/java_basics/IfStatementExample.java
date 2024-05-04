package com.perscholas.java_basics;

import java.util.Scanner;

public class IfStatementExample {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
        int x = 8;
        if(x < 10){
            System.out.println("Less than 10 " + (x < 10));
        } else if (x < 20) {
            System.out.println("Less than 20");
        } else if (x < 30) {
            System.out.println("Less than 30");
        } else{
            System.out.println("Greater than 40");
        }

        if(x < 10){
            System.out.println("Less than 10");
        }
        if (x < 20) {
            System.out.println("Less than 20");
        }
        if (x < 30) {
            System.out.println("Less than 30");
        } else{
            System.out.println("Greater than 40");
        }

    }
}
