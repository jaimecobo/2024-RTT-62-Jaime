package com.perscholas.java_basics.GLAB_303_11_5;

import java.util.Comparator;
import java.util.TreeSet;

/*
Sort a given TreeSet alphabetically in reverse order.
In this example, we will implement a Comparator class to sort the given TreeSet alphabetically in reverse order.
By default, the TreeSet sorts data in ascending order.
We can also sort TreeSet in a customized order by defining a new comparator class.
In this comparator class, we need to override the ‘compare’ method to sort the elements of the TreeSet.
This comparator object is then passed to the TreeSet constructor.
 */
public class TreeSet_CitiesComparator implements Comparator<String> {
    //override compare method to compare two elements of the TreeSet
    @Override
    public int compare(String cities_one, String cities_two) {
        int value =  cities_one.compareTo(cities_two);
        // sort elements in reverse order
        if (value > 0) {
            return -1;
        }
        else if (value < 0) {
            return 1;
        }
        else {
            return 0;
        }
    }

    public static void main(String[] args) {
        // Create a TreeSet with user-defined comparator
        TreeSet<String> cities = new TreeSet<>(new TreeSet_CitiesComparator());
        //add elements to the comparator
        cities.add("UAE");
        cities.add("Mumbai");
        cities.add("NewYork");
        cities.add("Hyderabad");
        cities.add("Karachi");
        cities.add("Xanadu");
        cities.add("Lahore");
        cities.add("Zagazig");
        cities.add("Yingkou");

        //print the contents of TreeSet
        System.out.println("TreeSet: " + cities);
    }

}
