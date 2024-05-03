package com.perscholas.java_basics.GLAB_303_2_2;

public class AutoPromoteTest {
    public static void main(String[] args)
    {
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = .1234;
// Expression:
        double result = (f * b) + (i / c) - (d * s);
//Result after all the promotions are done.
        System.out.println("result = " + result);
    }

    /*
    Explanation:
    1. "The letter (a) converted to binary via ASCII is 01100011.  The decimal representation of 0110011 (64 + 32 + 2+ 1) is 97."
    2. In the first sub-expression, f * b, b is promoted to float and the result of sub-expression is float.
    3. In the second sub-expression i / c, the first c is promoted to int, and the result of the subexpression will be int.
    4. Then, in d * s, the value of s is promoted to double, and the data type of subexpression is double.
    Finally, we will now consider these three intermediate values with data types: float, int, and double.
    When the addition of a float and an int is performed, the outcome is float.
    Then the resultant float is minus with the last double, which is converted to double, which is the data type of the final result of the expression.
     */

}
