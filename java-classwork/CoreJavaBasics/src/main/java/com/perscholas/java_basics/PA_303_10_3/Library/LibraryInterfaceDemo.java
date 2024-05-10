package com.perscholas.java_basics.PA_303_10_3.Library;

public class LibraryInterfaceDemo {
    public static void main(String[] args) {
        KidUser kid01 = new KidUser();
        System.out.println(kid01.registerAccount(10));
        System.out.println(kid01.requestBook("Kids"));
        System.out.println(kid01.requestBook("Fiction"));
        System.out.println("__________________________________________________");

        KidUser kid02 = new KidUser();
        System.out.println(kid02.registerAccount(18));
        System.out.println("__________________________________________________");


        AdultUser Adult01 = new AdultUser();
        System.out.println(Adult01.registerAccount(5));
        System.out.println("__________________________________________________");

        AdultUser Adult02 = new AdultUser();
        System.out.println(Adult02.registerAccount(23));
        System.out.println(Adult02.requestBook("Fiction"));
        System.out.println(Adult02.requestBook("Kids"));
        System.out.println("__________________________________________________");


    }
}
