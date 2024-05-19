package com.perscholas.java_basics.PA_303_11_1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class JavaSet {
/*
You are given {n} pairs of strings.
Two pairs {a, b} and {c, d} are identical if a==c and b=d.
That also implies {a, b} is not same as {b, a}.
After taking each pair as input, you need to print number of unique pairs you currently have.

Input Format.-
    In the first line, there will be an integer {n} denoting number of pairs. Each of the next {n} lines will contain two strings seperated by a single space.

Output Format
Print {n} lines. In the [i]th line, print number of unique pairs you have after taking [i]th pair as input.

Sample Input.-
    5
    john tom
    john mary
    john tom
    mary anna
    mary anna

Sample Output.-
    1
    2
    2
    3
    3

Explanation.-
    After taking the first input, you have only one pair: (john,tom)
    After taking the second input, you have two pairs: (john, tom) and (john, mary)
    After taking the third input, you still have two unique pairs.
    After taking the fourth input, you have three unique pairs: (john,tom), (john, mary) and (mary, anna)
    After taking the fifth input, you still have three unique pairs.
 */
    public static void main(String[] args) {
        Set<String> setOfStrings = new HashSet();
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] numOfEntries = new int[n];
        boolean StringAdded = false;
        int counter = 0;
        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            StringAdded = setOfStrings.add(str);
            if (StringAdded) {
                counter++;
            }
            numOfEntries[i] = counter;
        }
        sc.close();
        for (int i = 0; i < n; i++) {
            System.out.println(numOfEntries[i]);
        }
    }
}

