package com.perscholas.java_basics.PA_303_2_2;

import java.util.Scanner;

/*
Most HackerRank challenges require you to read input from stdin (standard input) and write output to stdout (standard output).
One popular way to read input from stdin is by using the Scanner class and specifying the Input Stream as System.in.

Task.-
    In this challenge, you must read  integers from stdin and then print them to stdout. Each integer must be printed on a new line.
    To make the problem a little easier, a portion of the code is provided for you in the editor below.
*/

public class HackerRankStdInStdOut01 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();

            System.out.println(a);
            System.out.println(b);
            System.out.println(c);

        }

}
