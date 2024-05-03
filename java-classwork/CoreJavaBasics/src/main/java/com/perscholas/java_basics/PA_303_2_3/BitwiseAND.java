package com.perscholas.java_basics.PA_303_2_3;

public class BitwiseAND {
    /*
    Write a program that declares three int variables: x, y, and z. Assign 7 to x and 17 to y.
    Write a comment that indicates what you predict will be the result of the bitwise and operation on x and y.
    Now use the bitwise AND (&) operator to derive the decimal and binary values, and assign the result to z.
    */
    public static void main(String[] args) {
        int x = 7, y = 17, z;
        z = x & y;
        //The predicted decimal value of z is 1, and its binary notation is 0001
        System.out.println("z in decimal is: " + z + ", and its binary notation is: " + Integer.toBinaryString(z));
    }
}
