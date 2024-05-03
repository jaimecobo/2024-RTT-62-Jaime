package com.perscholas.java_basics.PA_303_2_3;

public class BitwiseRightShiftOperator {
    public static void main(String[] args) {

    /*
    Write a program that declares a variable x, and assigns 150 to it, and prints out the binary string version of the number.
    Now use the right shift operator (>>) to shift by 2 and assign the result to x.
    Write a comment indicating what you anticipate the decimal and binary values to be. Now print the value of x and the binary string.
    Perform the preceding exercise with the following values:
    225
    1555
    32456
    */
        int x = 150;
        System.out.println("150 in binary notation is: " + Integer.toBinaryString(x));
        x = x >>= 2;
        //The predicted decimal value of x is 37, and its binary notation is 100101
        System.out.println("Now x in decimal is: " + x + " ,and its binary notation is: " + Integer.toBinaryString(x));
        System.out.println("----------------------------------------------------------------------------------------------------");

        x = 225;
        System.out.println("225 in binary notation is: " + Integer.toBinaryString(x));
        x = x >>= 2;
        System.out.println("Now x in decimal is: " + x + " ,and its binary notation is: " + Integer.toBinaryString(x));
        System.out.println("----------------------------------------------------------------------------------------------------");

        x = 1555;
        System.out.println("1555 in binary notation is: " + Integer.toBinaryString(x));
        x = x >>= 2;
        System.out.println("Now x in decimal is: " + x + " ,and its binary notation is: " + Integer.toBinaryString(x));
        System.out.println("----------------------------------------------------------------------------------------------------");

        x = 32456;
        System.out.println("32456 in binary notation is: " + Integer.toBinaryString(x));
        x = x >>= 2;
        System.out.println("Now x in decimal is: " + x + " ,and its binary notation is: " + Integer.toBinaryString(x));

        System.out.println("####################################################################################################");


    }
}
