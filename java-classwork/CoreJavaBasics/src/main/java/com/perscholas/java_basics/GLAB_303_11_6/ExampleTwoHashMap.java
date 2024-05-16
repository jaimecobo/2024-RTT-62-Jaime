package com.perscholas.java_basics.GLAB_303_11_6;

import java.util.HashMap;

public class ExampleTwoHashMap {
/*
Create Hashmap and Remove HashMap Elements
Here, we will do multiple things. We will first create a Hashmap. We will then get its values one by one.
After that, we will copy all data of the HashMap to a brand-new HashMap. And finally, we will remove one item and get Hashmap sizes.
If the size is lower by one, the decrease of size by removal is confirmed.
 */
    public static void main(String[] args) {
        HashMap<String, String> newHashMap = new HashMap<>();
//      Addition of key and value
        newHashMap.put("Key1", "Lenovo");
        newHashMap.put("Key2", "Motorola");
        newHashMap.put("Key3", "Nokia");
        newHashMap.put("Key4", null);
        newHashMap.put(null, "Sony");
        System.out.println("Original map contains:" + newHashMap);
//      Getting size of Hashmap
        System.out.println("Size of original Map is:" + newHashMap.size());
//      Copy contains of one Hashmap to another
        HashMap<String, String> copyHashMap = new HashMap<>();
        copyHashMap.putAll(newHashMap);
        System.out.println("copyHashMap mappings= " + copyHashMap);
//      Removal of null key
        String nullKeyValue = copyHashMap.remove(null);
        System.out.println("copyHashMap null key value = " + nullKeyValue);
        System.out.println("copyHashMap after removing null key = " + copyHashMap);
        System.out.println("Size of copyHashMap is:" + copyHashMap.size());
    }

}
