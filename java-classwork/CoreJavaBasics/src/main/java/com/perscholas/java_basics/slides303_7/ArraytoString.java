package com.perscholas.java_basics.slides303_7;

import java.util.Arrays;

public class ArraytoString {
    public static void main(String[] args)
    {/* Let us create different types of arrays and print their contents using Arrays.toString() */
        boolean[] boolArr = new boolean[] { true, true, false, true };
        byte[] byteArr = new byte[] { 10, 20, 30 };
        char[] charArr = new char[] { 'g', 'e', 'e', 'k', 's' };
        double[] dblArr = new double[] { 1, 2, 3, 4 };
        float[] floatArr = new float[] { 1, 2, 3, 4 };
        int[] intArr = new int[] { 1, 2, 3, 4 };
        long[] lomgArr = new long[] { 1, 2, 3, 4 };
        short[] shortArr = new short[] { 1, 2, 3, 4 };
        System.out.println(Arrays.toString(boolArr));
        System.out.println(Arrays.toString(byteArr));
        System.out.println(Arrays.toString(charArr));
        System.out.println(Arrays.toString(dblArr));
        System.out.println(Arrays.toString(floatArr));
        System.out.println(Arrays.toString(intArr));
        System.out.println(Arrays.toString(lomgArr));
        System.out.println(Arrays.toString(shortArr));
    }

}
