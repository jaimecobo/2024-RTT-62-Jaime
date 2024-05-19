package com.perscholas.java_basics.PA_303_11_1;
import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
public class JavaList {

/*
We have 2 types of queries you can perform on a List:

Insert y at x index.-
    Insert
    x y

Delete the element at index.-
    Delete
    x
Given a list, L, of N integers, perform  queries on the list.
Once all queries are completed, print the modified list as a single line of space-separated integers.

Input Format.-
    The first line contains an integer, N (the initial number of elements in L).
    The second line contains N space-separated integers describing L.
    The third line contains an integer, Q (the number of queries).
    The 2Q subsequent lines describe the queries, and each query is described over two lines:\
    If the first line of a query contains the String {Insert}, then the second line contains two space separated integers x y,
    and the value y must be inserted into L at index x.
    If the first line of a query contains the String {Delete}, then the second line contains index x, whose element must be deleted from L.

Output Format.-
    Print the updated list L as a single line of space-separated integers.

Sample Input.-
    5
    12 0 1 78 12
    2
    Insert
    5 23
    Delete
    0

Sample Output.-
    0 1 78 12 23

Explanation.-
    L = [12, 0, 1, 78, 12]
    Q-0 = {Insert} 23 at index 5.
    L = [12, 0, 1, 78, 12, 23]
    Q-1 = {Delete} the element at index 0.
    L = [0, 1, 78, 12, 23]
    Having performed all Q queries, we print L as a single line of space-separated integers.
*/
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
