package com.perscholas.java_basics.PA_303_2_3;

public class BitwiseOR {
    public static void main(String[] args) {
        /*
        Now, with the preceding values from exercise BitwiseAND, use the bitwise and operator to calculate the “or” value between x and y.
        As before, write a comment that indicates what you predict the values to be before printing them out.
        */
        int x = 7, y = 17, z;
        z = x | y;
        //The predicted decimal value of z is 23, and its binary notation is 10111
        System.out.println("z in decimal is: " + z + ", and its binary notation is: " + Integer.toBinaryString(z));

    }
}
