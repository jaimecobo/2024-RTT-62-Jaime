package com.perscholas.java_basics.PA_303_12_1;

import java.util.Scanner;

public class JavaExceptionHandling_TryCatch {
/*
Java has built-in mechanism to handle exceptions.
Using the try statement we can test a block of code for errors.
The catch block contains the code that says what to do if exception occurs.
You will be given two integers x and y as input, you have to compute x/y.
If x and y are not 32 bit signed integers or if y is zero, an exception will occur, and you have to report it.
Sample Input 0:
    10
    3
Sample Output 0:
    3
Sample Input 1:
    10
    Hello
Sample Output 1:
    java.util.InputMismatchException
Sample Input 2:
    10
    0
Sample Output 2:
    java.lang.ArithmeticException: / by zero
Sample Input 3:
    23.323
    0
Sample Output 3:
    java.util.InputMismatchException
 */
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println(x/y);
        }
        catch(Exception e){
//            System.out.println(e);
            String error = String.valueOf(e.getClass());
            if(error.equals("class java.util.InputMismatchException")) {
                System.out.println("java.util.InputMismatchException");
            }else{
                System.out.println(e);
            }
        }
    }
}
