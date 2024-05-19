package com.perscholas.java_basics.PA_303_11_1;

import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;

public class JavaMap {

    public static void main(String []argh)
    {
        Map<String, Integer> phoneBook = new HashMap<>();
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        for(int i=0;i<n;i++)
        {
            String name=in.nextLine();
            int phone=in.nextInt();
            in.nextLine();
            phoneBook.put(name, phone);
        }
//        System.out.println(phoneBook);

        // Get an Iterator over the entrySet of the map
//        Iterator<Map.Entry<String, Integer>> iterator = phoneBook.entrySet().iterator();

        // Use a while loop to iterate over the map
//        while (iterator.hasNext()) {
//            Map.Entry<String, Integer> entry = iterator.next();
//            String key = entry.getKey();
//            Integer value = entry.getValue();
////            System.out.println("Key: " + key + ", Value: " + value);
//        }
        while(in.hasNext())
        {
            String s=in.nextLine();
            AtomicBoolean existingKey = new AtomicBoolean(false);
            // Using forEach to iterate over the map
            phoneBook.forEach((key, value) -> {
                        if(key.equals(s)){
                            existingKey.set(true);
                            System.out.println(key + " = " + value);
                        }
                    });
            if(existingKey.get() == false){
                System.out.println("Not found");
            }
        }
    }
}