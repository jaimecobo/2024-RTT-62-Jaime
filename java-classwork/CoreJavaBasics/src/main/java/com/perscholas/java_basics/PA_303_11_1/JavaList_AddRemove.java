package com.perscholas.java_basics.PA_303_11_1;

import java.util.*;
public class JavaList_AddRemove {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of elements (N) for the list:");
        int listSize = Integer.parseInt(scan.nextLine());

        System.out.println("Enter the elements of your list:");
        String input = scan.nextLine();
        // Splits the line into an array of strings
        String[] numbersAsString = input.split(" ");
        // Initialize a List to hold the integers
        List<Integer> listOfIntegers = new ArrayList<>(listSize);
        // Converts each string to an integer and add it to the list
        for (String numberAsString : numbersAsString) {
            listOfIntegers.add(Integer.parseInt(numberAsString));
        }

//        for(int num : listOfIntegers){
//            System.out.print(num + " ");
//        }
//        System.out.println();
        System.out.println("Enter the number of queries 'Q'");
        int numOfQueries = Integer.parseInt(scan.nextLine());

        System.out.println("Type in Insert OR Delete");
//        for(int i = 0; i <= numOfQueries; i++) {
            while(numOfQueries >= 0){
//            System.out.println("Type in Insert OR Delete");
            String instruction = scan.nextLine();
            if (instruction.equalsIgnoreCase("insert")) {
                System.out.println("Enter [index to insert] + [number to insert]");
                String[] insertValues = scan.nextLine().split(" ");
                listOfIntegers.add(Integer.parseInt(insertValues[0]), Integer.parseInt(insertValues[1]));
                for (int num : listOfIntegers) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
            if (instruction.equalsIgnoreCase("delete")) {
                System.out.println("Enter [index to delete]");
//                int insertDelete = scan.nextInt();
                int insertDelete = Integer.parseInt(scan.nextLine());
                listOfIntegers.remove(insertDelete);
                for (int num : listOfIntegers) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
            numOfQueries--;
//            System.out.println(numOfQueries);
        }
        for (int num : listOfIntegers) {
            System.out.print(num + " ");
        }
    }
}

/*
10
48908 99556 51237 37007 96350 9826 11431 62869 50411 83719
10
Delete
2				48908 99556 37007 96350 9826 11431 62869 50411 83719
Insert
4 36173			48908 99556 37007 96350 36173 9826 11431 62869 50411 83719
Insert
6 79735			48908 99556 37007 96350 36173 9826 79735 11431 62869 50411 83719
Delete
3				48908 99556 37007 36173 9826 79735 11431 62869 50411 83719
Delete
0				99556 37007 36173 9826 79735 11431 62869 50411 83719
Insert
4 98904			99556 37007 36173 9826 98904 79735 11431 62869 50411 83719
Delete
9				99556 37007 36173 9826 98904 79735 11431 62869 50411
Insert
2 2073			99556 37007 2073 36173 9826 98904 79735 11431 62869 50411
Delete
0				37007 2073 36173 9826 98904 79735 11431 62869 50411
delete
5				37007 2073 36173 9826 98904 11431 62869 50411
EXPECTED => 	37007 2073 36173 9826 98904 11431 62869 50411
 */


/*
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int listSize = Integer.parseInt(scan.nextLine());

    String input = scan.nextLine();
    String[] numbersAsString = input.split(" ");
    List<Integer> listOfIntegers = new ArrayList<>(listSize);
    for (String numberAsString : numbersAsString) {
        listOfIntegers.add(Integer.parseInt(numberAsString));
    }

    int numOfQueries = Integer.parseInt(scan.nextLine());

    for(int i = 1; i <= numOfQueries; i++) {
        String instruction = scan.nextLine();
        if (instruction.equalsIgnoreCase("insert")) {
            String[] insertValues = scan.nextLine().split(" ");
            listOfIntegers.add(Integer.parseInt(insertValues[0]), Integer.parseInt(insertValues[1]));

        } else if (instruction.equalsIgnoreCase("delete")) {
            int insertDelete = Integer.parseInt(scan.nextLine());
            listOfIntegers.remove(insertDelete);

        }
    }
    for (int num : listOfIntegers) {
        System.out.print(num + " ");
    }
}
*/

