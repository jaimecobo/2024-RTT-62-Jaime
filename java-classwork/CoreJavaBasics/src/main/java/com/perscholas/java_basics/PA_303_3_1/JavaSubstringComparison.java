package com.perscholas.java_basics.PA_303_3_1;

import java.util.Scanner;

public class JavaSubstringComparison {
    /*
    Given a string, s, and an integer, k, complete the function so that it finds the lexicographically smallest and largest substrings of length k.

    --Function Description --
    Complete the getSmallestAndLargest function in the editor below.
    getSmallestAndLargest has the following parameters:
    string s: a string
    int k: the length of the substrings to find

    -- Returns --
    string: the string ' + "\n" + ' where and are the two substrings

    -- Input Format --
    The first line contains a string denoting .
    The second line contains an integer denoting .

    -- Constraints --
    1 <= s <= 1000
    s consists of English alphabetic letters only (i.e., [a-zA-Z]).

    -- Sample Input--
    welcometojava
    3

    -- Sample Output --
    ava
    wel

    -- Explanation --
    String s="welcometojava"  has the following lexicographically-ordered substrings of length k=3:
        ["ava", "com", "elc", "eto", "jav", "lco", "met", "oja", "ome", "toj", "wel"]
    We then return the first (lexicographically smallest) substring and the last (lexicographically largest) substring
    as two newline-separated values (i.e., ava\wel).

    The stub code in the editor then prints ava as our first line of output and wel as our second line of output.
    */

    public static String getSmallestAndLargest(String s, int k) {
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        String carrier = s.substring(0,k);
        String smallest = carrier;
        String largest = carrier;
        for(int i=1; i<=s.length()-k; i++) {
            carrier = s.substring(i, i+k);
            smallest = smallest.compareTo(carrier) >= 1 ? carrier: smallest;
            largest = largest.compareTo(carrier) < 0 ? carrier : largest;
        }

        return smallest + "\n" + largest;

    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your string:");
        String s = scan.next();
        System.out.println("Enter your number:");
        int k = scan.nextInt();
        scan.close();
        System.out.println(getSmallestAndLargest(s, k));

    }
}
/*
wel com eto jav
elc ome toj ava
lco met oja
 */