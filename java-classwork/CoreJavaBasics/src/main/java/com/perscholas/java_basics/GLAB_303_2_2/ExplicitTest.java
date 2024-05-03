package com.perscholas.java_basics.GLAB_303_2_2;

public class ExplicitTest {
    public static void main(String[] args) {
        double d = 100.04;
        // explicit type casting
        long l = (long)d;
        int i = (int)l;
        System.out.println("Double value "+d);
        System.out.println("Long value "+l);
        System.out.println("Int value "+i);

        byte b;
        int z = 257;
        double dou = 323.142;
        System.out.println("Conversion of int to byte.");
        b = (byte) z;
        System.out.println("z = " + z + " b = " + b);
        System.out.println("Conversion of double to int.");

        z = (int) dou;
        System.out.println("dou = " + dou + " b = " + z);
        System.out.println("Conversion of double to byte.");

        b = (byte) dou;
        System.out.println("dou = " + dou + " b = " + b);

    }

    /*
    Explanation
    In this example program, when the value 257 is cast into a byte variable.
    The output is 1, which is the remainder of the division of 257 by 256 (the range of a byte).
    When “dou” is converted into an int, its fractional part is lost.
    When “dou” is converted into a byte, its fractional part is also lost, and the value is reduced to module 256, which is 67 in this case.
    */

    /*
    -- Disadvantages of Explicit Type Casting in Java --
    Disadvantages of using type casting in Java:
    You can lose some information or data.
    Accuracy can be lost while using type casting.
    When a double is cast to an int, the fractional part of a double is discarded, which causes the loss of the fractional part of data.
    */

}
