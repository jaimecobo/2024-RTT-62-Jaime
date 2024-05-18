package com.perscholas.java_basics.slides_303_14;
import java.util.Collection;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class ForEachExample01 {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Luke");
        names.add("Jack");
        names.add("Esther");
        names.add("Steve");
        names.add("James");
        names.add("Conan");
        names.add("Ellen");
        names.add("John");

        // Prints all the names in the List using lambda expression
        names.forEach(name -> {
            System.out.println(name);
        });
        System.out.println("====================================================");

        // Prints all the names in the List using enhanced For loop
        for(String name : names){
            System.out.println(name);
        }
        System.out.println("====================================================");

        // Gets the number of elements in the List, then prints all the elements in the List using Lambda expression and
        // at the end prints out the number of elements
        long count01 = names.stream().count();
        names.forEach(name -> System.out.println(name));
        System.out.println(count01 + " is the number of names in List names");
        System.out.println("====================================================");

        // Gets the numbers of elements in the List that starts with "J", then prints all the elements in the List using Lambda expression and
        // at the end prints out the number of elements that starts with "J"
        long count02 = names.stream().filter(name -> name.startsWith("J")).count();
        names.forEach(name -> System.out.println(name));
        System.out.println(count02 + " is the number of names starting with \"J\" in List names");
        System.out.println("====================================================");

        // Assigns the names starting with "J" to a new List<String>, then prints out the elements of this new List and
        // at the end prints the number of elements in this new List, using different methods
        List<String> namesJ = new ArrayList<>();
        namesJ.addAll(names.stream().filter(name -> name.startsWith("J")).toList());
        namesJ.forEach(name -> System.out.println(name));
        System.out.println("The number of names starting with \"J\" in List names is " + namesJ.stream().count() + " = " + namesJ.size());
        System.out.println("====================================================");

        // Prints the number of elements in the List<String> names (original) before this list gets modified
        System.out.println("The number of names in List before using lambda to remove all items that do not start with \"E\" is: " + names.stream().count());
        // Using lambda to remove elements from the List, and the only elements remaining in the List after that are those that starts with "E"
        names = names.stream().filter(name -> name.startsWith("E")).collect(Collectors.toList());
        System.out.println ("Names in List names starting with \"E\" = " + names.stream().count() + " = " + names.stream().filter(name -> name.startsWith("E")).count());
        names.forEach(name -> System.out.println(name));
        System.out.println("====================================================");
        System.out.println("At the end the list names has " + names.stream().count() + " items.");

    }
}
