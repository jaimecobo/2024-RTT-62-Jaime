package com.perscholas.java_basics;

import java.util.ArrayList;
import java.util.List;

public class ForLoopExample {
    public static void main(String[] args) {
        for(int count = 10; count > 0; count--) {

            if (count % 2 == 0) {
                System.out.println("This is an even number");

                for (int d = 0; d < 5; d++) {
                    System.out.println("The count = " + count + "," + d);
                }
            }
        }

        List<String> stringList = new ArrayList<>();
        stringList.add("First element");
        stringList.add("Two");
        stringList.add("Three");
        stringList.add("Four");
        stringList.add("5");

        // We can use an old style for loop to nave across this list
        for(int pos = 0; pos < stringList.size(); pos++){
            System.out.println(stringList.get(pos));
        }

        // Enhanced for loop
        for(String element : stringList){
            System.out.println(element);
        }

        // Enhanced for loop + break
        for(String element : stringList){
            if(element.equals("Three")){
                break;
            }
            System.out.println(element);
        }

        // Enhanced for loop + continue
        for(String element : stringList){
            if(element.equals("Three")){
                continue;
            }
            System.out.println(element);
        }


    }
}
