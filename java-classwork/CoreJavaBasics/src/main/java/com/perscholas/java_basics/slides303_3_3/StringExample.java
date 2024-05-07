package com.perscholas.java_basics.slide303_3_3;

public class StringExample {
    public static void main(String[] args) {
        String str1 = "What ever you want to type in this string is okay. Add more to this";

        System.out.println("The length of this string is " + str1.length());

        String str2 = str1.toUpperCase();
        System.out.println(str1);
        System.out.println(str2);

        System.out.println(str1.toLowerCase());

        String filename = "Document.pdf";
        System.out.println("The filename is " + filename + " and the length is " + filename.length());
        System.out.println("The period is at index " + filename.indexOf('.'));
        System.out.println("The filename extension is " + filename.substring(filename.indexOf('.')));
        System.out.println("The filename extension is " + filename.substring(filename.indexOf('.') + 1));
        System.out.println("The name of the file is " + filename.substring(0, filename.indexOf('.')));


    }
}
