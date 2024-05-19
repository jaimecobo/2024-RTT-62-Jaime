package com.perscholas.java_basics.PA_303_14_1;

import java.util.Scanner;
import java.util.function.Function;

public class JavaLambda {
/*
Complete a lambda expression removeDigits that takes a string and removes all the numeric digits
Complete a lambda expression introduce that takes a string and returns "This is my friend STRING."
Complete a lambda expression greet that takes a string and returns "Hello, STRING!"
 */
    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();

        Function<String, String> removeDigits = s -> s.replaceAll("\\d", "");
        Function<String, String> introduce = str -> "This is my friend " + str + ".";
        Function<String, String> greet = str -> "Hello, " + str + "!";

        String name = removeDigits.apply(inputString);
//        System.out.println(name);
        System.out.println(introduce.apply(name));
        System.out.println(greet.apply(name));
    }
}
