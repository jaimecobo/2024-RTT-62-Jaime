package com.perscholas.java_basics.GLAB_303_11_7;
/*
Objective:
In this lab, we will create a basic PhoneDirectory by using a TreeMap to store directory entries.
Learning Objective:
By the end of this lesson, learners will be able to utilize the TreeMap.
Scenario:
Finds the phone number, if any, for a given name and returns the phone number associated with the name if the name does not occur in the phone directory,
and then returns the value as null.
Associates a given name with a given phone number.
If the name already exists in the phone directory, the new number replaces the old one.
Otherwise, a new name/number pair is added.The name and number should both be non-null.
An IllegalArgumentException is thrown if this is not the case.
 */

public class TestPhoneDirectoryWithTreeMap {
    public static void main(String[] args) {
        PhoneDirectoryWithTreeMap directory = new PhoneDirectoryWithTreeMap();
        System.out.println("This program creates a PhoneDirectoryWithTreeMap and");
        System.out.println("adds several entries.  It then prints the contents of");
        System.out.println("directory and does a few lookups.");
        System.out.println();
        directory.putNumber("Fred","555-1234");
        directory.putNumber("Barney","555-2345");
        directory.putNumber("Wilma","555-3456");
        directory.putNumber("Wilma","555-3456");
        directory.putNumber("Wilma","555-2563");
        // directory.putNumber("James",null);
        //directory.putNumber(null,"555-2853");

        System.out.println("Contents are:");
        System.out.println();
        directory.print();
        System.out.println();
        System.out.println("Number for Fred is " + directory.getNumber("Fred"));
        System.out.println("Number for Wilma is " + directory.getNumber("Wilma"));
        System.out.println("Number for Tom is " + directory.getNumber("Tom"));
        System.out.println("Number for Tom is " + directory.getNumber("Alex"));
        // The output from the last line should be null.
    }

}
