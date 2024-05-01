package com.perscholas.java_basics;

public class JavaBasicsClass {
    public static void main(String[] args) {

        /* Write a program that declares two integer variables, assigns an integer to each, and adds them together.
           Assign the sum to a variable. Print out the result. */
        int num1 = 3, num2 = 5;
        int sum = num1 + num2;
        System.out.println(sum);
        System.out.println("###################################################################### \n");


        /* Write a program that declares two double variables, assigns a number to each, and adds them together.
           Assign the sum to a variable. Print out the result. */
        double dNum1 = 3.14159, dNum2 = 1.618;
        double dSum= dNum1 + dNum2;
        System.out.println(dSum);
        System.out.println("###################################################################### \n");


        /* Write a program that declares an integer variable and a double variable, assigns numbers to each, and adds them together.
           Assign the sum to a variable. Print out the result. What variable type must the sum be? */
        int intNum01 = 9;
        double doubleNum01 = 3.333333333;
        double intDoubleSum = intNum01 + doubleNum01;
        System.out.println(intDoubleSum);
        System.out.println("###################################################################### \n");


        /* Write a program that declares two integer variables, assigns an integer to each, and divides the larger number by the smaller number.
           Assign the result to a variable. Print out the result. Now change the larger number to a decimal. What happens? What corrections are needed? */
        int intNum02 = 28;
        int intNum03 = 8;
        int intDiv = intNum02 / intNum03;
        System.out.println(intDiv);
        double doubleDiv = intNum02 / intNum03;
        System.out.println(doubleDiv);
        doubleDiv = (double)intNum02 / (double)intNum03;
        System.out.println(doubleDiv);
        //intNum02 = 28.0;          // Not possible to assign a number with decimal point to a variable declared as integer
        System.out.println("###################################################################### \n");


        /* Write a program that declares two double variables, assigns a number to each, and divides the larger by the smaller number.
            Assign the result to a variable. Print out the result. Now, cast the result to an integer. Print out the result again. */

    }
}
