package com.perscholas.java_basics.PA_303_3_1;

import java.util.Scanner;

public class JavaSubstringMethod {
    /*
    Given a string, str, and two indices,  Start and End, print a substring consisting of all characters in the inclusive range from  Start to End.
     You'll find the String class' substring method helpful in completing this challenge.

    -- Input Format --
    The first line contains a single string denoting str.
    The second line contains two space-separated integers denoting the respective values of Start and End.

    -- Constraints --
    String  consists of English alphabetic letters (i.e., [a-zA-Z]) only.

    -- Output Format --
    Print the substring in the inclusive range from  to .
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();
        System.out.println(S.substring(start, end));

    }

}
