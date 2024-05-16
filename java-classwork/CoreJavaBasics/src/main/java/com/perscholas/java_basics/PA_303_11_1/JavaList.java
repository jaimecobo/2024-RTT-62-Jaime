package com.perscholas.java_basics.PA_303_11_1;
import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
public class JavaList {
    public static void main(String[] args) {
////          Check if a console is available
//            if (System.console() == null) {
//                System.out.println("No console available.");
//                return;
//            }

////          Gets the console instance
//            Console console = System.console();
//            System.out.println("Enter the number of elements (N) for the list:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements (N) for the list:");
        int listSize = Integer.parseInt(scanner.nextLine());
//            int listSize = Integer.parseInt(console.readLine());

        System.out.println("Enter the elements of your list:");
        // String input = console.readLine();
        String input = scanner.nextLine();
        // Splits the line into an array of strings
        String[] numbersAsString = input.split(" ");
        // Initialize a List to hold the integers
        List<Integer> listOfIntegers = new ArrayList<>(listSize);
//            System.out.println("The size of the List is: " + listOfIntegers.size());
        // Converts each string to an integer and add it to the list
        for (String numberAsString : numbersAsString) {
            listOfIntegers.add(Integer.parseInt(numberAsString));
        }
//            System.out.println("The size of the List is: " + listOfIntegers.size());
        for(int num : listOfIntegers){
            System.out.print(num + " ");
        }
        System.out.println("");
        System.out.println("Enter the number of queries 'Q'");
//            int numOfQueries = Integer.parseInt(console.readLine());
        int numOfQueries = Integer.parseInt(scanner.nextLine());

//            System.out.println("number of queries = " + numOfQueries);
//            System.out.println("Enter one of the following to options:\n Type in [Insert] + [index value] + [number] \n OR \n Type in [Delete] + [index value]");
        for(int i = 1; i <= numOfQueries; i++) {
            System.out.println("Type in Insert OR Delete");
//                String instruction = console.readLine();
            String instruction = scanner.nextLine();
            if (instruction.toLowerCase().equals("insert")) {
                System.out.println("Enter [index to insert] + [number to insert]");
                // Splits the line inserted into an array of strings
//                    String[] insertValues = console.readLine().split(" ");
                String[] insertValues = scanner.nextLine().split(" ");
                listOfIntegers.add(Integer.parseInt(insertValues[0]), Integer.parseInt(insertValues[1]));
                for (int num : listOfIntegers) {
                    System.out.print(num + " ");
                }
                System.out.println("");
            } else if (instruction.toLowerCase().equals("delete")) {
                System.out.println("Enter [index to delete]");
//                    int insertDelete = Integer.parseInt(console.readLine());
                int insertDelete = scanner.nextInt();
                listOfIntegers.remove(insertDelete);
                for (int num : listOfIntegers) {
                    System.out.print(num + " ");
                }
                System.out.println("");
            }
        }
        scanner.close();
    }
}
