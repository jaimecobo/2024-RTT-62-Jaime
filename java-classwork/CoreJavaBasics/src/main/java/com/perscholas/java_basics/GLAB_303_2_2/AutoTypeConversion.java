package com.perscholas.java_basics.GLAB_303_2_2;

public class AutoTypeConversion {
    public static void main(String[] args) {
        int x = 20;
        double y = 40.5;
        long p = 30;
        float q = 10.60f;
        // int z = x + y; (1) // Error; cannot convert from double to int.
        double z = x + y;
        System.out.println("Sum of two numbers: " + z);

        // long r = p - q; // (2) // Error; cannot convert from float to long.
        float r = p - q;
        System.out.println("Subtraction of two numbers: " + r);
    }
/*
1. In the above example, the result of addition is double because when int and double are added, int is promoted to the higher-ranking data type than double.
    Therefore, assigning the result as a double is legal.
    When the result assigns to be an int, the fractional part of the value of y will be truncated,and the result will give the value of 60, not 60.5.
    It represents a loss of precision, and Java does not allow any loss of precision.
    Therefore, the compiler will generate an error in line number 1.

2. Similarly, the result of subtraction is float because when long and float are subtracted, long is promoted to the higher-ranking data type float.
 */

}
