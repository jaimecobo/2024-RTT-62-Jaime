package com.perscholas.java_basics.PA_303_3_1;

import java.util.Scanner;

public class JavaStringReverse {
    /*
    A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.
    Given a string A, print Yes if it is a palindrome, print No otherwise.
    -- Constraints --
    A will consist at most 50 lower case english letters.
    -- Sample Input --
    madam
    -- Sample Output --
    Yes
     */
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        StringBuffer B = new StringBuffer(A);
        String C = B.reverse().toString();
//        System.out.println("A => " + A);
//        System.out.println("B => " + B);
//        System.out.println("C => " + C);

        String result = A.equals(C) ? "Yes" : "No";
        System.out.println(result);

    }


}
